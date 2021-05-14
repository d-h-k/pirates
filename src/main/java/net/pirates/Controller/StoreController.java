package net.pirates.Controller;

import net.pirates.DTOs.AddStoreDTO;
import net.pirates.Service.StoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping("/add")
    public void addstore(@RequestBody AddStoreDTO storeInfo) {
        storeService.addstore(storeInfo);
    }

}
