package sortCollection;

import java.util.concurrent.atomic.AtomicInteger;

public class HeapSort extends Sorts {

    public HeapSort(){
        super(new AtomicInteger(0), 0, "Пирамидальная сортировка");
    }

    @Override
    public void doSort(int[] array) {
        long start = System.currentTimeMillis();
        for(int i = array.length / 2 - 1; i >= 0; i--){
            heapHelper(array, array.length, i);
            counter.incrementAndGet();
        }
        for(int i = array.length - 1; i>= 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapHelper(array, i, 0);
            counter.incrementAndGet();
        }
        long end = System.currentTimeMillis();
        this.timer = end - start;
    }

    private void heapHelper(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;
        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapHelper(array, heapSize, largest);
        }
    }
}
