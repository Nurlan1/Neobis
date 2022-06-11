package com.nurlan.pojo;
//Selling prouduct information in this case it's a CAR(automobile)
public class Car {
    private Integer id;
    private Model model;
    private String vin;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    private Status status;
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

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model=" + model +
                ", vin='" + vin + '\'' +
                ", color='" + color + '\'' +
                ", status=" + status +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
