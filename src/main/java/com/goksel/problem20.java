package com.goksel;

//Dizideki çift sayıları yazdıran program:

public class problem20 {
    public static void main(String[] args) {

        int[] dizi = {35, 18, 8, 70, 17, 78, 34, 60, 26, 11};

        System.out.println("Dizideki çift sayılar:");
        for (int sayi : dizi) {
            if (sayi % 2 == 0) {
                System.out.println(sayi);
            }
        }
    }
}
