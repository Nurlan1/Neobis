package com.nurlan.pojo;
import java.util.*;
//For purchases information about customer, price it was sold etc.
public class Purchase {
    private Integer id;
    private Integer customerId;

    private Integer carId;

    private Date date;
    private Status statusId;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatusId() {
        return statusId;
    }

    public void setStatusId(Status statusId) {
        this.statusId = statusId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", carId=" + carId +
                ", date=" + date +
                ", statusId=" + statusId +
                ", price=" + price +
                '}';
    }
}
