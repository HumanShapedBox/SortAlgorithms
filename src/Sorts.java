public class Sorts {

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
            }
        }while (needSort);
    }

    public void selectionSort(int[] array){
            for(int i = 0; i < array.length; i++){
                int min = i;
                for(int j = i+1; j < array.length; j++){
                    if(array[j] < min){min = j;}
                }
                if(min != i){
                    int temp = array[i];
                    array[i] = array[min];
                    array[min] = temp;
                }
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
            }
        }
    }

    public void quickSort(int[] array, int start, int end){
        int leftPos = start;
        int rightPos = end;
        int pivot = array[(start + end) / 2];
        do{
            while (array[leftPos] < pivot){leftPos++;}
            while (array[rightPos] > pivot){rightPos++;}
            if(leftPos <= rightPos){
                int temp = array[leftPos];
                array[leftPos] = array[rightPos];
                array[rightPos] = temp;
            }
            leftPos++;
            rightPos++;
        } while (leftPos <= rightPos);
        if(leftPos < end){quickSort(array, leftPos, end);}
        if(start < rightPos){quickSort(array, start, rightPos);}
    }

    public void heapSort(int[] array, int heapSize, int rootIndex){
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if(leftChild < heapSize && array[leftChild] > array[largest]){largest = leftChild;}

        if(rightChild < heapSize && array[rightChild] > array[largest]){largest = rightChild;}

        if(largest != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapSort(array, heapSize, largest);
        }
    }
}
