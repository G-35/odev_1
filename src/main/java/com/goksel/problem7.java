package com.goksel;

import java.util.Scanner;

//Not durumunu kontrol eden program

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Notunuzu girin (0-100): ");
        int not = scanner.nextInt();

        if (not >= 50) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }
    }
}