package com.goksel;

//Dizideki en küçük elemanı ve indeksini bulan program

public class problem17 {
    public static void main(String[] args) {
        int[] dizi = {35, 25, 29, 8, 86, 90};
        int enKucuk = dizi[0];
        int indeks = 0;

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
                indeks = i;
            }
        }

        System.out.println("En küçük eleman: " + enKucuk);
        System.out.println("İndeksi: " + indeks);
    }
}

