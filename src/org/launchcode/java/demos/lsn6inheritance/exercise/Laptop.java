package org.launchcode.java.demos.lsn6inheritance.exercise;

public class Laptop extends Computer {
    private String brand;

    public Laptop(String os, String cpu, String gpu,String brand) {
        super(os, cpu, gpu);
        this.brand = brand;
    }

    @Override
    public void print(){
        System.out.println("I am a lap top");
    }

    public String getBrand() {
        return brand;
    }
}
