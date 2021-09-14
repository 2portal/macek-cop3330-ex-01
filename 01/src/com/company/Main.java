/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 cody macek
 */
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Hello Whats your name?");
        Scanner input = new Scanner (System.in);
        String fname= input.next();
        System.out.println("Nice to meet you " + fname);
    }
}
