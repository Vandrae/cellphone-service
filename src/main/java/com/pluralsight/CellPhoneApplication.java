package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void display(CellPhone phone) {
        System.out.println(phone.getsNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getpNumber());
        System.out.println(phone.getOwner());
    }
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        CellPhone thePhone = new CellPhone();
        CellPhone thePhone2 = new CellPhone();

        // going to be honest i dont know how to do most of this

        System.out.print("whats the serial number? ");
        int sNum = input.nextInt();
        thePhone.setsNumber(sNum);
        // eats line b/c string to int
        input.nextLine();

        System.out.print("whats the serial number? ");
        int sNum2 = input.nextInt();
        thePhone2.setsNumber(sNum2);
        // eats line b/c string to int
        input.nextLine();

        System.out.print("whats the model? ");
        String model = input.nextLine();
        thePhone.setModel(model);

        System.out.print("whats the model? ");
        String model2 = input.nextLine();
        thePhone2.setModel(model2);

        System.out.print("whats the Carrier? ");
        String carrier = input.nextLine();
        thePhone.setCarrier(carrier);

        System.out.print("whats the Carrier? ");
        String carrier2 = input.nextLine();
        thePhone2.setCarrier(carrier2);

        System.out.print("whats the Phone Number? ");
        String pNumber = input.nextLine();
        thePhone.setpNumber(pNumber);

        System.out.print("whats the Phone Number? ");
        String pNumber2 = input.nextLine();
        thePhone2.setpNumber(pNumber2);

        System.out.print("who's the Owner? ");
        String owner = input.nextLine();
        thePhone.setOwner(owner);

        System.out.print("who's the Owner? ");
        String owner2 = input.nextLine();
        thePhone2.setOwner(owner2);


        display(thePhone);
        display(thePhone2);
        thePhone.dial(thePhone2.getpNumber());
        thePhone2.dial(thePhone.getpNumber());







    }
}
