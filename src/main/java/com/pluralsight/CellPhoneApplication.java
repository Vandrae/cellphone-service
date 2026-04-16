package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        CellPhone thePhone = new CellPhone();

        System.out.print("whats the serial number? ");
        int sNum = input.nextInt();
        thePhone.setsNumber(sNum);
        // eats line b/c string to int
        input.nextLine();

        System.out.print("whats the model? ");
        String model = input.nextLine();
        thePhone.setModel(model);

        System.out.print("whats the Carrier? ");
        String carrier = input.nextLine();
        thePhone.setCarrier(carrier);

        System.out.print("whats the Phone Number? ");
        String pNumber = input.nextLine();
        thePhone.setpNumber(pNumber);

        System.out.print("who's the Owner? ");
        String owner = input.nextLine();
        thePhone.setOwner(owner);

        System.out.println(thePhone.toString());






    }
}
