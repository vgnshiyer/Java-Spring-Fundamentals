package com.springcore.auto.wire;

public class Employee {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee() {
        super();
    }

    public Employee(Address address) {
        this.address = address;
        System.out.println("Inside constructor");
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + "]";
    }
}
