package main;

import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame game = new JFrame();

        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setResizable(false);
        game.setTitle("Sample game");
        game.setSize(500,500);
        game.setLocationRelativeTo(null);
        game.getContentPane().setBackground(Color.black);
        game.setVisible(true);
    }
}