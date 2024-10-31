package com.goksel;

import java.util.Scanner;

//Şehir plaka kodu bulan program

public class sorular5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Şehir adını giriniz: ");
        String sehir = scanner.nextLine().toUpperCase();

        switch (sehir) {
            case "ADANA":
                System.out.println("Plaka: 01");
                break;
            case "ADIYAMAN":
                System.out.println("Plaka: 02");
                break;
            case "AFYON":
                System.out.println("Plaka: 03");
                break;
            case "BALIKESIR":
                System.out.println("Plaka: 10");
                break;
            case "BILECIK":
                System.out.println("Plaka: 11");
                break;
            case "BINGOL":
                System.out.println("Plaka: 12");
                break;
            case "BITLIS":
                System.out.println("Plaka: 13");
                break;
            case "DENIZLI":
                System.out.println("Plaka: 20");
                break;
            default:
                System.out.println("Geçersiz şehir adı");
        }
    }
}
