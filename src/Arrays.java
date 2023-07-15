import java.util.Random;

public class Arrays {
    protected int[] smallArr = new int[50];
    protected int[] bigArr = new int[15000];

    private void fillArr(int[] array){
        for(int i = 0; i <= array.length; i++){
            array[i] = new Random().nextInt();
        }
    }
    public int[] getSmallArray(){
        fillArr(smallArr);
        return this.smallArr;
    }

    public int[] getBegArray(){
        fillArr(bigArr);
        return this.bigArr;
    }
}
