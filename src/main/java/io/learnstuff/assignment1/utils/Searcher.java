package io.learnstuff.assignment1.utils;

public class Searcher {
    public static void searchThroughArray(int[] array ,int toFind){
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == toFind){
                count++;
            }
        }
        if(count > 0){
            System.out.println("Your number is in the array!");

        }else{
            System.out.println("Sorry, it is not in the array!");
        }
    }

}
