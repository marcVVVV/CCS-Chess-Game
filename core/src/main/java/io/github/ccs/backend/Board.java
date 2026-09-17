package io.github.ccs.backend;

import javax.swing.*;
import java.awt.*;


//This creates the board.
//We'll create the rest of the chess game, we just need to create the board first.
public class Board {

    JFrame frame;
    JPanel squares[][] = new JPanel[8][8];

    public void board() {
        frame = new JFrame("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));


        JPanel boardRatioer = new JPanel(new GridLayout(8, 8)) {
            @Override
            public Dimension getPreferredSize() {
                Container parent = getParent();
                if (parent != null) {
                    int size = Math.min(parent.getWidth(), parent.getHeight());
                    return new Dimension(size, size);
                }
                return super.getPreferredSize();
            }
        };

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JPanel(new GridBagLayout());
                boolean isWhite = (i + j) % 2 == 0;
                if (isWhite) {
                    squares[i][j].setBackground(Color.WHITE);
                } else {
                    squares[i][j].setBackground(Color.getHSBColor(0.05f, 0.40f, 0.66f)); //There was no brown so I had to do this. Using getHSBColor to get the specific color I needed.
                }

                int tileNumber = i * 8 + j;

                JLabel label = new JLabel(String.valueOf(tileNumber));
                label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));

                if (isWhite) {
                    label.setForeground(Color.BLACK);
                } else {
                    label.setForeground(Color.WHITE);
                }

                squares[i][j].add(label);
                boardRatioer.add(squares[i][j]);
            }
        }
        frame.setLayout(new GridBagLayout());
        frame.add(boardRatioer);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
