package com.goksel;

import java.util.Scanner;

//Ayın gün sayısını bulan program

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ay adını girin: ");
        String ay = scanner.nextLine().toLowerCase();

        switch (ay) {
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println("31 gün");
                break;
            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println("30 gün");
                break;
            case "şubat":
                System.out.println("28 gün");
                break;
            default:
                System.out.println("Geçersiz ay ismi");
        }
    }
}