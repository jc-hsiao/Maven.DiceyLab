import java.util.HashMap;
import java.util.Map;

public class Bins {

    Map<Integer,Integer> m = new HashMap<>();

    public Bins(int min, int max){
        for(int i=min; i<=max ; i++)
            m.put(i,0);
    }

    public void incrementBin(int num){
        m.replace(num, m.get(num)+1);
    }

}
