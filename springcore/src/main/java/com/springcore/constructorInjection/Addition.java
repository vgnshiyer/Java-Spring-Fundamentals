package com.springcore.constructorInjection;

public class Addition {
    private int a;
    private int b;
    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor: int, int");
    }
    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Constructor: double, double");
    }

    public void sum() {
        System.out.println("Sum : " + (this.a + this.b));
    }
}
