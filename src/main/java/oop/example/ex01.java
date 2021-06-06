package oop.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Derek Gilberti
 */
public class ex01 {
    // main method begin
    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);

        //Input name
        System.out.print("What is your name?");
        String name = in.nextLine();

        //Output String
        String outputString = "Hello, " + name + ", nice to meet you!";

        //Output
        System.out.println(outputString);
    } // end main method
} // end class
