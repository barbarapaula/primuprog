package com.company;

import java.util.Scanner;

/**
 * Created by andrea on 20/03/2017.
 */
public class ExericitiiTreiNumere {

    public static void main(String[] args){

        int a, b, c, lower;
        System.out.print("Type three numbers: ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();


        if(a < b && a < c){
            lower = a;
        } else if(b < c) {
            lower = b;
        } else {
            lower = c;
        }

        System.out.print("Cel mai mic numar este " + lower);
    }

}
