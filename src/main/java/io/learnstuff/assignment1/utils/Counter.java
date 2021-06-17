package io.learnstuff.assignment1.utils;


public class Counter {

    // Solution exercise 1
    public int count(int[] arr, int toFind) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == toFind) {
                counter++;
            }
        }
        return counter;
    }

    public int count(String[] arr, String toFind) {
        int counter = 0;
        if (arr == null || toFind == null)
            return counter;
        for (String str : arr) {
            if (str != null && str.equals(toFind)) {
                counter++;
            }
        }
        return counter;
    }
}

