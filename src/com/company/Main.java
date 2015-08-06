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

    public static class DrawRightTriangle{

        public int n;
        public void ex4(int n){
            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= i; j++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }

    public static class IsoscelesTriangle{

        public int n;
        public void ex5(int n){
            for(int i = 0; i < n; i++){
                System.out.print("*");
            }
        }
    }

    public static class FizzBuzz{

        public int n;
        public void ex6(int n){
            for(int i = 0; i < n; i++){
                if(i % 15 == 0){
                    System.out.println("FizzBuzz");
                }
                else if(i % 5 == 0){
                    System.out.println("Fizz");
                }
                else if(i % 3 == 0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);
                }
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

        System.out.println("\n");
        System.out.println("Exercise4 output");
        DrawRightTriangle ob4;
        ob4 = new DrawRightTriangle();
        ob4.ex4(3);

        System.out.println("\n");
        System.out.println("Exercise5 output");
        IsoscelesTriangle ob5;
        ob5 = new IsoscelesTriangle();
        ob5.ex5(3);

        System.out.println("\n");
        System.out.println("Exercise6 output");
        FizzBuzz ob6;
        ob6 = new FizzBuzz();
        ob6.ex6(50);
    }
}
