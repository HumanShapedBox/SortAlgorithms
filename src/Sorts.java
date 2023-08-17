import java.util.concurrent.atomic.AtomicInteger;

public abstract class Sorts implements GetSortData{

    protected AtomicInteger counter;
    protected long timer;

    public Sorts(AtomicInteger counter, long timer){
        this.counter = counter;
        this.timer = timer;
    }

}
