import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunTestBangQuyetDinh {

    @Test
    public void Test1() {
        Assert.assertEquals("Invalid Input",Run.pasOrFail(-1,-1));
    }
    @Test
    public void Test2() {
        Assert.assertEquals("Invalid Input",Run.pasOrFail(-1,5));
    }
    @Test
    public void Test3() {
        Assert.assertEquals("Invalid Input",Run.pasOrFail(-1,501000));
    }
    @Test
    public void Test4() {
        Assert.assertEquals("Invalid Input",Run.pasOrFail(0,-1));
    }
    @Test
    public void Test5() {
        Assert.assertEquals("Gia tien sai",Run.pasOrFail(0,5));
    }
    @Test
    public void Test6() {
        Assert.assertEquals("Invalid Input",Run.pasOrFail(0,501000));
    }
    @Test
    public void Test7() {
        Assert.assertEquals("Invalid Input",Run.pasOrFail(5,-1));
    }
    @Test
    public void Tes8t() {
        Assert.assertEquals("Gia tien sai",Run.pasOrFail(5,8));
    }
    @Test
    public void Test9() {
        Assert.assertEquals("Invalid Input",Run.pasOrFail(5,501000));
    }
    @Test
    public void Test10() {
        Assert.assertEquals("Invalid Input",Run.pasOrFail(501000,-1));
    }
    @Test
    public void Test11() {
        Assert.assertEquals("Invalid Input",Run.pasOrFail(501000,8));
    }
    @Test
    public void Test12() {
        Assert.assertEquals("Invalid Input",Run.pasOrFail(501000,501000));
    }
    @Test
    public void Test13() {
        Assert.assertEquals("Khong giam",Run.pasOrFail(0,0));
    }
    @Test
    public void Test14() {
        Assert.assertEquals("Khong giam",Run.pasOrFail(500,500));
    }
    @Test
    public void Test15() {
        Assert.assertEquals("5%",Run.pasOrFail(850,800));
    }
    @Test
    public void Test16() {
        Assert.assertEquals("10%",Run.pasOrFail(850,700));
    }
    @Test
    public void Test17() {
        Assert.assertEquals("20%",Run.pasOrFail(850,600));
    }
    @Test
    public void Test18() {
        Assert.assertEquals("30%",Run.pasOrFail(850,400));
    }
}