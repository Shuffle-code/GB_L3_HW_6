package HW_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Array.printArray(Array.array());
        System.out.println(" ");
        Array.printArray(Array.newArray(Array.array()));
        System.out.println(" ");
        Array.printArray(Array.array1or4());
        System.out.println(Array.check(Array.array1or4()));
    }

//    public static int[] newArray(int[] arr) {
//        if (arr.length == 0)
//            throw new RuntimeException("Not an empty one-dimensional integer array is passed");
//        List<Integer> list = new ArrayList<>();
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] == 4) {
//                if (arr[i + 1] != 4){
//                    list.add(arr[i+1]);
//                }
//            }
//        }
//        if (list.size() == 0)
//            throw new RuntimeException("There is no \"4\" character in the array!");
//        int[] newArray = new int[list.size()];
//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = list.get(i);
//        }
//        return newArray;
//    }
//
//    static int[] array(){
//        int[] intArray = new int[10];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = (int)(Math.random()*10);
//        }
//        return intArray;
//    }
//
//    static void printArray(int[] values){
//        for (int i = 0; i < values.length; i++){
//            System.out.println("[" + i + "]" + values[i]);
//        }
//    }

}
