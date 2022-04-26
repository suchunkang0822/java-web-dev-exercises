package org.launchcode.java.demos.lsn6inheritance;

import org.junit.Assert;
import org.junit.Test;


public class CatTest {

    @Test
    public void inheritsSuperInFirstConstructor(){
        HouseCat ken = new HouseCat("Ken",12);
        Assert.assertEquals(12,ken.getWeight(),.001);
    }
}
