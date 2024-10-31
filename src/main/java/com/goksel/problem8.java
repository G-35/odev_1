package com.goksel;

import java.util.Scanner;

//Yaş kontrolü yapan program

public class problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mevcutYil = 2024;

        System.out.print("Doğum yılınızı girin: ");
        int dogumYili = scanner.nextInt();

        int yas = mevcutYil - dogumYili;

        if (yas >= 18) {
            System.out.println("Reşit");
        } else {
            System.out.println("Reşit değil");
        }
    }
}