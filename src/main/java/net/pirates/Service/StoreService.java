package net.pirates.Service;

import net.pirates.DTOs.AddHolidayDTO;
import net.pirates.DTOs.AddStoreDTO;
import net.pirates.DTOs.StoreDTO;
import net.pirates.DTOs.StoreDetailDTO;
import net.pirates.Domain.Store;
import net.pirates.Repository.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {

    private final StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public void addStore(AddStoreDTO storeInfo) {
        storeRepository.save(new Store(storeInfo));
    }

    public void addHoliday(AddHolidayDTO holidayDTO) {
    }

    public List<StoreDTO> storeList() {
        List<Store> storeList = storeRepository.findAll();
        List<StoreDTO> storeDTOList_OPEN = new ArrayList<>();
        List<StoreDTO> storeDTOList_CLOSE = new ArrayList<>();
        List<StoreDTO> storeDTOList_HOLIDAY = new ArrayList<>();
        for (Store store : storeList) {
            StoreDTO storeDTO = new StoreDTO(store);

            if (storeDTO.getBusinessStatus().equals("OPEN")) {
                storeDTOList_OPEN.add(storeDTO);
                continue;
            }

            if (storeDTO.getBusinessStatus().equals("CLOSE")) {
                storeDTOList_CLOSE.add(storeDTO);
                continue;
            }

            if (storeDTO.getBusinessStatus().equals("HOLIDAY")) {
                storeDTOList_HOLIDAY.add(storeDTO);
                continue;
            }

        }

        List<StoreDTO> storeDTOListResult = new ArrayList<>();
        storeDTOListResult.addAll(storeDTOList_OPEN);
        storeDTOListResult.addAll(storeDTOList_CLOSE);
        storeDTOListResult.addAll(storeDTOList_HOLIDAY);

        return storeDTOListResult;
    }

    public StoreDetailDTO storeDetail(Long id) {
        return new StoreDetailDTO();
    }

    public void delete(Long id) {
        storeRepository.deleteById(id);
    }
}
