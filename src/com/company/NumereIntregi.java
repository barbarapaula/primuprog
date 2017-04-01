package com.company;

/**
 * Created by andrea on 22/03/2017.
 */
public class NumereIntregi {
    public static void main (String [] args){

        //int =a,b,c,d DECLARARE VARIABILE NUMERE INTREGI TIPUL INT

        int a, b, c, d;

        // long e,f DECLARARE VARIABILE NUMERE INTREGI DE TIPUL LONG

        long e, f;

        //initializarea variabilelor numere intregi tipul int.

        a=2500;
        b=1000;
        c=15000000;

        //expresie care calculeaza inmultirea dintre cele trei variabile a,b,c iar rezultatul se atribuie variabilei d

        d= a * b * c;

        //initializarea variabilei de tip long e

        e=10000000;

        //expresie care face inmultirea dintre variabilele d si e, iar rezultatul se atribuie variabilei de tip long f.

        f=d * e;

        System.out.println("int d = " +d);
        //afiseaza rezultatul pentru variabila d de tip int

        System.out.println("long f   = " +f);
        // afiseaza rezultatul pentru variabia f de tip long

    }
}
