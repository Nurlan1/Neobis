package com.nurlan.pojo;
//For the model of the car like Civic, Camry, LX470, Fit etc.
public class Model {
    private Integer id;
    private String Name;

    private Make make;

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }
    public void setMakeId(Make makeId) {
        this.make = make;
    }





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



}
