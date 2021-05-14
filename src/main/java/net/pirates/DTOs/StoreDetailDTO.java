package net.pirates.DTOs;

import net.pirates.Domain.Store;

import java.util.ArrayList;
import java.util.List;

public class StoreDetailDTO {
    private Long id;
    private String name;
    private String description;
    private Integer level;
    private String address;
    private String phone;
    private List<BusinessSubDTO> businessDays;

    public StoreDetailDTO(Store store) {
        this.id = store.getId();
        this.name = store.getName();
        this.description = store.getDescription();
        this.level = store.getLevel();
        this.address = store.getAddress();
        this.phone = store.getPhone();
        this.businessDays = new ArrayList<>();//store.getBusinessTimes();
        //@TODO 비지니스데이 구현해야함
    }

}
