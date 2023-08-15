import java.util.Random;
import java.util.Scanner;

public class SortAnalyse {

    private int operations;
    private float time;

    Sorts sorts = new Sorts();


    public SortAnalyse(){
        this.operations = 0;
        this.time = 0;
    }

    public int getOperationsNum(){
        return this.operations;
    }

    public float getTime(){
        return this.time;
    }

    public void setOperationsNum(int num){
        this.operations = sorts.getCounter();
    }

    public void setTime(float time){
        this.time = time; //То же, что и в операции
    }

    private void compareSorts(){

    }


}
