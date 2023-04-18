import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {
    public static JFrame frame;
    public static JPanel panel;
    public static JPanel sidepanel;
    public static JLabel Boxes;
    public static JLabel SideScore;

    public static JProgressBar progress;
    public static JProgressBar prog;

    public static int FirstX = 20;
    public static int SecondX = 190;
    public static int ThirdX = 360;

    // Game board
    public static JButton ZeroZero;
    public static JButton ZeroOne;
    public static JButton ZeroTwo;
    public static JButton OneZero;
    public static JButton OneOne;
    public static JButton OneTwo;
    public static JButton TwoZero;
    public static JButton TwoOne;
    public static JButton TwoTwo;

    // Reset Button
    public static JButton Reset;

    // Labels
    public static JLabel WinLabel;
    public static JLabel LossLabel;

    public static int Wins = 0;
    public static int Losses = 0;
    public static String X = ".";
    public static String Player = "X";
    public static String Comp = "O";

    public static String[][] GameBoard = {
            { X, X, X },
            { X, X, X },
            { X, X, X }

    };// Testing Arr

    public static int counter = 0;

    public TicTacToe() {

        // Graphic Objects
        frame = new JFrame("Tic Tac Toe");
        panel = new JPanel();
        sidepanel = new JPanel();
        Boxes = new JLabel("Hehehehe");
        SideScore = new JLabel();

        WinLabel = new JLabel("Wins: ");
        LossLabel = new JLabel("Losses: ");

        /*
         * ZeroZero
         * ZeroOne
         * ZeroTwo
         * OneZero
         * OneOne
         * OneTwo
         * TwoZero
         * TwoOne
         * TwoTwo
         */

        // Button Objects
        ZeroZero = new JButton(X);
        ZeroOne = new JButton(X);
        ZeroTwo = new JButton(X);
        OneZero = new JButton(X);
        OneOne = new JButton(X);
        OneTwo = new JButton(X);
        TwoZero = new JButton(X);
        TwoOne = new JButton(X);
        TwoTwo = new JButton(X);

        // Creating Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800, 600);

        // Adding to frame

        frame.add(panel);

        // frame.add(sidepanel);
        panel.setLayout(null);
        // Main Game panels
        panel.add(SideScore);
        panel.add(WinLabel);
        panel.add(LossLabel);

        // Adding Buttons to panel
        panel.add(ZeroZero);
        panel.add(ZeroZero);
        panel.add(ZeroOne);
        panel.add(ZeroTwo);
        panel.add(OneZero);
        panel.add(OneOne);
        panel.add(OneTwo);
        panel.add(TwoZero);
        panel.add(TwoOne);
        panel.add(TwoTwo);

        // Reset button
        Reset = new JButton("Reset");
        panel.add(Reset);
        Reset.setBounds(600, 100, 100, 50);

        // Setting Buttons Pos
        ZeroZero.setBounds(FirstX, 20, 150, 150);
        ZeroOne.setBounds(SecondX, 20, 150, 150);
        ZeroTwo.setBounds(ThirdX, 20, 150, 150);

        OneZero.setBounds(FirstX, SecondX, 150, 150);
        OneOne.setBounds(SecondX, SecondX, 150, 150);
        OneTwo.setBounds(ThirdX, SecondX, 150, 150);

        TwoZero.setBounds(FirstX, ThirdX, 150, 150);
        TwoOne.setBounds(SecondX, ThirdX, 150, 150);
        TwoTwo.setBounds(ThirdX, ThirdX, 150, 150);

        SideScore.setBounds(600, 10, 200, 100);
        WinLabel.setBounds(600, 170, 200, 200);
        LossLabel.setBounds(600, 200, 200, 200);

    }

    public static void PrintArray() throws InterruptedException {

        // Updates the Buttons depending on what the comp picks
        if (GameBoard[0][0] == Comp) {
            ZeroZero.setText(Comp);
        }
        if (GameBoard[0][1] == Comp) {
            ZeroOne.setText(Comp);
        }
        if (GameBoard[0][2] == Comp) {
            ZeroTwo.setText(Comp);
        }
        if (GameBoard[1][0] == Comp) {
            OneZero.setText(Comp);
        }
        if (GameBoard[1][1] == Comp) {
            OneOne.setText(Comp);
        }
        if (GameBoard[1][2] == Comp) {
            OneTwo.setText(Comp);
        }
        if (GameBoard[2][0] == Comp) {
            TwoZero.setText(Comp);
        }
        if (GameBoard[2][1] == Comp) {
            TwoOne.setText(Comp);
        }
        if (GameBoard[2][2] == Comp) {
            TwoTwo.setText(Comp);
        }
        CheckingForAWinner("Me");

    }

    private static void waitforpresses() throws InterruptedException {

        // Waits for the buttons to be pressed

        // First Row
        ZeroZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Checks if the spot is open and the selects X on that spot and calls for the
                // computer to pick a spot
                if (GameBoard[0][0] == X) {
                    GameBoard[0][0] = "X";
                    ZeroZero.setText(Player);
                    compselection();
                    try {
                        PrintArray();
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                } else {

                }
            }
        });
        ZeroOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (GameBoard[0][1] == X) {
                    GameBoard[0][1] = "X";
                    ZeroOne.setText(Player);
                    compselection();
                    try {
                        PrintArray();
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                } else {

                }
            }
        });
        ZeroTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (GameBoard[0][2] == X) {
                    GameBoard[0][2] = "X";
                    ZeroTwo.setText(Player);

                    compselection();
                    try {
                        PrintArray();
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                } else {

                }
            }
        });

        // Last Row
        OneZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (GameBoard[1][0] == X) {
                    GameBoard[1][0] = "X";
                    OneZero.setText(Player);
                    compselection();
                    try {
                        PrintArray();
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                } else {

                }
            }
        });
        OneOne.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (GameBoard[1][1] == X) {
                    GameBoard[1][1] = "X";
                    OneOne.setText(Player);
                    compselection();
                    try {
                        PrintArray();
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                } else {

                }
            }
        });
        OneTwo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (GameBoard[1][2] == X) {
                    GameBoard[1][2] = "X";
                    OneTwo.setText(Player);
                    compselection();
                    try {
                        PrintArray();
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                } else {

                }

            }
        });

        // Last Row
        TwoZero.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (GameBoard[2][0] == X) {
                    GameBoard[2][0] = "X";
                    TwoZero.setText(Player);
                    compselection();
                    try {
                        PrintArray();
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                } else {

                }

            }
        });
        TwoOne.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (GameBoard[2][1] == X) {
                    GameBoard[2][1] = "X";
                    TwoOne.setText(Player);
                    compselection();
                    try {
                        PrintArray();
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                } else {

                }
            }
        });
        TwoTwo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (GameBoard[2][2] == X) {
                    GameBoard[2][2] = "X";
                    TwoTwo.setText(Player);
                    compselection();
                    try {
                        PrintArray();
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                } else {

                }
            }
        });

        Reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ZeroZero.setText(X);
                ZeroOne.setText(X);
                ZeroTwo.setText(X);
                OneZero.setText(X);
                OneOne.setText(X);
                OneTwo.setText(X);
                TwoZero.setText(X);
                TwoOne.setText(X);
                TwoTwo.setText(X);

                for (int i = 0; i < GameBoard.length; i++) {
                    for (int k = 0; k < GameBoard[0].length; k++) {
                        GameBoard[i][k] = X;
                    }
                }

            }

        });
    }

    public static void RandomPick(int x, int y) {

        if (GameBoard[x][y] != X && counter < 9) {
            x = (int) (Math.random() * GameBoard.length) + 0;
            y = (int) (Math.random() * GameBoard[0].length) + 0;
            counter++;
            RandomPick(x, y);

        } else {
            GameBoard[x][y] = Comp;
            counter = 0;

        }

    }

    private static void compselection() {// Comp randomly selects an initial cordinate
        // ROw number they are dealing with and the assumed filled positions by the
        // player

        if (GameBoard[0][0] == GameBoard[0][1] && GameBoard[0][0] == Comp && GameBoard[0][2] == X) {// Row 1: 1 and 2
            GameBoard[0][2] = Comp;
        } else if (GameBoard[1][0] == GameBoard[1][1] && GameBoard[1][0] == Comp && GameBoard[1][2] == X) {// Row 2: 1
                                                                                                           // and 2
            GameBoard[1][2] = Comp;
        } else if (GameBoard[2][0] == GameBoard[2][1] && GameBoard[2][0] == Comp && GameBoard[2][2] == X) {// Row 3: 1
                                                                                                           // and 2
            GameBoard[2][2] = Comp;
        }

        // Left to right checking one space apart
        else if (GameBoard[0][0] == GameBoard[0][2] && GameBoard[0][0] == Comp && GameBoard[0][1] == X) {// First row
                                                                                                         // 1:: and 3
            GameBoard[0][1] = Comp;
        } else if (GameBoard[1][0] == GameBoard[1][2] && GameBoard[1][0] == Comp && GameBoard[1][1] == X) {// Second
                                                                                                           // Row 1:
                                                                                                           // and 3
            GameBoard[1][1] = Comp;
        } else if (GameBoard[2][0] == GameBoard[2][2] && GameBoard[2][0] == Comp && GameBoard[2][1] == X) {
            GameBoard[2][1] = Comp;
        }

        // Right to left check
        else if (GameBoard[0][1] == GameBoard[0][2] && GameBoard[0][1] == Comp && GameBoard[0][0] == X) {// ROw 1: 2
                                                                                                         // and 3
            GameBoard[0][0] = Comp;
        } else if (GameBoard[1][1] == GameBoard[1][2] && GameBoard[1][1] == Comp && GameBoard[1][0] == X) {// ROw 1: 2
                                                                                                           // and 3
            GameBoard[1][0] = Comp;
        } else if (GameBoard[2][1] == GameBoard[2][2] && GameBoard[2][1] == Comp && GameBoard[2][0] == X) {// ROw 1: 2
                                                                                                           // and 3
            GameBoard[2][0] = Comp;
        }

        // Check for jhits vertically
        else if (GameBoard[0][0] == GameBoard[1][0] && GameBoard[0][0] == Comp && GameBoard[2][0] == X) {// Colum 1: 1
                                                                                                         // and 2
            GameBoard[2][0] = Comp;
        } else if (GameBoard[0][1] == GameBoard[1][1] && GameBoard[0][1] == Comp && GameBoard[2][1] == X) {// Colum 2:
                                                                                                           // 1 and 2
            GameBoard[2][1] = Comp;
        } else if (GameBoard[0][2] == GameBoard[1][2] && GameBoard[0][2] == Comp && GameBoard[2][2] == X) {// Column
                                                                                                           // 3: 1 and
                                                                                                           // 2
            GameBoard[2][2] = Comp;
        }

        // Verticaly on opposite ends
        else if (GameBoard[0][0] == GameBoard[2][0] && GameBoard[0][0] == Comp && GameBoard[1][0] == X) {// Collum 1:
                                                                                                         // 1 and 3
            GameBoard[1][0] = Comp;
        } else if (GameBoard[0][2] == GameBoard[2][2] && GameBoard[0][2] == Comp && GameBoard[1][2] == X) {// Column
                                                                                                           // 3: 1 and
                                                                                                           // 3
            GameBoard[1][2] = Comp;
        } else if (GameBoard[0][1] == GameBoard[2][1] && GameBoard[0][1] == Comp && GameBoard[1][1] == X) {// Column
                                                                                                           // 2: 1 and
                                                                                                           // 3
            GameBoard[1][1] = Comp;
        }

        // Vertically bottom to top
        else if (GameBoard[1][0] == GameBoard[2][0] && GameBoard[1][0] == Comp && GameBoard[0][0] == X) {
            GameBoard[0][0] = Comp;
        } else if (GameBoard[1][1] == GameBoard[2][1] && GameBoard[1][1] == Comp && GameBoard[0][1] == X) {
            GameBoard[0][1] = Comp;
        } else if (GameBoard[1][2] == GameBoard[2][2] && GameBoard[1][2] == Comp && GameBoard[0][2] == X) {
            GameBoard[0][2] = Comp;
        }

        // Check Diagnaoly
        else if (GameBoard[0][0] == GameBoard[1][1] && GameBoard[0][0] == Comp && GameBoard[2][2] == X) {// Left to
                                                                                                         // right diag
            GameBoard[2][2] = Comp;
        } else if (GameBoard[0][0] == GameBoard[2][2] && GameBoard[0][0] == Comp && GameBoard[1][1] == X) {// Left to
                                                                                                           // right
                                                                                                           // middle
                                                                                                           // missing
            GameBoard[1][1] = Comp;
        } else if (GameBoard[1][1] == GameBoard[2][2] && GameBoard[1][1] == Comp && GameBoard[0][0] == X) {// left to
                                                                                                           // right
                                                                                                           // top left
                                                                                                           // missing
            GameBoard[0][0] = Comp;
        }

        else if (GameBoard[0][2] == GameBoard[1][1] && GameBoard[1][1] == Comp && GameBoard[2][0] == X) {// Right to
                                                                                                         // left diag
            GameBoard[2][0] = Comp;
        } else if (GameBoard[0][2] == GameBoard[2][0] && GameBoard[2][0] == Comp && GameBoard[1][1] == X) {// If
                                                                                                           // middle
                                                                                                           // is empty
            GameBoard[1][1] = Comp;
        } else if (GameBoard[2][0] == GameBoard[1][1] && GameBoard[1][1] == Comp && GameBoard[0][2] == X) {
            GameBoard[0][2] = Comp;
        }
        // Divide between defence
        else if (GameBoard[0][0] == GameBoard[0][1] && GameBoard[0][0] == Player && GameBoard[0][2] == X) {// Row 1: 1
                                                                                                           // and 2
            GameBoard[0][2] = Comp;
        } else if (GameBoard[1][0] == GameBoard[1][1] && GameBoard[1][0] == Player && GameBoard[1][2] == X) {// Row 2: 1
                                                                                                             // and 2
            GameBoard[1][2] = Comp;
        } else if (GameBoard[2][0] == GameBoard[2][1] && GameBoard[2][0] == Player && GameBoard[2][2] == X) {// Row 3: 1
                                                                                                             // and 2
            GameBoard[2][2] = Comp;
        }

        // Left to right checking one space apart
        else if (GameBoard[0][0] == GameBoard[0][2] && GameBoard[0][0] == Player && GameBoard[0][1] == X) {// First row
                                                                                                           // 1:: and 3
            GameBoard[0][1] = Comp;
        } else if (GameBoard[1][0] == GameBoard[1][2] && GameBoard[1][0] == Player && GameBoard[1][1] == X) {// Second
                                                                                                             // Row 1:
                                                                                                             // and 3
            GameBoard[1][1] = Comp;
        } else if (GameBoard[2][0] == GameBoard[2][2] && GameBoard[2][0] == Player && GameBoard[2][1] == X) {
            GameBoard[2][1] = Comp;
        }

        // Right to left check
        else if (GameBoard[0][1] == GameBoard[0][2] && GameBoard[0][1] == Player && GameBoard[0][0] == X) {// ROw 1: 2
                                                                                                           // and 3
            GameBoard[0][0] = Comp;
        } else if (GameBoard[1][1] == GameBoard[1][2] && GameBoard[1][1] == Player && GameBoard[1][0] == X) {// ROw 1: 2
                                                                                                             // and 3
            GameBoard[1][0] = Comp;
        } else if (GameBoard[2][1] == GameBoard[2][2] && GameBoard[2][1] == Player && GameBoard[2][0] == X) {// ROw 1: 2
                                                                                                             // and 3
            GameBoard[2][0] = Comp;
        }

        // Check for jhits vertically
        else if (GameBoard[0][0] == GameBoard[1][0] && GameBoard[0][0] == Player && GameBoard[2][0] == X) {// Colum 1: 1
                                                                                                           // and 2
            GameBoard[2][0] = Comp;
        } else if (GameBoard[0][1] == GameBoard[1][1] && GameBoard[0][1] == Player && GameBoard[2][1] == X) {// Colum 2:
                                                                                                             // 1 and 2
            GameBoard[2][1] = Comp;
        } else if (GameBoard[0][2] == GameBoard[1][2] && GameBoard[0][2] == Player && GameBoard[2][2] == X) {// Column
                                                                                                             // 3: 1 and
                                                                                                             // 2
            GameBoard[2][2] = Comp;
        }

        // Verticaly on opposite ends
        else if (GameBoard[0][0] == GameBoard[2][0] && GameBoard[0][0] == Player && GameBoard[1][0] == X) {// Collum 1:
                                                                                                           // 1 and 3
            GameBoard[1][0] = Comp;
        } else if (GameBoard[0][2] == GameBoard[2][2] && GameBoard[0][2] == Player && GameBoard[1][2] == X) {// Column
                                                                                                             // 3: 1 and
                                                                                                             // 3
            GameBoard[1][2] = Comp;
        } else if (GameBoard[0][1] == GameBoard[2][1] && GameBoard[0][1] == Player && GameBoard[1][1] == X) {// Column
                                                                                                             // 2: 1 and
                                                                                                             // 3
            GameBoard[1][1] = Comp;
        }

        // Vertically bottom to top
        else if (GameBoard[1][0] == GameBoard[2][0] && GameBoard[1][0] == Player && GameBoard[0][0] == X) {
            GameBoard[0][0] = Comp;
        } else if (GameBoard[1][1] == GameBoard[2][1] && GameBoard[1][1] == Player && GameBoard[0][1] == X) {
            GameBoard[0][1] = Comp;
        } else if (GameBoard[1][2] == GameBoard[2][2] && GameBoard[1][2] == Player && GameBoard[0][2] == X) {
            GameBoard[0][2] = Comp;
        }

        // Check Diagnaoly
        else if (GameBoard[0][0] == GameBoard[1][1] && GameBoard[0][0] == Player && GameBoard[2][2] == X) {// Left to
                                                                                                           // right diag
            GameBoard[2][2] = Comp;
        } else if (GameBoard[0][0] == GameBoard[2][2] && GameBoard[0][0] == Player && GameBoard[1][1] == X) {// Left to
                                                                                                             // right
                                                                                                             // middle
                                                                                                             // missing
            GameBoard[1][1] = Comp;
        } else if (GameBoard[1][1] == GameBoard[2][2] && GameBoard[1][1] == Player && GameBoard[0][0] == X) {// left to
                                                                                                             // right
                                                                                                             // top left
                                                                                                             // missing
            GameBoard[0][0] = Comp;
        }

        else if (GameBoard[0][2] == GameBoard[1][1] && GameBoard[1][1] == Player && GameBoard[2][0] == X) {// Right to
                                                                                                           // left diag
            GameBoard[2][0] = Comp;
        } else if (GameBoard[0][2] == GameBoard[2][0] && GameBoard[2][0] == Player && GameBoard[1][1] == X) {// If
                                                                                                             // middle
                                                                                                             // is empty
            GameBoard[1][1] = Comp;
        } else if (GameBoard[2][0] == GameBoard[1][1] && GameBoard[1][1] == Player && GameBoard[0][2] == X) {
            GameBoard[0][2] = Comp;
        } else if (GameBoard[1][0] == GameBoard[2][2] && GameBoard[2][2] == Player && GameBoard[1][1] == X) { // Possible
                                                                                                              // set for
                                                                                                              // two way
            GameBoard[1][1] = Comp;
        } else if (GameBoard[1][0] == GameBoard[0][2] && GameBoard[1][0] == Player && GameBoard[1][1] == X) { // 1 0
                                                                                                              // spot
                                                                                                              // checking
                                                                                                              // for
                                                                                                              // bottom
                                                                                                              // right
                                                                                                              // corner
            GameBoard[1][1] = Comp;
        } else if (GameBoard[0][1] == GameBoard[2][2] && GameBoard[0][1] == Player && GameBoard[1][1] == X) {// Top
                                                                                                             // middle
                                                                                                             // checking
                                                                                                             // bottom
                                                                                                             // right
            GameBoard[1][1] = Comp;
        } else if (GameBoard[0][1] == GameBoard[2][0] && GameBoard[0][1] == Player && GameBoard[1][1] == X) {
            GameBoard[1][1] = Comp;
        } else {
            int RandX = (int) (Math.random() * GameBoard.length) + 0;
            int RandY = (int) (Math.random() * GameBoard[0].length) + 0;

            RandomPick(RandX, RandY);
        }
    }

    public static void CheckingForAWinner(String User) {// Need to do diagonal

        // Checks left to right the top row if they are equal
        if (GameBoard[0][0] == GameBoard[0][1] && GameBoard[0][0] == GameBoard[0][2] && GameBoard[0][0] != X) {
            if (GameBoard[0][0] == Player) {
                SideScore.setText("You won first row");
                Wins++;
                WinLabel.setText("Wins: " + Wins);
            } else {
                SideScore.setText("The comp won");
                Losses++;
                LossLabel.setText("Losses: " + Losses);
            }

            // Checks the second row if they are equal
        } else if (GameBoard[1][0] == GameBoard[1][1] && GameBoard[1][0] == GameBoard[1][2] && GameBoard[1][0] != X) {
            if (GameBoard[1][0] == Player) {
                SideScore.setText("You won first row");
                Wins++;
                WinLabel.setText("Wins: " + Wins);
            } else {
                SideScore.setText("The comp won");
                Losses++;
                LossLabel.setText("Losses: " + Losses);
            }

        } else if (GameBoard[2][0] == GameBoard[2][1] && GameBoard[2][0] == GameBoard[2][2] && GameBoard[2][0] != X) {
            if (GameBoard[2][0] == Player) {
                SideScore.setText("You won first row");
                Wins++;
                WinLabel.setText("Wins: " + Wins);
            } else {
                SideScore.setText("The comp won");
                Losses++;
                LossLabel.setText("Losses: " + Losses);
            }

            // Checks Vertically 1st
        } else if (GameBoard[0][0] == GameBoard[1][0] && GameBoard[0][0] == GameBoard[2][0] && GameBoard[0][0] != X) {
            if (GameBoard[0][0] == Player) {
                SideScore.setText("You won first row");
                Wins++;
                WinLabel.setText("Wins: " + Wins);
            } else {
                SideScore.setText("The comp won");
                Losses++;
                LossLabel.setText("Losses: " + Losses);
            }
        }
        // Second Colum
        else if (GameBoard[0][1] == GameBoard[1][1] && GameBoard[0][1] == GameBoard[2][1] && GameBoard[0][1] != X) {
            if (GameBoard[0][1] == Player) {
                SideScore.setText("You won first row");
                Wins++;
                WinLabel.setText("Wins: " + Wins);
            } else {
                SideScore.setText("The comp won");
                Losses++;
                LossLabel.setText("Losses: " + Losses);
            }
            // System.exit(0);
        } else if (GameBoard[0][2] == GameBoard[1][2] && GameBoard[0][2] == GameBoard[2][2] && GameBoard[0][2] != X) {
            if (GameBoard[0][2] == Player) {
                SideScore.setText("You won first row");
                Wins++;
                WinLabel.setText("Wins: " + Wins);
            } else {
                SideScore.setText("The comp won");
                Losses++;
                LossLabel.setText("Losses: " + Losses);
            }
            // System.exit(0);
        } else if (GameBoard[0][0] == GameBoard[1][1] && GameBoard[0][0] == GameBoard[2][2] && GameBoard[0][0] != X) {
            if (GameBoard[0][0] == Player) {
                SideScore.setText("You won first row");
                Wins++;
                WinLabel.setText("Wins: " + Wins);
            } else {
                SideScore.setText("The comp won");
                Losses++;
                LossLabel.setText("Losses: " + Losses);
            }
            // System.exit(0);
        } else if (GameBoard[2][0] == GameBoard[1][1] && GameBoard[0][2] == GameBoard[2][0] && GameBoard[2][0] != X) {
            if (GameBoard[2][0] == Player) {
                SideScore.setText("You won first row");
                Wins++;
                WinLabel.setText("Wins: " + Wins);
            } else {
                SideScore.setText("The comp won");
                Losses++;
                LossLabel.setText("Losses: " + Losses);
            }
        }

        else if (GameBoard[0][0] != X && GameBoard[0][1] != X && GameBoard[0][2] != X && GameBoard[1][0] != X
                && GameBoard[1][1] != X && GameBoard[1][2] != X
                && GameBoard[2][0] != X && GameBoard[2][1] != X && GameBoard[2][2] != X) {

            SideScore.setText("Cats Game");

        }

    }

    public static void main(String args[]) throws InterruptedException {

        new TicTacToe();

        waitforpresses();

    }

}
