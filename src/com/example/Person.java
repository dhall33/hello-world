package com.example;

import java.util.Scanner;

/*
* Name: John Campbell
* Section: COSC/ITSE 
* Homework: exercise 11
* Description:  I am creating attributes for each of the attributes for a person (in the class) and printing an
* output to the address class.
*/

public class Person {
    private String strFirstName = "";
    private String strLastName = "";
    private String strMiddleName = "";
    private String strGender = "";
    private char chrGender = ' ';
    private int intBirthDay = 0;
    private int intBirthMonth = 1;
    private int intBirthYear = 1980;
    private int intHeightIN = 72;
    private int intWeightLBS = 165;


    Scanner objInput = new Scanner(System.in);

    // getting the user's first, middle, and last name
    public void setFirstName(String pstrFirstName) {
        strFirstName = pstrFirstName;
    }

    public String getFirstName() {
        // here I'm getting the first name from the user
        System.out.println("Type in your first name: ");
        strFirstName = objInput.next().toUpperCase();//just easier to make it all upper case
        return strFirstName;
    }

    public void setMiddleName(String pstrMiddleName) {
        strMiddleName = pstrMiddleName;
    }

    public String getMiddleName() {
        // here I'm getting the MIDDLE name from the user
        System.out.println("Type in your middle name: ");
        strMiddleName = objInput.next().toUpperCase();//just easier to make it all upper case
        return strMiddleName;
    }

    // setting last name to whatever the user put into getLastName
    public void setLastName(String pstrLastName) {
        strLastName = pstrLastName;
    }

    public String getLastName() {
        // here I'm getting the LAST name from the user
        System.out.println("Type in your last name: ");
        strLastName = objInput.next().toUpperCase();//just easier to make it all upper case
        return strLastName;
    }

    // this gets the users birth date, month, and year
    public void setBirthDay(int pintBirthDay){
        intBirthDay = pintBirthDay;
    }

    public int getBirthDay(){
        System.out.println("Type in your birth date number in DD format: ");
        intBirthDay = objInput.nextInt();
        return intBirthDay;
    }

    public void setBirthMonth(int pintBirthMonth){
            intBirthMonth = pintBirthMonth;
    }

    public int getBirthMonth() {
            System.out.println("birth month number in MM format: ");
            intBirthMonth = objInput.nextInt();//just easier to make it all upper case
      return intBirthMonth;
    }

    public void setBirthYear(int pintBirthYear) {
        intBirthYear = pintBirthYear;
    }

    public int getBirthYear(){
        System.out.println("birth year number in YYYY format: ");
        intBirthYear = objInput.nextInt();//just easier to make it all upper case
        return intBirthYear;
    }

    // this compiles the users birth date, month, and year into one function
    public void setBirthTotal(int pintBirthDay, int pintBirthMonth, int pintBirthYear){
        this.setBirthDay(pintBirthDay);
        this.setBirthMonth(pintBirthMonth);
        this.setBirthYear(pintBirthYear);
    }

    public String getBirthTotal(){
        return this.getBirthMonth() + "/" + getBirthDay() + "/" + getBirthYear();
    }

    // this gets the user's gender using char
    public void setGender(String pstrGender){
        strGender = pstrGender;
    }

    public String getGender(){
        System.out.println("Type \"M\" for male, \"F\" for female, or \"N\" for neutral: ");
        strGender = objInput.next().toUpperCase();
        chrGender = strGender.charAt(0);
        if(chrGender == 'M'){
            return "Male";
        } else if (chrGender == 'F'){
            return "Female";
        } else
            return "Neutral";
    }

    // this gets the user's height
    public void setHeightIN(int pintHeightIN){
        intHeightIN = pintHeightIN;
    }

    public int getHeightIN(){
        System.out.println("Type in your height in inches: ");
        intHeightIN = objInput.nextInt();
        return intHeightIN;
    }

    // this gets the user's weight
    public void setWeightLBS(int pintWeightLBS){
        intWeightLBS = pintWeightLBS;
    }

    public int getWeightLBS(){
        System.out.println("Type in your weight in lbs: ");
        intWeightLBS = objInput.nextInt();
        return intWeightLBS;
    }

    // puts the all the collected stats into one function
    public String getStats() {
        return "\n" +
                "Your name: " + this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName() + "\n" +
                "Your birthday: " + this.getBirthTotal() + "\n" +
                "Your gender: " + this.getGender() + "\n" +
                "Your weight: " + this.getWeightLBS() + "\n" +
                "Your height: " + this.getHeightIN();
    }

    public void setStats(String pstrFirstName,
                         String pstrMiddleName,
                         String pstrLastName) {
        this.setFirstName(pstrFirstName);
        this.setMiddleName(pstrMiddleName);
        this.setLastName(pstrLastName);
        this.setBirthTotal(intBirthDay, intBirthMonth, intBirthYear);
        this.setGender(strGender);
        this.setHeightIN(intHeightIN);
        this.setWeightLBS(intWeightLBS);
    }


}

