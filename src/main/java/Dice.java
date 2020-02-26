import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    public int numOfDice;

    public Dice(int numOfDice){
        this.numOfDice = numOfDice;
    }

    public int tossAndSum(){
        int sum = 0;
        for(int i = 0; i < numOfDice; i++)
            sum += ThreadLocalRandom.current().nextInt(1,7);
        return sum;
    }


}
