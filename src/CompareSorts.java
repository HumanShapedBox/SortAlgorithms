import sortCollection.Sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareSorts {

    ArrayList<Sorts> array;

    public CompareSorts(ArrayList<Sorts> data){
        this.array = data;
    }

    public ArrayList<Sorts> getWinner(){
        return this.array;
    }

    private void winner(){
        Collections.sort(
                this.array,
                (t0, t1) -> {
                    if (t0.getTimer() > t1.getTimer())
                        return 1;
                    if (t0.getTimer() < t1.getTimer())
                        return -1;
                    if(t0.getTimer() == t1.getTimer()){
                        return t0.getCounter() - t1.getCounter();
                    }
                    return 0;
                });
    }
}
