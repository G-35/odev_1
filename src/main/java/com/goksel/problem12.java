package com.goksel;

import java.util.Scanner;

//Faktöriyel hesaplayan program

public class problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        long faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        System.out.println(sayi + "! = " + faktoriyel);
    }
}