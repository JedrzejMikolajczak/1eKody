package com.company;

public class SortowaniePrzezWybor {

    public static void main(String[] args) {

        int[] wartosci = new int[10];
        int min = 1000;
        int id = 0;
        int c;
        for(int i = 0; i < 10 ; i++) {
            wartosci[i] = (int) (Math.random() * 60 + 27);
        }
        for (int i = 0; i < 9; i++) {
            min = wartosci[i];
            id = i;
            for (int j = i + 1; j < 10; j++) {
                if(min > wartosci[j]) {
                    min = wartosci[j];
                    id = j;
                }
            }
            c = wartosci[i];
            wartosci[i] = min;
            wartosci[id] = c;
        }
        for (int i: wartosci){
            System.out.print(i + " ");
        }

    }
}