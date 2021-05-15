package com.company.eisenberg;

public class IrregularTab {
    public static void main(String[] args) {
        int[][] choices = {
                {9},
                {7, 5},
                {4, 6, 1},
                {3, 1, 2, 8}
        };

        int nbPeople = 0;
        for (int row = 0; row < choices.length; row++) {
            for(int col = 0; col < choices[row].length; col++) {
                nbPeople += choices[row][col];
            }
        }
        System.out.printf("%d people gave their opinion.\n", nbPeople);
    }
}
