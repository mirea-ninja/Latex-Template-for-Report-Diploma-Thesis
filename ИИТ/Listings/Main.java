package com.pract4;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private static final String Team1 = "Team Spirit";
    private static final String Team2 = "PSG";

    JButton buttonMilan = new JButton(Team1);
    JButton buttonRealMadrid = new JButton(Team2);
    JLabel jlResult = new JLabel("Result: 0 X 0");
    JLabel jlLastScorer = new JLabel("Last Scorer: N/A");
    Label lWinner = new Label("Winner: DRAW");
    int team1Score = 0;
    int team2Score = 0;
    String lastScorer = "N/A";
    String winner = "N/A";

    public Main() {
        super("International 10");
        setSize(500, 500);
        setLayout(new FlowLayout());
        add(buttonMilan);
        add(buttonRealMadrid);
        add(jlResult);
        add(jlLastScorer);
        add(lWinner);
        buttonMilan.addActionListener(ae -> {
            team1Score++;
            jlLastScorer.setText("Last Scorer: " + Team1);
            onClick();
        });
        buttonRealMadrid.addActionListener(ae -> {
            team2Score++;
            jlLastScorer.setText("Last Scorer: " + Team2);
            onClick();
        });
    }

    private void onClick() {
        jlResult.setText("Result: " + team1Score + " X " + team2Score);
        lWinner.setText("Winner: DRAW");
        if (team1Score > team2Score) {
            lWinner.setText("Winner: " + Team1);
        } else if (team2Score > team1Score) {
            lWinner.setText("Winner: " + Team2);
        }
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}