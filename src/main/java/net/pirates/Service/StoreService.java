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
        return new ArrayList<>();
    }

    public StoreDetailDTO storeDetail(Long id) {
        return new StoreDetailDTO();
    }

    public void delete(Long id) {
    }
}
