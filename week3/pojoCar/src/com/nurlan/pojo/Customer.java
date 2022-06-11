package com.nurlan.pojo;
// Customer information
public class Customer {
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Customer(){
    }

    public Customer(long id, String firstName, String lastName, String phoneNumber, String address){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void setID(long ID) {
        this.id = id;
    }

    public long getID() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}