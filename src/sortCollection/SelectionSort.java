package sortCollection;

import java.util.concurrent.atomic.AtomicInteger;

public class SelectionSort extends Sorts {

    public SelectionSort(){
        super(new AtomicInteger(0), 0, "Сортировка выбором");
    }
    @Override
    public void doSort(int[] array) {
        long start = System.nanoTime();
        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[min]){min = j;}
            }
            if(min != i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            counter.incrementAndGet();
        }
        long end = System.nanoTime();
        this.timer = end - start;
    }

}
