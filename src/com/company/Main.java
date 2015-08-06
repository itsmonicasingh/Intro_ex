package com.company;


public class Main {

    public static class EasiestExerciseEver{

        public void ex1() {
            System.out.println("*");

        }
    }

    public static class DrawHorizontalLine{

        public int n;
        public void ex2(int n){
            for(int i = 0; i < n; i++){
                System.out.print("*");
            }
        }
    }

    public static class DrawVerticalLine{

        public int n;
        public void ex3(int n){
            for(int i = 0; i < n; i++){
                System.out.println("*");
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        //ex 1
        System.out.println("Exercise1 output");
        EasiestExerciseEver ob1;
        ob1 = new EasiestExerciseEver();
        ob1.ex1();

        System.out.println("\n");
        System.out.println("Exercise2 output");
        DrawHorizontalLine ob2;
        ob2 = new DrawHorizontalLine();
        ob2.ex2(5);

        System.out.println("\n");
        System.out.println("Exercise3 output");
        DrawVerticalLine ob3;
        ob3 = new DrawVerticalLine();
        ob3.ex3(3);

    }
}
