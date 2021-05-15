package net.pirates.Controller;

import net.pirates.DTOs.*;
import net.pirates.Service.StoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static net.pirates.DTOs.ResponseDTO.SuccessStatus;

@RestController
@RequestMapping("/store")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping
    public ResponseDTO addStore(@RequestBody AddStoreDTO storeInfo) {
        storeService.addStore(storeInfo);
        return SuccessStatus();
    }

    @PostMapping("/holidays")
    public ResponseDTO addHoliday(@RequestBody AddHolidayDTO holidayDTO) {
        storeService.addHoliday(holidayDTO);
        return SuccessStatus();
    }

    @GetMapping
    public List<StoreDTO> storeList() {
        return storeService.storeList();
    }

    @GetMapping("/detail")
    public StoreDetailDTO storeDetail(@RequestParam Long id) {
        return storeService.storeDetail(id);
    }


    @PostMapping("/delete")
    public void storeDelete(@RequestBody Long id) {
        storeService.delete(id);
    }


}
