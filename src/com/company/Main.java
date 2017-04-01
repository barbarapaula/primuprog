package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int a,b, big;

        System.out.print("Tasteaza doua numere");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();

        if(a > b){
            big = a;
        } else {
            big = b;
        }

        System.out.print("Numarul cel mai mare este " + big);


    }

}