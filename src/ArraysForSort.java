import java.util.Random;

public class ArraysForSort {

    private int[] smallArr;
    private int[] bigArr;

    public ArraysForSort(){
        this.smallArr = new int[50];
        this.bigArr = new int[15000];
    }

    public int[] getSmallArray(){
        fillArr(smallArr);
        return this.smallArr;
    }

    public int[] getBigArray(){
        fillArr(bigArr);
        return this.bigArr;
    }
    private void fillArr(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = new Random().nextInt(101);
        }
    }

    private void printArray(){
        for (int element: this.smallArr) {
            System.out.printf("%d ", element);
        }
        System.out.println();
    }
}
