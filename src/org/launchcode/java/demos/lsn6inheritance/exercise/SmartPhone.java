package org.launchcode.java.demos.lsn6inheritance.exercise;

public class SmartPhone extends Computer{
    private String brand;

    public SmartPhone(String os,String cpu,String gpu, String brand){
        super(os,cpu,gpu);
        this.brand = brand;
    }

    @Override
    public void print(){
        System.out.println("I am a smartphone");
    }

    public String getBrand() {
        return brand;
    }

}
