# Rock-Paper-Scissors
This is an example of a rock paper scissors game I created using Java 8.  
Play against the computer by selecting rock, paper, or scissors, 
and see who wins the best of the chosen number of rounds!

## Features

- User chooses the number of rounds to play (between 1 and 10)
- Random computer choice each round
- Score tracking for player, computer, and ties
- Declares the winner at the end of all rounds

## Project Structure
Rock-Paper-Scissors/
├── src/
│ └── main/
│ └── java/
│ └── com/
│ └── sg/
│ └── rockpaperscissors/
│ └── Game.java
├── README.md

- The main game logic is located in `Game.java` under the package `com.sg.rockpaperscissors`.
- This follows a standard Java project structure with source files organized under `src/main/java`.

## How to Build and Run

1. Make sure you have Java installed (Java 8 or higher recommended).
2. Navigate to the project root directory: cd Rock-Paper-Scissors

3. Compile the Java source files: javac src/main/java/com/sg/rockpaperscissors/Game.java

4. Run the game: java -cp src/main/java com.sg.rockpaperscissors.Game

5. Follow the on-screen prompts to enter the number of rounds and your choice each round:
- Enter `1` for Rock
- Enter `2` for Scissors
- Enter `3` for Paper

---

## Gameplay Rules

- Rock beats Scissors
- Scissors beats Paper
- Paper beats Rock
- If both player and computer choose the same, it's a tie
