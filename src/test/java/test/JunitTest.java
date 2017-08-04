package test;

import org.junit.Assert;
import org.junit.Test;

import junit.CoveragePlay;


/**
 * Created by 000284 on 2017/2/6.
 */
public class JunitTest {
    @Test
    public void testadd(){
        int b = CoveragePlay.testadd(5, 20);
        Assert.assertEquals(b,50);
    }
    @Test
    public void testadd1(){
        int c = CoveragePlay.testadd(10, 20);
        Assert.assertEquals(c, 30);
    }
}