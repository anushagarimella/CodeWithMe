package com.codewithanusha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.println("What is the temperature like today?");
      int temp = scanner.nextInt();
        if (temp > 30) {
            System.out.println("It's a hot day!!");
            System.out.println("Stay hydrated :) ");
        }
        else if (temp > 20 )
            System.out.println("Beautiful day to step out for a walk");
        else
            System.out.println("It\'s a cold day");
    }
}
