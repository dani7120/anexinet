package com.anexinet.exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Excercise2 {

    public static void main(String[] args) {
        int  [] a = new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int  [] b = new int [] {3,2,9,3,7,11,15,13,23,27,32,35,36,37};
        int  [] c = new int [] {1,3,5,7,11,13,15,17,19,21,23,27,35,37};
        int  [] d = new int [] {9,17,32,7,2,3,1,45,46,47,55,60,6,17};

        int []  commonValues = solution(a, b, c, d);

        System.out.println("Common Values are:");
        for (int i = 0; i < commonValues.length; i++) {
            System.out.println(commonValues[i]);
        }

    }

    private static int [] solution (int  [] a, int  [] b, int  [] c, int  [] d){
        Map<Integer, Integer> values = new HashMap<>();
        getValues(a, values);
        getValues(b, values);
        getValues(c, values);
        getValues(d, values);
        // I set the 4 cause at least has to exist 4 times
        return values.entrySet()
                .stream().filter(x -> x.getValue()>=4)
                .mapToInt(x -> x.getKey()).toArray();
    }

    private static void getValues(int [] array, Map<Integer, Integer> values) {
        array = Arrays.stream(array).distinct().toArray();
        for (int i = 0; i < array.length; i++) {
            if(values.containsKey(array[i])){
                int count = values.get(array[i]) + 1 ;
                values.put(array[i], count);
            } else {
                values.put(array[i], 1);
            }
        }
    }


}
