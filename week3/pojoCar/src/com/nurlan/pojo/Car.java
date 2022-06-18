package com.nurlan.pojo;
//Selling prouduct information in this case it's a CAR(automobile)
public class Car {
    private Integer id;
    private Integer modelId;
    private String vin;
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getModelId() {
        return modelId;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", modelId=" + modelId +
                ", vin='" + vin + '\'' +
                ", type=" + type +
                ", color='" + color + '\'' +
                ", statusId=" + statusId +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    private Integer statusId;
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getStatus() {
        return statusId;
    }

    public void setStatus(Integer status) {
        this.statusId = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;


}
