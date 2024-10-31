package com.goksel;

import java.util.Scanner;

//Dizideki tekrar eden elemanları bulan program

public class problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int boyut = scanner.nextInt();
        int[] dizi = new int[boyut];


        for (int i = 0; i < boyut; i++) {
            System.out.print((i+1) + ". sayıyı girin: ");
            dizi[i] = scanner.nextInt();
        }


        System.out.println("Tekrar eden elemanlar:");
        for (int i = 0; i < boyut; i++) {
            for (int j = i + 1; j < boyut; j++) {
                if (dizi[i] == dizi[j]) {
                    System.out.println(dizi[i]);
                }
            }
        }
    }
}