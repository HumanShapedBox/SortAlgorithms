import java.util.Random;
import java.util.Scanner;

public class Controller {
    Sorts sorts;
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
                sorts.bubbleSort(smallArr);
                break;
            case 2:
                sorts.selectionSort(smallArr);
                break;
            case 3:
                sorts.insertionSort(smallArr);
                break;
            case 4:
                sorts.quickSort(smallArr);
                break;
            case 5:
                sorts.heapSort(smallArr);
                break;
            default:
                chooseSort();
        }
    }

    private void startBigSort(int sortNum){
        int[] bigArr= arr.getBigArray();
        switch (sortNum) {
            case 1:
                sorts.bubbleSort(bigArr);
                break;
            case 2:
                sorts.selectionSort(bigArr);
                break;
            case 3:
                sorts.insertionSort(bigArr);
                break;
            case 4:
                sorts.quickSort(bigArr);
                break;
            case 5:
                sorts.heapSort(bigArr);
                break;
            default:
                chooseSort();
        }
    }


}
