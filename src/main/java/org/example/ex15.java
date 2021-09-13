package org.example;

import java.util.Scanner;

public class ex15 {

    // main
    public static void main(String[] args) {

        // passes to password check
        password_check();

    }

    // checks password and provides output
    public static void password_check() {

        // initialize password
        String password = "abc$123";

        // prompt for input and store in entered pass
        System.out.print("What is the password? ");
        Scanner input = new Scanner(System.in);
        String entered_pass = input.next();

        // compare entered_pass and password
        if (entered_pass.equals(password))
            // output if match
            System.out.println("Welcome!");

        else
            // output if doesn't match
            System.out.println("I don't know you.");
    }
}
