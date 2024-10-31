package com.goksel;

import java.util.Scanner;

//KDV hesaplayan program

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürün fiyatını girin: ");
        double fiyat = scanner.nextDouble();

        double kdvli_fiyat = fiyat * 1.18;
        System.out.println("KDV'li fiyat: " + kdvli_fiyat);
    }
}