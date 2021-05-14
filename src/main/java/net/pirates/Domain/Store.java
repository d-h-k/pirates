package net.pirates.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Store {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String owner;
    private String description;
    private Integer level;
    private String address;
    private String phone;
    private String businessTimes;// 수정 필요 SET?? List?
}
