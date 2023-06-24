package com.springcore.auto.wire;

import org.springframework.beans.facory.annotation.Autowired
import org.springframework.beans.facory.annotation.Qualifier

public class Employee {
    @Autowired
    @Qualifier("address1") // to distinguish between multiple beans of the same type
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
