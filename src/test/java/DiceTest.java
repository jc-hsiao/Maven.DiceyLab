import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void diceConstructorTest(){
        int expected = 5;
        Dice d = new Dice(expected);
        int actual = d.numOfDice;
        Assert.assertEquals(expected,actual);
    }
}
