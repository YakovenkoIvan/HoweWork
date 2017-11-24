package com.company;

public class App {
    public static void main(String[] args) {
        String first = " 123 ";
        String second = " 169 ";
        System.out.println("Do you win?");
        System.out.println("Answer : " + isWin(second));
        System.out.println("And now?! ");
        System.out.println("Answer :  " + isWin(first));
    }

    public static boolean isWin(String combination) {
        boolean isWin = XOField.getWinCombination().contains(combination);
        return  isWin;
    }
}
