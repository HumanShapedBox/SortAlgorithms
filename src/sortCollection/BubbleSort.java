package sortCollection;

import java.util.concurrent.atomic.AtomicInteger;

public class BubbleSort extends Sorts {

    public BubbleSort(){
        super(new AtomicInteger(0), 0, "Пузырьковая сортировка");
    }

    @Override
    public void doSort(int[] array) {
        long start = System.nanoTime();
        boolean needSort;
        do{
            needSort = false;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    needSort = true;
                }
                counter.incrementAndGet();
            }
        }while (needSort);
        long end = System.nanoTime();
        this.timer = end - start;
    }
}
