import sortCollection.*;

import java.util.Scanner;

public class Controller {
    ArraysForSort arr = new ArraysForSort();
    SortAnalyse compare = new SortAnalyse();

    public void smallSortBattle(){
        int sort = chooseSort();
        startSmallSort(sort);
        compare.setOperationsNum();
        compare.setTime();
        sort = chooseSort();
        startSmallSort(sort);

    }

    public void bigSortBattle(){
        // Поддянуть статистику из анализатора
        int sort = chooseSort();
        startBigSort(sort);
        sort = chooseSort();
        startBigSort(sort);
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

    private void startSmallSort(int sortNum){
        int[] smallArr= arr.getSmallArray();
        arr.getSmallArray();
        switch (sortNum) {
            case 1:
                BubbleSort sort1 = new BubbleSort();
                sort1.doSort(smallArr);
                break;
            case 2:
                SelectionSort sort2 = new SelectionSort();
                sort2.doSort(smallArr);
                break;
            case 3:
                InsertionSort sort3 = new InsertionSort();
                sort3.doSort(smallArr);
                break;
            case 4:
                QuickSort sort4 = new QuickSort();
                sort4.doSort(smallArr);
                break;
            case 5:
                HeapSort sort5 = new HeapSort();
                sort5.doSort(smallArr);
                break;
            default:
                chooseSort();
        }
    }

    private void startBigSort(int sortNum){
        int[] bigArr= arr.getBigArray();
        switch (sortNum) {
            case 1:
                BubbleSort sort1 = new BubbleSort();
                sort1.doSort(bigArr);
                break;
            case 2:
                SelectionSort sort2 = new SelectionSort();
                sort2.doSort(bigArr);
                break;
            case 3:
                InsertionSort sort3 = new InsertionSort();
                sort3.doSort(bigArr);
                break;
            case 4:
                QuickSort sort4 = new QuickSort();
                sort4.doSort(bigArr);
                break;
            case 5:
                HeapSort sort5 = new HeapSort();
                sort5.doSort(bigArr);
                break;
            default:
                chooseSort();
        }
    }


}
