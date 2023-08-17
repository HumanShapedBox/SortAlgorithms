import sortCollection.Sorts;

public class SortAnalyse {

    private int operations;
    private float time;

    Sorts sorts;


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

    public void setOperationsNum(){
        this.operations = sorts.getCounter();
    }

    public void setTime(){
        this.time = sorts.getTimer();
    }

    private void compareSorts(){

    }


}
