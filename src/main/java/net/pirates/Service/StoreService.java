package net.pirates.Service;

import net.pirates.DTOs.*;
import net.pirates.Domain.Store;
import net.pirates.Repository.StoreRepository;
import net.pirates.exception.ElementNotFoundException;
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
        Store addStore = new Store(storeInfo);
        storeRepository.save(addStore);
    }

    public void addHoliday(AddHolidayDTO holidayDTO) {

        // 추가
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
        Store store = storeRepository.findById(id).orElseThrow(() -> new ElementNotFoundException());
        return new StoreDetailDTO(store);
    }

    public ResponseDTO delete(Long id) {
        Long beforeDelete = storeRepository.count();
        storeRepository.deleteById(id);
        Long afterDelete = storeRepository.count();
        if ((afterDelete + 1) == beforeDelete) {
            return ResponseDTO.SuccessStatus();
        }
        //@Todo 삭제에 실패한다면 여기에 도달하지 못하는 문제가 있음
        return ResponseDTO.FailStatus();
    }
}
