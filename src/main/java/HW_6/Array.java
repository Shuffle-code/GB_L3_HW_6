package HW_6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Array {
    private Array() {
    }

    static int[] array() {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 10);
        }
        return intArray;
    }

    static int[] array1or4() {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            if ((int) (Math.random() * 2) == 1) {
                intArray[i] = 1;
            } else intArray[i] = 4;
        }
        return intArray;
    }

    static boolean check (int[] arr){
        boolean notFourOrOne = true;
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == 1 || arr[i] == 4) count++;
        }
        if (count == 0) notFourOrOne = false;
        return notFourOrOne;
    }

    static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println("[" + i + "]" + values[i]);
        }
    }

    public static int[] newArray(int[] arr) {
        if (arr.length == 0)
            throw new RuntimeException("Not an empty one-dimensional integer array is passed");
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] == 4) {
                if (arr[i + 1] != 4) {
                    list.add(arr[i + 1]);
                }
            }
        }
        try {
            if (list.size() == 0) ;
        } catch (RuntimeException e){
//            String e = "There is no \"4\" character in the array!";
            throw new RuntimeException("There is no \"4\" character in the array!", e);
        }

        int[] newArray = new int[list.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = list.get(i);
        }
            return newArray;

    }


//    Написать метод, который проверяет состав массива из чисел 1 и 4.
//    Если в нем нет хоть одной четверки или единицы, то метод вернет false;
//    Написать набор тестов для этого метода (по 3-4 варианта входных данных).



}
