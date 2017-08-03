package junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 000284 on 2017/2/6.
 */
public class JunitTest {
    @Test
    public void testadd(){
        int b = CoverageTest.testadd(5, 20);
        Assert.assertEquals(b,50);
    }


}