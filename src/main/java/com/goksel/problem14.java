package com.goksel;

import java.util.Scanner;

//Girilen sayıya kadar olan çift sayıları yazdıran program

public class problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        for (int i = 2; i <= sayi; i += 2) {
            System.out.println(i);
        }
    }
}