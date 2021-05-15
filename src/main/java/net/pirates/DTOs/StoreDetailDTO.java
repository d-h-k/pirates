package net.pirates.DTOs;

import net.pirates.Domain.Store;

import java.util.ArrayList;
import java.util.List;

public class StoreDetailDTO {
    private final Long id;
    private final String name;
    private final String description;
    private final Integer level;
    private final String address;
    private final String phone;
    private final List<BusinessSubDTO> businessDays;

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

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getLevel() {
        return level;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public List<BusinessSubDTO> getBusinessDays() {
        return businessDays;
    }

    @Override
    public String toString() {
        return "StoreDetailDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", level=" + level +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", businessDays=" + businessDays +
                '}';
    }
}
