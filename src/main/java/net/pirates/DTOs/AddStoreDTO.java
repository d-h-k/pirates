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

}
