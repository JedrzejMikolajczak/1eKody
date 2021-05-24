package com.company;

import java.util.Scanner;

public class LiczbyNaCyfry {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = "";
        String c = "";
        c += a;
        while(a > 0) {
            s += (a % 10);
            a /= 10;
        }
        System.out.println(s);
        System.out.println(c);
        if(s.equals(c)){
            System.out.println("palindrom");
        }
        else
        {
            System.out.println("nie palindrom");
        }


    }
}
