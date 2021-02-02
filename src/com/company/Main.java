package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String white = "⬜";
        String black = "⬛";
        String whiteCH = "○";
        String blackCH = "⬤";

        //0 = nic
        //1 = black
        //2 = white

        int[][] pole = {
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 2, 0, 2, 0, 2, 0},
                {0, 2, 0, 2, 0, 2, 0, 2}
        };

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                if (pole[i][j] == 1)
                    System.out.print(blackCH);
                else if (pole[i][j] == 2)
                    System.out.print(whiteCH);
                else {
                    if ((i + j) % 2 == 0)
                        System.out.print(black);
                    else
                        System.out.print(white);
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Černá hraje");
        System.out.println("Vyber postavičku");
        int i1 = sc.nextInt();
        int j1 = sc.nextInt();
        if (pole[i1][j1] == 1) {
            System.out.println("Zadej kam se chceš posunout");
            int i2 = sc.nextInt();
            int j2 = sc.nextInt();

            pole[i1][j1] = 0;
            pole[i2][j2] = 1;

            System.out.println();
            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    if (pole[i][j] == 1)
                        System.out.print(blackCH);
                    else if (pole[i][j] == 2)
                        System.out.print(whiteCH);
                    else {
                        if ((i + j) % 2 == 0)
                            System.out.print(black);
                        else
                            System.out.print(white);
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nevalidní vstup");
        }
    }
}