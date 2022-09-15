package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        int myInt_1 = scanner.nextInt();
        int myInt_2 = scanner.nextInt();
        scanner.close();

        System.out.println( myInt);
        System.out.println( myInt_1);
        System.out.println( myInt_2);
    }
}
