package net.pirates.Service;

import net.pirates.DTOs.AddHolidayDTO;
import net.pirates.DTOs.AddStoreDTO;
import net.pirates.DTOs.StoreDTO;
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
    }

    public void addHoliday(AddHolidayDTO holidayDTO) {
    }

    public List<StoreDTO> storeList() {
        return new ArrayList<>();
    }
}
