package com.goksel;

import java.util.Scanner;

//5 elemanlı dizinin ortalamasını bulan program

public class problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[5];
        int toplam = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". sayıyı girin: ");
            dizi[i] = scanner.nextInt();
            toplam += dizi[i];
        }


        double ortalama = (double)toplam / 5;
        System.out.println("Dizinin ortalaması: " + ortalama);
    }
}