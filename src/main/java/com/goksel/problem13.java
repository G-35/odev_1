package com.goksel;

import java.util.Scanner;

//Asal sayı kontrolü yapan program

public class problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        boolean asalMi = true;

        if (sayi <= 1) {
            asalMi = false;
        } else {
            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
        }

        if (asalMi) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }
}
