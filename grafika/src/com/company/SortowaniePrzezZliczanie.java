package com.company;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args) {
        int[] wartosci = new int[11];
        int[] tab = new int[10];
        for(int i = 0; i < 10 ; i++) {
            tab[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < 10; i++) {
            wartosci[tab[i]]++;
        }

        int id = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < wartosci[i]; j++) {
                tab[id] = i;
                id++;
                System.out.print(i + " ");
            }
        }
    }
}