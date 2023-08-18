package sortCollection;

import java.util.concurrent.atomic.AtomicInteger;

public class QuickSort extends Sorts {

    public QuickSort(){
        super(new AtomicInteger(0), 0, "Быстрая сортировка");
    }

    @Override
    public void doSort(int[] array) {
        long start = System.currentTimeMillis();
        int begin = 0;
        int end = array.length - 1;
        sort(array, begin, end);
        long endTime = System.currentTimeMillis();
        this.timer = endTime - start;
    }
    private void sort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            sort(arr, begin, partitionIndex-1);
            sort(arr, partitionIndex+1, end);
        }
    }
    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
            counter.incrementAndGet();
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
