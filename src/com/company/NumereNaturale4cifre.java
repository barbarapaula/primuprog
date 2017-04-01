package com.company;

/**
 * Created by andrea on 22/03/2017.
 */
   class Raspuns
{

    public static void main (String [] args)
    {

        int contor=0;
        for(int i=1000; i<=9999;i++)
            if(i%67==23)contor++;
        System.out.println("Sunt" +contor+ "numere.");

    }

}
