package io.learnstuff.assignment2.exercise4utils;

public interface TextProcessingInterface {
    public void split(String string, String wordToBeReversed);
    public String reverse(String word, String text);
    public StringBuffer reverse(String word, StringBuffer text);

}