package com.goksel;

import java.util.Scanner;

//Yolculuk maliyeti hesaplayan program

public class sorular2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Motor tipini giriniz (L/H): ");
        String motorTipi = scanner.next().toUpperCase();

        if (!motorTipi.equals("L") && !motorTipi.equals("H")) {
            System.out.println("Hatalı motor tipi!");
            return;
        }

        System.out.print("Arabanın yaşını giriniz: ");
        int aracYasi = scanner.nextInt();

        System.out.print("Yolculuk mesafesini KM cinsinden giriniz: ");
        int mesafe = scanner.nextInt();

        double tuketim = (motorTipi.equals("L")) ? 3.3 : 4.2;
        double yakitFiyati = (motorTipi.equals("L")) ? 1.6 : 1.6;

        double maliyet = (mesafe / 100.0) * tuketim * yakitFiyati;

        if (aracYasi > 12) {
            maliyet *= 1.07;
        } else if (aracYasi > 7) {
            maliyet *= 1.03;
        }

        System.out.printf("Toplam maliyet: ", maliyet);
    }
}