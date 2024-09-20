Here's an overview of the T-Rex game in mac-based machine:

https://user-images.githubusercontent.com/84450659/236665602-aac9f7c2-bb33-4e7c-83cf-315eda34376e.mp4

Here are the brief steps of running the file in mac-based machine:

This video consists of the steps involved:

https://user-images.githubusercontent.com/84450659/210307515-01c31b1d-b63a-417f-87b3-63f171e7a7dc.mp4

## About this Project
The previous directory of this repository was 'DinoGame' which was the original name of this project.

The Chrome DinoGame, also known as the offline T-Rex game, was created by Google Chrome engineer, Sebastien Gabriel, in 2014. The game was designed as a fun way to entertain users when their internet connection was lost. The game features a pixelated T-Rex that jumps over cacti and avoids obstacles, with the player earning points for every successful jump. The aim was to develop a cross-platform Java version in order emulate the classic gameplay experience throughout Mac, Ubuntu and Windows.

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
