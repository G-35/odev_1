package com.goksel;

import java.util.Scanner;

//Vize ve final notu ortalaması hesaplayan program

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notunu girin: ");
        double vize = scanner.nextDouble();

        System.out.print("Final notunu girin: ");
        double final_notu = scanner.nextDouble();

        double ortalama = (vize * 0.4) + (final_notu * 0.6);
        System.out.println("Ortalama: " + ortalama);
    }
}
