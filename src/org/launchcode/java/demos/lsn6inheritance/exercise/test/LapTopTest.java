package org.launchcode.java.demos.lsn6inheritance.exercise.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.exercise.Laptop;

public class LapTopTest {
    Laptop macBookPro16;
    
    @Before
    public void createMacBook(){
        macBookPro16 = new Laptop("Big Sur","10-core CPU","32-core GPU","Apple");
    }

    @Test
    public void osTest(){
        Assert.assertEquals("Big Sur",macBookPro16.getOs());
    }

    @Test
    public void cpuTest(){
        Assert.assertEquals("10-core CPU",macBookPro16.getCpu());
    }

    @Test
    public void gpuTest(){
        Assert.assertEquals("32-core GPU",macBookPro16.getGpu());
    }

    @Test
    public void brandTest(){
        Assert.assertEquals("Apple",macBookPro16.getBrand());
    }


}
