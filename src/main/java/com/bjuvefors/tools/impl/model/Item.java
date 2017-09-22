package com.bjuvefors.tools.impl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Item implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "number")
    private int number;
    @Column(name = "object")
    private int object;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private int price;
    @Column(name = "reduction")
    private double reduction;
    @Column(name = "volume")
    private String volume;
    @Column(name = "type")
    private String type;
    @Column(name = "subType")
    private String subType;
    @Column(name = "alcohol")
    private String alcohol;
    @Column(name = "origin")
    private String origin;
    @Column(name = "country")
    private String country;
    @Column(name = "producer")
    private String producer;
    @Column(name = "date")
    private Date date;

    public Item() {
    }

    public Item(Integer id, int number, int object, String name, int price, double reduction, String volume, String type, String subType, String alcohol, String origin, String country, String producer, Date date) {
        this.id = id;
        this.number = number;
        this.object = object;
        this.name = name;
        this.price = price;
        this.reduction = reduction;
        this.volume = volume;
        this.type = type;
        this.subType = subType;
        this.alcohol = alcohol;
        this.origin = origin;
        this.country = country;
        this.producer = producer;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getObject() {
        return object;
    }

    public void setObject(int object) {
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
