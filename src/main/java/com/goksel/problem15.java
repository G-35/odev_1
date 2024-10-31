package com.goksel;

//3 ve 5'e bölünebilen sayıları bulan program

public class problem15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}