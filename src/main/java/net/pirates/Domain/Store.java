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
}
