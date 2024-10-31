package com.goksel;

import java.util.Scanner;

//Cümlenin karakter sayısını bulan program

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine();

        System.out.println("Karakter sayısı: " + cumle.length());
    }
}