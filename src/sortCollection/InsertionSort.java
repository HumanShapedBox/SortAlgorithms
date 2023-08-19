package sortCollection;

import java.util.concurrent.atomic.AtomicInteger;

public class InsertionSort extends Sorts {

    public InsertionSort(){
        super(new AtomicInteger(0), 0, "Сортировка вставками");
    }

    @Override
    public void doSort(int[] array) {
        long start = System.nanoTime();
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                counter.incrementAndGet();
            }
            counter.incrementAndGet();
        }
        long end = System.nanoTime();
        this.timer = end - start;
    }
}
