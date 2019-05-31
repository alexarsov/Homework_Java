package com.company;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Test your palindrome: ");
        String palindrome = scanner.nextLine();

        if (plndrm(palindrome)) {
            System.out.printf("%s is a palindrome", palindrome);
        }
        else{
            System.out.printf("%s is not a palindrome", palindrome);
        }

    }

    static boolean plndrm(String pal){
        if (pal.length() == 0 || pal.length() == 1)
        {
            return true;
        }
        if (pal.charAt(0) == pal.charAt(pal.length() - 1))
        {
            return plndrm(pal.substring(1, pal.length() - 1));
        }
        return false;
    }
}