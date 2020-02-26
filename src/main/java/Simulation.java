public class Simulation {
    int numOfDice;
    int times;


    Simulation(int numOfDice, int times){
        this.numOfDice = numOfDice;
        this.times = times;
    }

    public void runSimulation(){
        Dice dice = new Dice(numOfDice);
        Bins bins = new Bins(numOfDice,numOfDice*6);

        for(int i=0; i<times; i++){
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults(){

    }


}
