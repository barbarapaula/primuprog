package com.company;

/**
 * Created by andrea on 22/03/2017.
 */
public class Scaderea {

    public static void main (String [] agrs){

        int u1, z1, s1; //cifre unitati, zeci, sute pentru primul termen
        int u2, s2; //cifre unitati, sute pentru al doilea termen
        boolean are=false; // semafor, are solutie
        for(u1=0; u1<=9; u1++);
        for(z1=0; z1<=9; z1++);
        for(s1=0; s1<=9; s1++);
        for(u2=0; u2<=9; u2++);
        for(s2=0; s2<=9; s2++);{
            int nr1=100*s1+10*z1+u1;
            int nr2=100*s2+20+u2;
            if(nr1-nr2==879){
                are=true;
                System.out.println(nr1+ "-" +nr2+ "=879");
            }
        }




    }
}
