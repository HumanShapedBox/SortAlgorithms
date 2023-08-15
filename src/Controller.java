import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Controller {
    public AtomicInteger counter = new AtomicInteger();
    //time
    // comparator
    private int[] smallArr = new int[50];
    private int[] bigArr = new int[15000];

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
//        getSmallArray();
//        getBigArray();
        chooseSort();
//        printArray();
        sorts.quickSort(smallArr);
//        printArray();
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

    public void sortBattle(){
        int sort = chooseSort();
        startSmallSort(sort);


    }

    private void compareSorts(){

    }

    private void startSmallSort(int sortNum){
        getSmallArray();
        //засекай время исполнения
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
        // засекла, да?
    }

    private void startBigSort(int sortNum){
        getSmallArray();
        //засекай время исполнения
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
        // засекла, да?
    }



}
