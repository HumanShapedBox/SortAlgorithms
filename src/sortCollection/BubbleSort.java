package sortCollection;

public class BubbleSort extends Sorts {

    public BubbleSort(){
        super(null, 0, "Пузырьковая сортировка");
    }

    public void resetCounter(){
        this.counter = null;
    }

    @Override
    public String sortName() {
        return this.name;
    }

    @Override
    public int getCounter() {
        try{
            return Integer.parseInt(String.valueOf(this.counter));
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
        long end = System.currentTimeMillis();
        this.timer = end - start;
    }
}
