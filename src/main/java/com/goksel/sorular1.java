package com.goksel;

import java.util.Scanner;

//Öğrencilik süresine göre okul dönemini bulan program

public class sorular1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrencilik süresini giriniz: ");
        int sure = scanner.nextInt();

        if (sure < 0) {
            System.out.println("NONE");
        } else if (sure < 5) {
            System.out.println("Elementary School");
        } else if (sure < 8) {
            System.out.println("Junior School");
        } else if (sure < 10) {
            System.out.println("High School");
        } else {
            System.out.println("College");
        }
    }
}