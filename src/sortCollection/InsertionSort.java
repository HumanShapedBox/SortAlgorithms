package sortCollection;

public class InsertionSort extends Sorts {

    public InsertionSort(){
        super(null, 0, "Сортировка вставками");
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
        long end = System.currentTimeMillis();
        this.timer = end - start;
    }

    @Override
    public void resetCounter() {
        this.counter = null;
    }
}
