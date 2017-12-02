package com.company;

import com.sun.jndi.ldap.sasl.SaslInputStream;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        XOGameplay game = new XOGameplay();
        System.out.println(game.play(new Scanner(System.in)));
    }
}
