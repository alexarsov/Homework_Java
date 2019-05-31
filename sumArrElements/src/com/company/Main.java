package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean taskCond = false;

        System.out.print("Enter the row numbers -> ");
        int[] rowNums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        System.out.print("Enter the number for check: ");
        int myNumber = Integer.parseInt(scanner.nextLine());

        if (twoElementsExist(rowNums))
        {
            if (sumEqualsGivenNum(rowNums, myNumber))
            {
                System.out.println("There are two elements in the array which total sum equals the given number!");
            }
            else {
                System.out.println("There are NO two elements in the array which total sum equals the given number!");
            }
        }
        else {
            System.out.println("The array contains less than two elements!");
        }
    }

    static boolean twoElementsExist(int[] arr)
    {
        int myLength = arr.length;
        if (myLength >= 2)
        {
            return true;
        }
        else {
            return false;
        }
    }
    static boolean sumEqualsGivenNum(int[] arr, int myNumber)
    {
        boolean taskCond = false;

        for (int i = 0; i < arr.length; i++)
        {
            if (taskCond)
            {
                break;
            }
            int currentFirstNumCheck = arr[i];
            for (int j = i + 1; j < arr.length; j++)
            {
                int currSecondNumCh = arr[j];
                if (currentFirstNumCheck + currSecondNumCh == myNumber)
                {
                    taskCond = true;
                    break;
                }

            }
        }

        if (taskCond)
        {
            return true;
        }
        else {
            return false;
        }
    }

}