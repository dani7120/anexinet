package com.anexinet.exercises;

public class Excercise4 {

    public static void main(String[] args) {
        solution(25, 8);
    }

    public static void solution(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("A:"+ a);
        System.out.println("B:"+ b);
    }
}
