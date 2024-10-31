package com.goksel;

import java.util.Scanner;

// iki sayının dört işlemini yapan program

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.println("Toplam: " + (sayi1 + sayi2));
        System.out.println("Fark: " + (sayi1 - sayi2));
        System.out.println("Çarpım: " + (sayi1 * sayi2));
        System.out.println("Bölüm: " + ((double)sayi1 / sayi2));
    }
}