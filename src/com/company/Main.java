package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] aBestemmingen = {"de kust", "de Ardennen", "de kempen", "in je tuin"};

        System.out.println("Kies een bestemming:");

        for (int i = 0; i < aBestemmingen.length; i++) {
            String sBestemming  = aBestemmingen[i];
            System.out.printf("%4d. %s\n",i+1,sBestemming);
        }
    }
}
