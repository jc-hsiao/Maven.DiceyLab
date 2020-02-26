import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void binConstructTest(){
        Bins b = new Bins(2,7);
        int actual = b.getBin(2);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void incrementBinTest(){
        Bins b = new Bins(2,7);
        b.incrementBin(5);
        int actual = 1;
        int expected = b.getBin(5);
        Assert.assertEquals(expected,actual);
    }


}
