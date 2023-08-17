import java.text.ParseException;

public class SelectionSort extends Sorts{

    private String name;
    public SelectionSort(){
        super(null, 0);
        this.name = "Сортировка выбором";
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
    public void resetCounter() {this.counter = null;}

    @Override
    public long getTimer() {
        return this.timer;
    }

    @Override
    public void doSort(int[] array) {
        long start = System.currentTimeMillis();
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
        long end = System.currentTimeMillis();
        this.timer = end - start;
    }

}
