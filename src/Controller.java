import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Controller {
    public AtomicInteger counter = new AtomicInteger();
    //time
    // chooseYourFighter
    // comparator
    protected int[] smallArr = new int[50];
    protected int[] bigArr = new int[15000];

    Sorts sorts = new Sorts();

    private void fillArr(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = new Random().nextInt(101);
        }
    }
    private int[] getSmallArray(){
        fillArr(smallArr);
        return this.smallArr;
    }

    private int[] getBigArray(){
        fillArr(bigArr);
        return this.bigArr;
    }

    private void printArray(){
        for (int element: this.smallArr) {
            System.out.printf("%d ", element);
        }
        System.out.println();
    }
    public void start(){
        getSmallArray();
        getBigArray();
        printArray();
        sorts.quickSort(smallArr);
        printArray();
    }




}
