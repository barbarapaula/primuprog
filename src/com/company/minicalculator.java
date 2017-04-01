package com.company;

import java.util.Scanner;

/**
 * Created by andrea on 27/03/2017.
 */
public class minicalculator  {
    public static void main (String [] args){

        Scanner calculator= new Scanner(System.in);
        double pnum, dnum, rez;
        System.out.println("Primul numar este: ");
        pnum = calculator.nextDouble();
        System.out.println("Al doilea numar este: ");
        dnum = calculator.nextDouble();
        rez = pnum + dnum ;
        System.out.println(rez);
    }
}
