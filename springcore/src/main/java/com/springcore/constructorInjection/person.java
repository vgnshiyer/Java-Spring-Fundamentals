package com.springcore.constructorInjection;

public class person {
    private String name;
    private int id;
    public person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return this.name + " : " + this.id;
    }

    
}
