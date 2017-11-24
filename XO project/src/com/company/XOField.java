package com.company;

public class XOField {
    private static String winCombination = " " +
            "123" + " " +
            "456" + " " +
            "789" + " " +
            "147" + " " +
            "258" + " " +
            "369" + " " +
            "159" + " " +
            "357" +
            " ";

    public static String getWinCombination() {
        return winCombination;

    }

    public static String findAllPosibleCombinations(int[] playersXOPositions) {
        if(!isMoreThenThreeElements(playersXOPositions)){
            return null;
        }


    }

    public static boolean isMoreThenThreeElements(int[] playersXOPositions) {
        if (playersXOPositions.length < 3) {
            return false;
        } else {
            return true;
        }
    }
}
