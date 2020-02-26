
public class Simulation {

    int numOfDice;
    int times;
    Bins bins;


    Simulation(int numOfDice, int times){
        this.numOfDice = numOfDice;
        this.times = times;
        this.bins = new Bins(numOfDice, numOfDice*6);
    }

    public static void main(String[] args) {
        Simulation s = new Simulation(2,1000000);
        s.runSimulation();
        s.printResults();
    }

    public void runSimulation(){
        Dice dice = new Dice(numOfDice);
        for(int i=0; i<times; i++){
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults(){
        System.out.println("***");
        System.out.println("Simulation of "+numOfDice+" dice tossed for "+times+" times.");
        System.out.println("***");

        for(int i=numOfDice; i<=numOfDice*6; i++){
            System.out.printf("%2d :%9d: %.2f %s\n",i,bins.getBin(i),(double)bins.getBin(i)/times,printStar(bins.getBin(i)/(times/100)));
        }
    }

    public String printStar(int num){
        StringBuilder s = new StringBuilder();
        for(int i=0; i<num; i++){
            s.append("*");
        }
        return s.toString();
    }

}
