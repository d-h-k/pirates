package net.pirates.DTOs;

import net.pirates.Domain.Store;

public class StoreDTO {
    private String name;
    private String description;
    private int level;
    private String businessStatus;

    public StoreDTO(Store store) {
        this.name = store.getName();
        this.description = store.getDescription();
        this.level = store.getLevel();
        this.businessStatus = "OPEN";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    @Override
    public String toString() {
        return "StoreDTO{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", level=" + level +
                ", businessStatus='" + businessStatus + '\'' +
                '}';
    }
}
