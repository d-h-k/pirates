package net.pirates.Domain;

import net.pirates.DTOs.AddStoreDTO;

import javax.persistence.*;
import java.util.List;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String owner;
    private String description;
    private Integer level;
    private String address;
    private String phone;

    @OneToMany(mappedBy = "store")
    private List<BusinessTime> businessTimes;

    public Store(AddStoreDTO storeInfo) {
        this.name = storeInfo.getName();
        this.owner = storeInfo.getOwner();
        this.description = storeInfo.getDescription();
        this.level = storeInfo.getLevel();
        this.address = storeInfo.getAddress();
        this.phone = storeInfo.getPhone();
        this.businessTimes = storeInfo.getBusinessTimes();
    }

    public Store() {

    }

    public Store(Long id, String name, String owner, String description, Integer level, String address, String phone, List<BusinessTime> businessTimes) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.description = description;
        this.level = level;
        this.address = address;
        this.phone = phone;
        this.businessTimes = businessTimes;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
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

    public List<BusinessTime> getBusinessTimes() {
        return businessTimes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBusinessTimes(List<BusinessTime> businessTimes) {
        this.businessTimes = businessTimes;
    }
}
