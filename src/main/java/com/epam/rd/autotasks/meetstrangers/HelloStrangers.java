package com.epam.rd.autotasks.meetstrangers;


import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args)   {
        Scanner scan = new Scanner(System.in);
        Scanner scaner = new Scanner(System.in);

        int amount = scan.nextInt();
        if (amount < 0) {
            System.out.println("Seriously? Why so negative?");
        } else if (amount == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            String[] name = new String[amount];
            for (int i = 0; i < amount; i++) {
                name[i] = scaner.nextLine();
            }
            for (int i = 0; i < amount; i++) {
                System.out.println("Hello, " + name[i]);
            }
        }

    }
    }
