package com.company;

import java.util.Scanner;

/**
 * Created by andrea on 20/03/2017.
 */
public class WeightTest {

    public static void main(String[] args){

        // float numere cu virgula
        float height, weight, bmi;
        String gender;

        // clasa pentru scanare tastatura
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the gender ");

        // scanam genderul
        gender = scan.next();

        System.out.print("Enter the height and weights ");
        height = scan.nextFloat();
        weight = scan.nextFloat();

        if(gender.equals("male") || gender.equals("female")){
            bmi = weight / (height * height);

            System.out.print("BMI is equals with: " + bmi);

            return;
        }

        System.out.print("The gender is not valid, please use male or female");
        System.exit(1);


    }



}
