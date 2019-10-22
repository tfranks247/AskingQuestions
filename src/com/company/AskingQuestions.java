package com.company;
import java.util.Scanner;
public class AskingQuestions {

        public static void main(String args[])
            {
                int a,b,sum;
                double avg;

                Scanner buf=new Scanner(System.in);

                System.out.print("Enter first number : ");
                a=buf.nextInt();

                System.out.print("Enter second number : ");
                b=buf.nextInt();

                /*Calculate sum and average*/
                sum = a+b;
                avg = (double)((a+b)/2);

                System.out.print("Sum : " +sum +"\nAverage : " +avg);
            }
        }

