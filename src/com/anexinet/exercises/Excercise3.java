package com.anexinet.exercises;

import java.util.Arrays;

public class Excercise3 {

    public static void main(String[] args) {
        boolean isAnagram = solution("test", "ttes");
        if(isAnagram)
            System.out.println("input1 and input2 are anagram");
        else
            System.out.println("input1 and input2 are not an anagram");
    }

    private static boolean solution(String input1 , String input2){
        // compares lengths
        if(input1.length()!= input2.length())
            return false;

        // sets all t
        char[] arrayInput1 = input1.toLowerCase().toCharArray();
        char[] arrayInput2 = input2.toLowerCase().toCharArray();

        Arrays.sort(arrayInput1);
        Arrays.sort(arrayInput2);
        // compares if both arrays are the same
        return Arrays.equals(arrayInput1, arrayInput2);
    }

}
