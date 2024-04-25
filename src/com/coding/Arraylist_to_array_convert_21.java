package com.coding;
import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_to_array_convert_21 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] array = new Integer[arrayList.size()];
        array = arrayList.toArray(array);
        System.out.println("Array: " + Arrays.toString(array));
    }
}
