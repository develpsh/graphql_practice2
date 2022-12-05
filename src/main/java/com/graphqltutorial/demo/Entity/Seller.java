package com.graphqltutorial.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Seller extends BaseEntity{
    private String name;
    private String address;
}
