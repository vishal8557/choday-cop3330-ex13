package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday
 */
/*Exercise 13 - Determining Compound Interest
        Simple interest is something you use only when making a quick guess. Most investments use a compound interest formula, which will be much more accurate. And this formula requires you to incorporate exponents into your programs.

        Write a program to compute the value of an investment compounded over time. The program should ask for the starting amount, the number of years to invest, the interest rate, and the number of periods per year to compound.

        The formula you’ll use for this is A = P(1 + r/n)^(n*t) where

        P is the principal amount.
        r is the annual rate of interest.
        t is the number of years the amount is invested.
        n is the number of times the interest is compounded per year.
        A is the amount at the end of the investment.
        Example Output
        What is the principal amount? 1500
        What is the rate? 4.3
        What is the number of years? 6
        What is the number of times the interest is compounded per year? 4
        $1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.
        Constraints
        Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
        Ensure that fractions of a cent are rounded up to the next penny.
        Ensure that the output is formatted as money.
*/
import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner FIRSTNUMBER = new Scanner(System.in);
        Scanner SECONDNUMBER = new Scanner(System.in);
        Scanner THIRDNUMBER = new Scanner(System.in);
        Scanner FOURTHNUMBER = new Scanner(System.in);

        double The_Principal_Amount;
        double THERATE;
        double UR_INTREST_RTE;
        double THE_TIME_PER_YR;
        double UR_TOTAL_AMOUNT;
        int YH;

        System.out.println("What is the principal amount? ");
        The_Principal_Amount = FIRSTNUMBER.nextDouble();

        System.out.println("What is the rate? ");
        THERATE = SECONDNUMBER.nextDouble();
        UR_INTREST_RTE = (double) THERATE/100;

        System.out.println("What is the number of years? ");
        THE_TIME_PER_YR = THIRDNUMBER.nextInt();

        System.out.println("What is the number of times the interest is compounded per year? ");
        YH = FOURTHNUMBER.nextInt();

        UR_TOTAL_AMOUNT = The_Principal_Amount * Math.pow((1 + UR_INTREST_RTE/YH), YH*THE_TIME_PER_YR);

        System.out.println("$" + The_Principal_Amount + " invested at " + THERATE + "% for " + THE_TIME_PER_YR +  " years compounded " + YH + " times per year is ");

        System.out.printf("$%.2f.",
                UR_TOTAL_AMOUNT);



    }

}
