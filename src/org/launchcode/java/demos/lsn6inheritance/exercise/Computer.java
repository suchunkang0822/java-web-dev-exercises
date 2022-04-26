package org.launchcode.java.demos.lsn6inheritance.exercise;

public class Computer extends AbstractEntity{
    private String os;
    private String cpu;
    private String gpu;

    public Computer(String os,String cpu,String gpu){
        this.os = os;
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public void print(){
        System.out.println("I am a computer");
    }

    public String getOs() {
        return os;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }
}
