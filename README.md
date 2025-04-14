# Tic Tac Toe

A classic game of Tic Tac Toe implemented in Java using the Swing GUI library. This game lets you play as "X" against a basic AI that plays as "O". The computer makes decisions based on simple logic to either win or block your moves.

---

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [How to Run](#how-to-run)
- [Usage](#usage)
- [Controls](#controls)
- [Game Logic](#game-logic)
- [Dependencies](#dependencies)
- [Troubleshooting](#troubleshooting)
- [License](#license)

---

## Introduction

**Tic Tac Toe** is a turn-based, two-player strategy game where the player competes against a computer. The player uses the symbol "X" while the computer uses "O". The game is played on a 3x3 grid.

---

## Features

- Classic 3x3 Tic Tac Toe gameplay
- GUI built with Java Swing
- Simple AI that attempts to win or block your moves
- Win/Loss tracking with counters
- Reset functionality to replay instantly
- Basic "cat's game" (draw) detection

---

## Installation

1. Ensure you have **Java JDK** installed (version 8 or above).
2. Download or clone the project repository.
3. Compile the Java file using an IDE or terminal.

---

## How to Run

### Using terminal:
1. Open your terminal and navigate to the directory containing `TicTacToe.java`
2. Compile: javac TicTacToe.java
3. Run: java TicTacToe

   
### Using an IDE:
1. Open the file in IntelliJ IDEA, Eclipse, NetBeans, etc.
2. Run the `main()` method in the `TicTacToe` class.

---

## Usage

1. When the window opens, you'll see a 3x3 board with all buttons initialized to `.`.
2. Click on an empty cell to place your "X".
3. The computer will automatically make its move as "O" after yours.
4. A side panel tracks your wins and losses.
5. Click the **Reset** button at any time to start a new game without closing the app.

---

## Controls

| Button        | Function                      |
|---------------|-------------------------------|
| 3x3 Grid      | Places "X" in that cell        |
| Reset         | Resets the board and score     |

---

## Game Logic

- The game board is a 2D array.
- The player's move is recorded as `"X"`, and the AI responds with `"O"`.
- The AI first checks for winning moves, then tries to block you, otherwise it picks a random spot.
- The game automatically detects wins, losses, and ties.
- Scores are displayed in real-time.

---

## Dependencies

- Java AWT and Swing libraries (included in the JDK)

---

## Troubleshooting

- **No window appears**: Ensure your Java is properly installed and you're running the correct compiled class.
- **Buttons don’t respond**: Try resetting the game using the Reset button.
- **AI behaves unexpectedly**: The AI logic is rule-based and not perfect. It's designed for simplicity, not unbeatable play.

---

## License

This project is intended for learning purposes and personal use. No license is currently applied.


