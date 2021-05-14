package net.pirates.Controller;

import net.pirates.DTOs.AddHolidayDTO;
import net.pirates.DTOs.AddStoreDTO;
import net.pirates.DTOs.StoreDTO;
import net.pirates.Service.StoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping("/stores")
    public void addStore(@RequestBody AddStoreDTO storeInfo) {
        storeService.addStore(storeInfo);
    }

    @PostMapping("/holidays")
    public void addHoliday(@RequestBody AddHolidayDTO holidayDTO) {
        storeService.addHoliday(holidayDTO);
    }

    @GetMapping("/stores")
    public List<StoreDTO> storeList() {
        return storeService.storeList();
    }

}
