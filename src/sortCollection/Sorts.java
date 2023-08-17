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

}
