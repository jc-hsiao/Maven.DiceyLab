import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class DiceTest {
    @Test
    public void diceConstructorTest(){
        int expected = 5;
        Dice d = new Dice(expected);
        int actual = d.numOfDice;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void tossAndSumTest(){
        Dice d = new Dice(2);
        int actual = d.tossAndSum();
        Assert.assertTrue(actual>=2);
        Assert.assertTrue(actual<=12);

    }
}
