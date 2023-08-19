package sortCollection;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Sorts implements GetSortData {

    protected AtomicInteger counter;
    protected final String name;
    protected long timer;

    public Sorts(AtomicInteger counter, long timer, String name){
        this.counter = counter;
        this.timer = timer;
        this.name = name;
    }

    @Override
    public String sortName() {
        return this.name;
    }

    @Override
    public int getCounter() {
        try{
            return Integer.parseInt(String.valueOf(this.counter));
        }catch (NumberFormatException e){
            return 0;
        }
    }

    @Override
    public void resetCounter() {this.counter.set(0);}

    @Override
    public long getTimer() {
        return this.timer;
    }


}
