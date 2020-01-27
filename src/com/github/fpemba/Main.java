package com.github.fpemba;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static String firstName;
    private static String lastName;
    private static int age;
    private static int birthMonth;
    private static String favoriteColor;
    private static int siblingsNum;

    public static void main(String[] args) {

        askUserForInformation();

        determineFortune();

    }

    private static void askUserForInformation() {
        firstName = firstName();
        lastName = lastName();
        age = age();
        birthMonth = birthMonth();
        favoriteColor = favoriteColor();
        siblingsNum = siblingsNum();
    }

    public static String firstName() {
        System.out.println("What is your first name?");
        return input.nextLine();

    }

    public static String lastName() {
        System.out.println("What is your last name?");
        return input.nextLine();

    }

    public static int age() {
        System.out.println("How old are you");
        int age = input.nextInt();
        input.nextLine();
        return age;
    }

    public static int birthMonth() {
        System.out.println("What month were you born");
        int birthMonth = input.nextInt();
        input.nextLine();
        return birthMonth;
    }

    public static int siblingsNum() {
        System.out.println("How many siblings do you have");
        int siblingsNum = input.nextInt();
        input.nextLine();
        return siblingsNum;

    }

    public static String favoriteColor() {

        System.out.println("What is your favorite ROYGBIV color? Or ask for Help");
        String favoriteColor = input.nextLine();

        if (favoriteColor.equalsIgnoreCase("HELP")) {
            System.out.println("Use RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, OR VIOLET");
            System.out.println("What is your favorite ROYGBIV color or ask for Help");
            favoriteColor = input.nextLine();
        }
        return favoriteColor;

    }

    private static void determineFortune() {
        int numberOfYearsUntilRetirement = determineNumberOfYearsUntilRetirement(age);
        String vacationHomeLocation = determineVacationHomeLocation(siblingsNum);
        String modeOfTransportation = determineModeOfTransportation(favoriteColor);
        double bankBalance = determineBankBalance(birthMonth);

        displayFortune(firstName, lastName, numberOfYearsUntilRetirement,
                vacationHomeLocation, modeOfTransportation, bankBalance);

    }

    public static String determineVacationHomeLocation(int siblingsNum) {
        String vacationHomeLocation;
        if (siblingsNum < 0) {
            vacationHomeLocation = "Chernobyl, Ukraine";
        } else if (siblingsNum == 0) {
            vacationHomeLocation = "Boca Raton, FL";
        } else if (siblingsNum == 1) {
            vacationHomeLocation = "Nassau, Bahamas";
        } else if (siblingsNum == 2) {
            vacationHomeLocation = "Ponta Negra,Brazil";
        } else if (siblingsNum == 3) {
            vacationHomeLocation = "Portland, Oregon";
        } else {
            vacationHomeLocation = "Baton Rouge, LA";
        }

        return vacationHomeLocation;
    }

    public static int determineNumberOfYearsUntilRetirement(int age) {
        int numberOfYearsUntilRetirement;
        if (age % 2 == 0) {
            numberOfYearsUntilRetirement = 30;
        } else {
            numberOfYearsUntilRetirement = 15;
        }

        return numberOfYearsUntilRetirement;
    }

    public static String determineModeOfTransportation(String favoriteColor) {
        String modeOfTransportation = "";

        switch (favoriteColor.toUpperCase()) {
            case "RED":
                modeOfTransportation = "Maserati";
                break;
            case "OrANGE":
                modeOfTransportation = "Stallion";
                break;
            case "YELLOW":
                modeOfTransportation = "Chariot";
                break;
            case "GREEN":
                modeOfTransportation = "Taxi";
                break;
            case "BLUE":
                modeOfTransportation = "Rickshaw";
                break;
            case "INDIGO":
                modeOfTransportation = "Motor scooter";
                break;
            case "VIOLET":
                modeOfTransportation = "Flying saucer";
                break;
            default:
                modeOfTransportation = "Learn your colors";

        }
        return modeOfTransportation;
    }

    public static double determineBankBalance(int birthMonth) {

        double bankBalance;

        if (birthMonth >= 1 && birthMonth <= 4) {
            bankBalance = 256000.76;
        } else if (birthMonth >= 5 && birthMonth <= 8) {
            bankBalance = 3687105.42;
        } else if (birthMonth >= 9 && birthMonth <= 12) {
            bankBalance = 50000000.77;
        } else {
            bankBalance = 0.00;
        }

        return bankBalance;
    }

    private static void displayFortune(String firstName, String lastName, int numberOfYearsUntilRetirement, String vacationHomeLocation, String modeOfTransportation, double bankBalance) {
        String fortune = firstName + " " + lastName + " will retire in " + numberOfYearsUntilRetirement + " years,\n" +
                "with $" + bankBalance + " in the bank, \n" +
                "a vacation home in " + vacationHomeLocation + ", \n" +
                "and travel by " + modeOfTransportation + ".";
        System.out.println(fortune);

    }
}






