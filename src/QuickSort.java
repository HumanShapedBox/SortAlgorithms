public class QuickSort extends Sorts{

    private String name;

    public QuickSort(){
        super(null, 0);
        this.name = "Быстрая сортировка";
    }
    @Override
    public String sortName() {
        return this.name;
    }

    @Override
    public int getCounter() {
        try{
            int count = Integer.parseInt(String.valueOf(this.counter));
            return count;
        }catch (NumberFormatException e){
            return 0;
        }
    }

    @Override
    public long getTimer() {
        return this.timer;
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

    @Override
    public void resetCounter() {
        this.counter = null;
    }
}
