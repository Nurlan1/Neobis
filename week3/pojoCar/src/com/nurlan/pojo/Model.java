package com.nurlan.pojo;
//For the model of the car like Civic, Camry, LX470, Fit etc.
public class Model {
    private Integer id;
    private String Name;

    private Integer makeId;

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", makeId=" + makeId +
                '}';
    }

    public void setMakeId(Integer makeId) {
        this.makeId = makeId;
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
