package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] colorArray = scanner.nextLine().split("\\s+");
        redBeforeEverything(colorArray);
        printNewArray(colorArray);
    }

    static void redBeforeEverything(String[] arr)
    {
        List<String> valuesAfterRed = new ArrayList<>();
        String[] rearrangeArr = new String[arr.length];
        int j = 0;
        int k = rearrangeArr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("red"))
            {
                rearrangeArr[j] = arr[i];
                j++;
            }
            else {
                valuesAfterRed.add(arr[i]);
            }
        }

        for (int i = 0; i < valuesAfterRed.size(); i++)
        {
            String color = valuesAfterRed.get(i);
            if (color.equals("blue"))
            {
                rearrangeArr[j] = color;
                j++;
            }
            else {
                rearrangeArr[k] = color;
                k--;
            }
        }

        for (int i = 0; i < rearrangeArr.length; i++) {
            arr[i] = rearrangeArr[i];
        }
    }

    static void printNewArray(String[] arr)
    {
        for (String color : arr) {
            System.out.print(color + " ");
        }
    }

}