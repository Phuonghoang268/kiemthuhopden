import org.junit.Assert;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunTestkiemthudongdulieu {
    @Test
    public void Test1() {
        Assert.assertEquals("Khong giam", Run.pasOrFail(500, 500));
    }
    @Test
    public void Test2() {
        Assert.assertEquals("5%",Run.pasOrFail(850,800));
    }
    @Test
    public void Test3() {
        Assert.assertEquals("10%",Run.pasOrFail(850,700));
    }
    @Test
    public void Test4() {
        Assert.assertEquals("20%",Run.pasOrFail(850,600));
    }
    @Test
    public void Test5() {
        Assert.assertEquals("30%",Run.pasOrFail(850,400));
    }
}