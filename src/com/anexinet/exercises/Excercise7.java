package com.anexinet.exercises;

public class Excercise7 {

    public static void main(String[] args) {
       solution(6, 7);
    }

    private static void solution(int a, int b) {
        for (int i = 0; i < b; i++) {
            a++;
        }
        System.out.println(a);
    }
}
