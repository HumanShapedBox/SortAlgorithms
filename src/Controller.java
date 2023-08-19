import sortCollection.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArraysForSort arr;
    ArrayList<Sorts> sortedData;
    int firstSort;
    int secondSort;

    public Controller(){
        this.arr = new ArraysForSort();
        this.sortedData = new ArrayList<>();
        this.firstSort = 0;
        this.secondSort = 0;
    }

    public void smallSortBattle(){
        setNums(parseUserData(chooseSort()));
        ArrayList<Sorts> data = new ArrayList<>();
        data.add(startSmallSort(firstSort));
        data.add(startSmallSort(secondSort));
        CompareSorts cmp = new CompareSorts(data);
        this.sortedData = cmp.getWinner();
    }

    public void bigSortBattle(){
        for (Sorts sort: sortedData) {
            sort.resetCounter();
        }
        ArrayList<Sorts> data = new ArrayList<>();
        data.add(startBigSort(firstSort));
        data.add(startBigSort(secondSort));
        CompareSorts cmp = new CompareSorts(data);
        this.sortedData = cmp.getWinner();
    }

    public void smallResults(){
        System.out.println("Итоги сортировки небольших массивов");
        for (Sorts data: this.sortedData) {
            System.out.printf("%s\nКоличество операций: %d\nЗатраченное время (нс): %d\n***\n",
                    data.sortName(), data.getCounter(), data.getTimer());
        }
        System.out.printf("Победитель - %s\n***\n", sortedData.get(0).sortName());
    }

    public void bigResults(){
        System.out.println("Итоги сортировки больших массивов");
        for (Sorts data: this.sortedData) {
            System.out.printf("%s\nКоличество операций: %d\nЗатраченное время (нс): %d\n***\n",
                    data.sortName(), data.getCounter(), data.getTimer());
        }
        System.out.printf("Победитель - %s\n", sortedData.get(0).sortName());
    }

    private String chooseSort(){
        Scanner sc = new Scanner(System.in);
        String sortNum;
        System.out.println("Введи номера сортировок, которые хочешь сравнить, через пробел (1 2):\n" +
                "1 - Пузырьковая сортировка\n" +
                "2 - Сортировка выбором\n" +
                "3 - Сортировка вставками\n" +
                "4 - Быстрая сортировка\n" +
                "5 - Пирамидальная сортировка");
        sortNum = sc.nextLine();
        return sortNum;
    }

    private int[] parseUserData(String userData){
        int[] nums = new int[2];
        try{
            String[] uData = userData.split(" ");
            for(int i = 0; i < uData.length; i++){
                nums[i] = Integer.parseInt(uData[i]);
            }
        }catch (NumberFormatException e){
            System.out.println("Ой-ой, что-то пошло не так");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Требуется только 2 числа, попробуйте ещё раз");
        }
        return nums;
    }

    private void setNums(int[] nums){
        if(checkNums(nums)){
            this.firstSort = nums[0];
            this.secondSort = nums[1];
        }else {
            setNums(parseUserData(chooseSort()));
        }
    }

    private boolean checkNums(int[] nums){
        boolean flag = true;
        if(nums[0] < 1 || nums[0] > 5
        || nums[1] <1 || nums[1] > 5){
            System.out.println("Что-то пошло не так");
            flag = false;
        }
        return flag;
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
