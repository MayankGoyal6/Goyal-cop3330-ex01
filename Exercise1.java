/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 1
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("What is your name? ");

    String name = scanner.nextLine();

    System.out.println("Hello, " + name + ", nice to meet you!");
  }
}