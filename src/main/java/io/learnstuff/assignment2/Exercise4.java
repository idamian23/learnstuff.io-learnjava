package io.learnstuff.assignment2;

import io.learnstuff.assignment2.exercise4utils.TextProcessing;

/**
     * Given a large body of text, implement a class with at least three methods that process the text in order
     * to replace a given word with their revers. The methods will demonstrate overloading.
     * The three methods of text processing that should be implemented are:
     * Using split (using and array and the ‘for’ control structure)
     * Using indexOf and substr (using the ‘while’ control structure)
     * Using replace and indexOf (using the ‘do - while’ control structure)
     * Note that the methods need to have different but semantically meaningful signatures.
    **/
public class Exercise4 {
    public static void main(String[] arg){

        var textProcessing = new TextProcessing();
        textProcessing.split("This is going to split the string and reverse the chosen word.", "reverse");
        TextProcessing.println(textProcessing.reverse("atunci", "Cea mai mare glorie nu o dobândești atunci când nu ești doborât, ci atunci când te ridici după ce ai căzut"));
        TextProcessing.println(textProcessing.reverse("15","Am de ridicat un colet in 15 minute."));


    }
}
