package org.launchcode.java.demos.lsn6inheritance.exercise.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.exercise.Computer;

public class ComputerTest {
    Computer mac27;

    @Before
    public void createMac(){
        mac27 = new Computer("Big Sur","10-core CPU","32-core GPU");
    }

    @Test
    public void osTest(){
        Assert.assertEquals("Big Sur",mac27.getOs());
    }

    @Test
    public void cpuTest(){
        Assert.assertEquals("10-core CPU",mac27.getCpu());
    }

    @Test
    public void gpuTest(){
        Assert.assertEquals("32-core GPU",mac27.getGpu());
    }



}
