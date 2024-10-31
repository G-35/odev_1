package com.goksel;

import java.util.Scanner;

//Üç sayının en büyüğünü bulan program

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("2. sayıyı girin: ");
        int sayi2 = scanner.nextInt();
        System.out.print("3. sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        int enBuyuk = sayi1;

        if (sayi2 > enBuyuk) {
            enBuyuk = sayi2;
        }
        if (sayi3 > enBuyuk) {
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
    }
}