package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //ask for first name
        System.out.println("What is your first name?");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        System.out.println(firstName);

        //ask for last name
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.println(lastName);

        //ask for age
        System.out.println("How old are you");
        int age = input.nextInt();
        System.out.println(age);

        //ask for birth month
        System.out.println("What month were you born");
        int birthMonth = input.nextInt();
        System.out.println(birthMonth);

        input.nextLine();

        //ask for favorite ROYGBIV color
        System.out.println("What is your favorite ROYGBIV color? or ask for Help");
        String color = input.nextLine();

        if(color.equalsIgnoreCase("HELP")){
            System.out.println("Use RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, OR VIOLET");
            System.out.println("What is your favorite ROYGBIV color or ask for Help");
            color = input.nextLine();
        }

        System.out.println(color);

        //ask number of siblings
        System.out.println("How many siblings do you have");
        int siblingsNum = input.nextInt();


        int numberOfYearsUntilRetirement = 0;
        if(age % 2 ==0){
            numberOfYearsUntilRetirement = 30;
        } else{
           numberOfYearsUntilRetirement = 15;
        }


        String vacationHomeLocation = "";

        if(siblingsNum < 0){
            vacationHomeLocation = "Chernobyl, Ukraine";
        } else if(siblingsNum == 0){
            vacationHomeLocation = "Boca Raton, FL";
        }else if(siblingsNum == 1){
            vacationHomeLocation = "Nassau, Bahamas";
        }else if(siblingsNum == 2){
            vacationHomeLocation = "Ponta Negra,Brazil";
        } else if(siblingsNum == 3){
            vacationHomeLocation = "Portland, Oregon";
        } else {
            vacationHomeLocation = "Baton Rouge, LA";
        }

        String modeOfTransportation = " ";
        switch (color.toUpperCase()) {
            case "Red":
                modeOfTransportation = "Maserati";
                break;
            case "Orange":
                modeOfTransportation = "Stallion";
                break;
            case "Yellow":
                modeOfTransportation = "Chariot";
                break;
            case "Green":
                modeOfTransportation = "Taxi";
                break;
            case "Blue":
                modeOfTransportation = "Rickshaw";
                break;
            case "Indigo":
                modeOfTransportation = "Motor scooter";
                break;
            case "Violet":
                modeOfTransportation = "Flying saucer";
                break;
            default: modeOfTransportation = "Learn your colors";

        }

        double bankBalance = 0.0;

        if(birthMonth >= 1 && birthMonth <= 4) {
            bankBalance = 256000.76;
        } else if (birthMonth >= 5 && birthMonth <= 8){
            bankBalance = 3687105.42;
        } else if (birthMonth >= 9 && birthMonth <= 12){
            bankBalance = 50000000.77;
        } else {
            bankBalance = 0.00;
        }
        System.out.println(firstName + " " + lastName + " will retire in " + numberOfYearsUntilRetirement + " years "  + " + with \n "
                + bankBalance + " in the bank, a vacation home in " + vacationHomeLocation  +
                        "  \n ,and travel by " + modeOfTransportation);
    }
}
