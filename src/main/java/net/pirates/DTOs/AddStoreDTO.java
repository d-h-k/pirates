package net.pirates.DTOs;

import net.pirates.Domain.BusinessTime;

import java.util.List;

public class AddStoreDTO {

    private String name;
    private String owner;
    private String description;
    private int level;
    private String address;
    private String phone;
    private List<BusinessTime> businessTimes;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<BusinessTime> getBusinessTimes() {
        return businessTimes;
    }

    public void setBusinessTimes(List<BusinessTime> businessTimes) {
        this.businessTimes = businessTimes;
    }
}
