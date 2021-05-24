package com.company;

import java.util.*;
public class SortowanieBabelkowe {

    public static void main(String[] args) {
        int[] zbior = new int[10];
        for (int i = 0; i < 10; i++){
            zbior[i] = (int)(Math.random()*100 + 100);
            System.out.print(zbior[i] + " ");
        }
        System.out.println();
        System.out.println("------");
        int c;
        boolean posortowany = true;
        for(int j = 0; j < 9; j++){
            posortowany = true;
            for(int i = 0; i < 9-j; i++) {
                System.out.print(".");
                if (zbior[i] > zbior[i + 1]) {
                    posortowany = false;
                    c = zbior[i];
                    zbior[i] = zbior[i + 1];
                    zbior[i + 1] = c;
                }
            }
            if(posortowany == true){
                break;
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++){
            System.out.print(zbior[i] + " ");
        }
    }
}
