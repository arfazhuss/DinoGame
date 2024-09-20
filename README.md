# T-Rex Game - Java Implementation
The previous directory of this repository was 'DinoGame' which was the original name of this project. The Chrome DinoGame, also known as the offline T-Rex game, was created by Google Chrome engineer, Sebastien Gabriel, in 2014. The game was designed as a fun way to entertain users when their internet connection was lost. The game features a pixelated T-Rex that jumps over cacti and avoids obstacles, with the player earning points for every successful jump. The aim was to develop a cross-platform Java version in order emulate the classic gameplay experience throughout Mac, Ubuntu and Windows.

Here's an overview of the T-Rex game in mac-based machine:

https://user-images.githubusercontent.com/84450659/236665602-aac9f7c2-bb33-4e7c-83cf-315eda34376e.mp4

## Key Files in the Project

| File                 | Description                                                                 |
|----------------------|-----------------------------------------------------------------------------|
| `Game.java`          | Core game loop handling the timing, game speed, state updates, and user input events such as jumping. |
| `Player.java`        | Represents the T-Rex character, manages actions like jumping, and interacts with the `GameObject` class to control movement. |
| `Obstacle.java`      | Manages obstacles like cacti, handles their movement, and detects collisions with the player. |
| `CloudHandler.java`  | Handles the appearance of clouds in the background, adding depth to the game. |
| `Cloud.java`         | Represents individual cloud objects; visual elements that enhance the game's atmosphere. |
| `Score.java`         | Tracks and displays the player's score, which increments as the player avoids obstacles. |
| `GameWindow.java`    | Manages the rendering of the game window using Java Swing, creating and updating the display frame. |

This table offers a brief explanation of each script's role within the project. Feel free to explore the source code to gain a deeper understanding of how the game is implemented.

## Features

- **Cross-platform Compatibility**: The game runs on Mac, Ubuntu, and Windows, utilizing Java's platform independence.
- **Object-Oriented Design**: The project follows OOP principles to maintain clear class responsibilities, ensuring maintainability and extensibility.
- **Minimal Dependencies**: Designed to be lightweight and easily executable across different environments with minimal external libraries.

## Design Principles

1. **Cross-platform Compatibility**: The game is implemented in Java, enabling it to run on various operating systems like Mac, Ubuntu, and Windows. This aligns with the goal of creating a lightweight, portable application with minimal dependencies.
   
2. **Object-Oriented Design**: The project adheres to OOP principles, where each class has distinct responsibilities. For instance:
   - `Player.java` handles the player's state, actions, and rendering.
   - `Obstacle.java` manages obstacles in the game.
   
3. **Separation of Concerns**: The game logic and rendering responsibilities are distributed across multiple classes to ensure clarity and maintainability:
   - `Player.java` manages the player's movement and jumping mechanics.
   - `Game.java` oversees the overall game state, including timing, input handling, and rendering.

## Stack and Libraries

- **Language**: Java (88.5% of the code). Java is well-suited for this cross-platform project due to its platform independence and robust standard libraries.
- **Graphics Rendering**: The game utilizes Java's `Graphics` class to handle rendering. For example, the `Player` class contains a `render()` method that is responsible for drawing the T-Rex sprite on the screen.
- **Image Handling**: A `SpriteHandler` is used to manage different visual states of the T-Rex, such as standing and jumping.

## Process and Gameplay

- **Game Loop**: The game implements a traditional game loop pattern, where game state updates (`tick()`) and rendering (`render()`) occur in continuous cycles.
   - The `Player` class's `tick()` method updates the T-Rex’s position and handles jumping mechanics.
   
- **Event Handling**: Jumping is controlled through a method called `jumpAction()`, which alters the player’s vertical velocity (`dy`) when the jump is initiated, simulating gravity by gradually increasing `dy` over time.

## Code Structure

- **Player Class**: The `Player` class manages the T-Rex's movement and interaction with the environment. It includes:
   - `tick()`: Updates the player's position and handles movement, including jumping.
   - `render()`: Draws the player sprite onto the game window.
   - Jumping is triggered by setting a `jumping` flag and adjusting the vertical velocity (`dy`).
   
- **GameObject Inheritance**: Entities such as the T-Rex and obstacles likely inherit from a common `GameObject` class, which provides foundational properties like position (`x`, `y`) and velocity (`dx`, `dy`).

## How to Run the Game

1. Download this repository to a local directory (e.g., "Rex Directory").
2. Open a terminal and navigate to the directory using `cd <path-to-directory>`.
3. Compile and run the game using the following command:
   ```bash
   javac Game.java && java Game

This video consists of the steps involved:

https://user-images.githubusercontent.com/84450659/210307515-01c31b1d-b63a-417f-87b3-63f171e7a7dc.mp4
