import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunTestBien {

    @Test
    public void Test1() {
        Assert.assertEquals("Khong giam",Run.pasOrFail(0,0));
    }
    @Test
    public void Test2(){
        Assert.assertEquals("Gia tien sai",Run.pasOrFail(0,1));
    }
    @Test
    public void Test3(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(0,-1));
    }
    @Test
    public void Test4(){
        Assert.assertEquals("Gia tien sai",Run.pasOrFail(0,250000));
    }
    @Test
    public void Test5(){
        Assert.assertEquals("Gia tien sai",Run.pasOrFail(0,499999));
    }
    @Test
    public void Test6(){
        Assert.assertEquals("Gia tien sai",Run.pasOrFail(0,500000));
    }
    @Test
    public void Test7(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(0,500001));
    }
    @Test
    public void Test8(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(-1,0));
    }
    @Test
    public void Test9(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(-1,1));
    }
    @Test
    public void Test10(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(-1,-1));
    }
    @Test
    public void Test11(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(-1,250000));
    }
    @Test
    public void Test12(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(-1,499999));
    }
    @Test
    public void Test13(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(-1,500000));
    }
    @Test
    public void Test14(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(-1,500001));
    }
    @Test
    public void Test15(){
        Assert.assertEquals("30%",Run.pasOrFail(1,0));
    }
    @Test
    public void Test16(){
        Assert.assertEquals("Khong giam",Run.pasOrFail(1,1));
    }
    @Test
    public void Test17(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(1,-1));
    }
    @Test
    public void Test18(){
        Assert.assertEquals("Gia tien sai",Run.pasOrFail(1,250000));
    }
    @Test
    public void Test19(){
        Assert.assertEquals("Gia tien sai",Run.pasOrFail(1,499999));
    }
    @Test
    public void Test20(){
        Assert.assertEquals("Gia tien sai",Run.pasOrFail(1,500000));
    }
    @Test
    public void Test21(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(1,500001));
    }
    @Test
    public void Test22(){
        Assert.assertEquals("30%",Run.pasOrFail(250000,0));
    }
    @Test
    public void Test23(){
        Assert.assertEquals("30%",Run.pasOrFail(250000,1));
    }
    @Test
    public void Test24(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(250000,-1));
    }
    @Test
    public void Test25(){
        Assert.assertEquals("Khong giam",Run.pasOrFail(250000,250000));
    }
    @Test
    public void Test26(){
        Assert.assertEquals("Gia tien sai",Run.pasOrFail(250000,499999));
    }
    @Test
    public void Test27(){
        Assert.assertEquals("Gia tien sai",Run.pasOrFail(250000,500000));
    }
    @Test
    public void Test28(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(250000,500001));
    }
    @Test
    public void Test29(){
        Assert.assertEquals("30%",Run.pasOrFail(499999,0));
    }
    @Test
    public void Test30(){
        Assert.assertEquals("30%",Run.pasOrFail(499999,1));
    }
    @Test
    public void Test31(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(499999,-1));
    }
    @Test
    public void Test32(){
        Assert.assertEquals("30%",Run.pasOrFail(499999,250000));
    }
    @Test
    public void Test33(){
        Assert.assertEquals("Khong giam",Run.pasOrFail(499999,499999));
    }
    @Test
    public void Test34(){
        Assert.assertEquals("Gia tien sai",Run.pasOrFail(499999,500000));
    }
    @Test
    public void Test35(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(499999,500001));
    }
    @Test
    public void Test36(){
        Assert.assertEquals("30%",Run.pasOrFail(500000,0));
    }
    @Test
    public void Test37(){
        Assert.assertEquals("30%",Run.pasOrFail(500000,1));
    }
    @Test
    public void Test38(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(500000,-1));
    }
    @Test
    public void Test39(){
        Assert.assertEquals("30%",Run.pasOrFail(500000,250000));
    }
    @Test
    public void Test40(){
        Assert.assertEquals("Khong giam",Run.pasOrFail(500000,499999));
    }
    @Test
    public void Test41(){
        Assert.assertEquals("Khong giam",Run.pasOrFail(500000,500000));
    }
    @Test
    public void Test42(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(500000,500001));
    }
    @Test
    public void Test43(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(500001,0));
    }
    @Test
    public void Test44(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(500001,1));
    }
    @Test
    public void Test45(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(500001,-1));
    }
    @Test
    public void Test46(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(500001,250000));
    }
    @Test
    public void Test47(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(500001,499999));
    }
    @Test
    public void Test48(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(500001,500000));
    }
    @Test
    public void Test49(){
        Assert.assertEquals("Invalid Input",Run.pasOrFail(500001,500001));
    }
}