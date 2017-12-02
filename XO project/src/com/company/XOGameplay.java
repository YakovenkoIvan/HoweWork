package com.company;

import java.util.Scanner;

public class XOGameplay {
    private static int gameTurnCounts = 5;
    private Player firstPlayer = new Player(true);
    private Player secondPlayer = new Player(false);

    public String play(Scanner scanner) {
        for (int currentTurn = 1; currentTurn <= gameTurnCounts; currentTurn++) {
            String winner = turn(scanner, currentTurn);
            if (winner != null) {
                return winner;
            }
        }
        return "No winner";
    }

    private String turn(Scanner scanner, int currentTurn) {
        int firstPlayerChoise = scanner.nextInt();
        int[] firstPlayerMoves = firstPlayer.addMove(firstPlayerChoise);
        if (testWinner(firstPlayerMoves)) {
            return "First player Win!!!";
        }
        if (currentTurn == 5) {
            return null;
        }
        int secondPlayerChoise = scanner.nextInt();
        int[] secondPlayerMoves = secondPlayer.addMove(secondPlayerChoise);
        if (testWinner(secondPlayerMoves)) {
            return "Second player Win!!!";
        }
        return null;
    }

    private static String[] transformationStringToArray(String playerStringCombinations) {
        if (playerStringCombinations == null || playerStringCombinations.length() == 0) {
            return null;
        }
        String[] arrayString = playerStringCombinations.split(",");
        return arrayString;
    }

    private static boolean testWinner(int[] playerMoves) {
        String[] combinatios = transformationStringToArray(findAllPosibleCombinations(playerMoves));

        for (int i = 0; i < combinatios.length; i++) {
            if (XOField.getWinCombination().contains(combinatios[i])) {
                return true;
            }
        }
        return false;
    }

    private static String findAllPosibleCombinations(int[] playersXOPositions) {
        String result = "";
        if (isLessThenThreeElements(playersXOPositions)) {
            return null;
        }
        for (int i = 0; i < playersXOPositions.length; i++) {
            for (int j = 0; j < playersXOPositions.length; j++) {
                for (int k = 0; k < playersXOPositions.length; k++) {
                    result = result + (String.valueOf(playersXOPositions[i]) + String.valueOf(playersXOPositions[j]) +
                            String.valueOf(playersXOPositions[k]) + ',');
                }
            }
        }
        return result;
    }

    private static boolean isLessThenThreeElements(int[] playersXOPositions) {
        return playersXOPositions == null || playersXOPositions.length < 3;
    }
}
