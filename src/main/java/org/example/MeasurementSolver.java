package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MeasurementSolver {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the equation: ");
        String equation = scn.nextLine();

        for (int i = 0; i< equation.length(); i++){
            char E = equation.charAt(i);
            int value = (int)(E)-96;
            value = value +i;
            String worldSplit = equation.substring(i+1,value+1);



        }


        System.out.print("The results are: ");

            System.out.print( " ");
        }
    }
