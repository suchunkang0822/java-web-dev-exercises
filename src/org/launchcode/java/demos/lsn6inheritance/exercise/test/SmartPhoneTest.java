package org.launchcode.java.demos.lsn6inheritance.exercise.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.exercise.Computer;
import org.launchcode.java.demos.lsn6inheritance.exercise.Laptop;
import org.launchcode.java.demos.lsn6inheritance.exercise.SmartPhone;

public class SmartPhoneTest{
    SmartPhone iphone13;

    @Before
    public void createIPhone13(){
        iphone13 = new SmartPhone("IOS 15","10-core CPU","32-core GPU","Apple");
    }

    @Test
    public void osTest(){
        Assert.assertEquals("IOS 15",iphone13.getOs());
    }

    @Test
    public void cpuTest(){
        Assert.assertEquals("10-core CPU",iphone13.getCpu());
    }

    @Test
    public void gpuTest(){
        Assert.assertEquals("32-core GPU",iphone13.getGpu());
    }

    @Test
    public void brandTest(){
        Assert.assertEquals("Apple",iphone13.getBrand());
    }
}
