package com.nurlan.pojo;
//Status of the car (Sold, Pending, In sale)
public class Status {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
