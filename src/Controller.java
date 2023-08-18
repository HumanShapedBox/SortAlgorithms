import sortCollection.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArraysForSort arr = new ArraysForSort();
    ArrayList<Sorts> sortedData;

    public void smallSortBattle(){
        int sortNum = chooseSort();
        ArrayList<Sorts> data = new ArrayList<>();
        data.add(startSmallSort(sortNum));
        sortNum = chooseSort();
        data.add(startSmallSort(sortNum));
        CompareSorts cmp = new CompareSorts(data);
        this.sortedData = cmp.getWinner();
    }

    public void bigSortBattle(){
        int sortNum = chooseSort();
        ArrayList<Sorts> data = new ArrayList<>();
        data.add(startBigSort(sortNum));
        sortNum = chooseSort();
        data.add(startBigSort(sortNum));
        CompareSorts cmp = new CompareSorts(data);
        this.sortedData = cmp.getWinner();
    }

    public void smallResults(){
        System.out.println("Итоги сортировки небольших массивов");
        for (Sorts data: this.sortedData) {
            System.out.printf("%s\nКоличество операций: %d\nЗатраченное время: %f\n",
                    data.sortName(), data.getCounter(), data.getTimer());
        }
        System.out.printf("Победитель - %s", sortedData.get(0).sortName());
    }


    private int chooseSort(){
        Scanner sc = new Scanner(System.in);
        int sortNum = 0;
        System.out.println("Введи номер сортировки:\n" +
                "1 - Пузырьковая сортировка\n" +
                "2 - Сортировка выбором\n" +
                "3 - Сортировка вставками\n" +
                "4 - Быстрая сортировка\n" +
                "5 - Пирамидальная сортировка");
        try{
            sortNum = sc.nextInt();
            return sortNum;
        }catch (NumberFormatException e){
            System.out.println("Ой-ой, что-то пошло не так");
        }finally {
            return sortNum;
        }
    }

    private Sorts startSmallSort(int sortNum){
        int[] smallArr= arr.getSmallArray();
        switch (sortNum) {
            case 1:
                BubbleSort sort1 = new BubbleSort();
                sort1.doSort(smallArr);
                return sort1;
            case 2:
                SelectionSort sort2 = new SelectionSort();
                sort2.doSort(smallArr);
                return sort2;
            case 3:
                InsertionSort sort3 = new InsertionSort();
                sort3.doSort(smallArr);
                return sort3;
            case 4:
                QuickSort sort4 = new QuickSort();
                sort4.doSort(smallArr);
                return sort4;
            case 5:
                HeapSort sort5 = new HeapSort();
                sort5.doSort(smallArr);
                return sort5;
            default:
                return null;
        }
    }

    private Sorts startBigSort(int sortNum){
        int[] bigArr= arr.getBigArray();
        switch (sortNum) {
            case 1:
                BubbleSort sort1 = new BubbleSort();
                sort1.doSort(bigArr);
                return sort1;
            case 2:
                SelectionSort sort2 = new SelectionSort();
                sort2.doSort(bigArr);
                return sort2;
            case 3:
                InsertionSort sort3 = new InsertionSort();
                sort3.doSort(bigArr);
                return sort3;
            case 4:
                QuickSort sort4 = new QuickSort();
                sort4.doSort(bigArr);
                return sort4;
            case 5:
                HeapSort sort5 = new HeapSort();
                sort5.doSort(bigArr);
                return sort5;
            default:
                return null;
        }
    }
}
