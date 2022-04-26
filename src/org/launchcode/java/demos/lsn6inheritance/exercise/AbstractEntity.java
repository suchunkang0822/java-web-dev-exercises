package org.launchcode.java.demos.lsn6inheritance.exercise;

public abstract class AbstractEntity {
    private int id;

    public abstract void print();

    public void generateId(){
        id = (int)(Math.floor(Math.random()*100+1));
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Computer a = new Computer("Big Sur","10-core CPU","32-core GPU");
        a.generateId();
        System.out.println(a.getId());
        a.print();

        Laptop b = new Laptop("Big Sur","10-core CPU","32-core GPU","Apple");
        b.generateId();
        System.out.println(b.getId());
        b.print();

        SmartPhone c = new SmartPhone("Big Sur","10-core CPU","32-core GPU","Apple");
        c.generateId();
        System.out.println(c.getId());
        c.print();

    }
}
