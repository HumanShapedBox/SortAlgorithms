package sortCollection;

public interface GetSortData {
    String sortName();
    int getCounter();
    long getTimer();
    void doSort(int[] array);
    void resetCounter();
}
