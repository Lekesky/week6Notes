package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age;
        try {
            age = input.nextInt();
            if(age >= 18){
                System.out.println("You are allowed to vote!");
            }else{
                System.out.println("You are not allowed to vote");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Age must be a number.");
        }

    }

//        try {
//            Scanner inputNumber = new Scanner(System.in);
//
//            System.out.println("Please enter a double");
//            double number1 = inputNumber.nextDouble();
//            System.out.println("Please enter an double");
//            double number2 = inputNumber.nextDouble();
//
//            add(number1, number2);
//            divide(number1, number2);
//        }
//        catch (InputMismatchException e ){
//            System.out.println("Incorrect data type entered");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Sorry math is incorrect");
//        }
//
//        catch (Exception e){
//            System.out.println("Something ? went wrong! Will figure out later.");
//        }
//    }
//
//    static void add(double a, double b){
//        System.out.println(a+b);
//    }
//    static void divide(double a, double b){
//        System.out.println(a/b);
//    }
}
