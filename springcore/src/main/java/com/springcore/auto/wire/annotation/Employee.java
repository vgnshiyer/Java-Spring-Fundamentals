package com.springcore.auto.wire;

import org.springframework.beans.facory.annotation.Autowired

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

    @Autowired
    public Employee(Address address) {
        this.address = address;
        System.out.println("Inside constructor");
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + "]";
    }
}
