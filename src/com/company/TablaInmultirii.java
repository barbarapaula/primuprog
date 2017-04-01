package com.company;

import java.util.Scanner;

/**
 * Created by andrea on 20/03/2017.
 */
public class TablaInmultirii {

    public static void main(String[] args){

        int a,b,period = 0;

        System.out.print("Enter values for  a and b");
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        while(a <= b){
            period = 0;
            while(period <= 10){

                System.out.print("Rezultatul inmultirii lui " + a + " cu " + period + " este egal cu " + a * period + "\n");
                period = period + 1;
            }
            a = a + 1;
        }



    }

}
