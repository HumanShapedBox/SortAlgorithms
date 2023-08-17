import sortCollection.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArraysForSort arr = new ArraysForSort();

    public void smallSortBattle(){
        int sortNum = chooseSort();
        ArrayList firstSort = startSmallSort(sortNum);
        sortNum = chooseSort();
        ArrayList secondSort = startSmallSort(sortNum);

    }

    public void bigSortBattle(){
        int sortNum = chooseSort();
        startBigSort(sortNum);

        sortNum = chooseSort();
        startBigSort(sortNum);
    }

    public void results(){
        //печатает статистику, делает вывод, кто молодец
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

    private ArrayList startSmallSort(int sortNum){
        int[] smallArr= arr.getSmallArray();
        ArrayList sortData = new ArrayList();
        arr.getSmallArray();
        switch (sortNum) {
            case 1:
                BubbleSort sort1 = new BubbleSort();
                sort1.doSort(smallArr);
                sortData.add(sort1.getCounter());
                sortData.add(sort1.getTimer());
                break;
            case 2:
                SelectionSort sort2 = new SelectionSort();
                sort2.doSort(smallArr);
                sortData.add(sort2.getCounter());
                sortData.add(sort2.getTimer());
                break;
            case 3:
                InsertionSort sort3 = new InsertionSort();
                sort3.doSort(smallArr);
                sortData.add(sort3.getCounter());
                sortData.add(sort3.getTimer());
                break;
            case 4:
                QuickSort sort4 = new QuickSort();
                sort4.doSort(smallArr);
                sortData.add(sort4.getCounter());
                sortData.add(sort4.getTimer());
                break;
            case 5:
                HeapSort sort5 = new HeapSort();
                sort5.doSort(smallArr);
                sortData.add(sort5.getCounter());
                sortData.add(sort5.getTimer());
                break;
            default:
                chooseSort();
        }
        return sortData;
    }

    private ArrayList startBigSort(int sortNum){
        int[] bigArr= arr.getBigArray();
        ArrayList sortData = new ArrayList();
        switch (sortNum) {
            case 1:
                BubbleSort sort1 = new BubbleSort();
                sort1.doSort(bigArr);
                sortData.add(sort1.getCounter());
                sortData.add(sort1.getTimer());
                break;
            case 2:
                SelectionSort sort2 = new SelectionSort();
                sort2.doSort(bigArr);
                sortData.add(sort2.getCounter());
                sortData.add(sort2.getTimer());
                break;
            case 3:
                InsertionSort sort3 = new InsertionSort();
                sort3.doSort(bigArr);
                sortData.add(sort3.getCounter());
                sortData.add(sort3.getTimer());
                break;
            case 4:
                QuickSort sort4 = new QuickSort();
                sort4.doSort(bigArr);
                sortData.add(sort4.getCounter());
                sortData.add(sort4.getTimer());
                break;
            case 5:
                HeapSort sort5 = new HeapSort();
                sort5.doSort(bigArr);
                sortData.add(sort5.getCounter());
                sortData.add(sort5.getTimer());
                break;
            default:
                chooseSort();
        }
        return sortData;
    }


}
