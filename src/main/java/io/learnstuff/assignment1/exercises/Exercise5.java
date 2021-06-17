package io.learnstuff.assignment1.exercises;


import io.learnstuff.assignment1.utils.Generator;
import io.learnstuff.assignment1.utils.Printer;
import io.learnstuff.assignment1.utils.Searcher;

//Generate a random array of numbers and search for a specific one. If you find it then use a
//named break to exit the loop

public class Exercise5 {
    public static void main(String[] args){

        //TODO - take manual input for the length of the array
        int[] array = Generator.generateRandomArray(20);
        Printer.printArray(array);
        Searcher.searchThroughArray(array, 10);
    }
}
