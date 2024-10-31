package com.goksel;

import java.util.Scanner;

//Dairenin alan ve çevresini hesaplayan program

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Dairenin yarıçapını girin: ");
        double yaricap = scanner.nextDouble();

        double alan = PI * yaricap * yaricap;
        double cevre = 2 * PI * yaricap;

        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }
}