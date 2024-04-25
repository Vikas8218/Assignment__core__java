package com.coding;
public class Two_array_String_common_value_14 {
    public static boolean contains(String[] array, String element) {
        for (String item : array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "orange", "grape", "kiwi"};
        String[] array2 = {"banana", "orange", "watermelon", "grape", "pineapple"};

        System.out.println("Common elements between the two arrays:");
        for (String element : array1) {
            if (contains(array2, element)) {
                System.out.println(element);
            }
        }
    }
}
