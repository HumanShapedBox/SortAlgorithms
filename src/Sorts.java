import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Sorts {

    private AtomicInteger counter = new AtomicInteger();

    public Sorts(){
        this.counter = null;
    }

    public int getCounter(){
       int count = Integer.parseInt(String.valueOf(this.counter));
       return count;
    }

    public void resetCounter(){
        this.counter = null;
    }

    public void bubbleSort(int[] array){
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
    }

    public void selectionSort(int[] array){
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
    }

    public void insertionSort(int[] array){
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
    }

    public void quickSort(int[] array){
        int begin = 0;
        int end = array.length - 1;
        sort(array, begin, end);
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

    public void heapSort(int[] array){
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
    }

    private void heapHelper(int[] array, int heapSize, int rootIndex){
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;
        if(leftChild < heapSize && array[leftChild] > array[largest]){largest = leftChild;}

        if(rightChild < heapSize && array[rightChild] > array[largest]){largest = rightChild;}

        if(largest != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapHelper(array, heapSize, largest);
        }
    }

}
