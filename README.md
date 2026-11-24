# Dart Game

My first project: a simple dart game written in Java, inspired by a game I really enjoy.

## About

The program asks the user how many darts to throw. For each dart, it generates random x and y coordinates between -7 and 7, figures out which region the dart landed in, and prints the result. If a dart lands outside the four regions, the game ends immediately.

## Regions

| Region | X range | Y range |
|--------|---------|---------|
| A | 0 to 5 | 0 to 5 |
| B | -5 to 0 (excluding 0) | 0 to 5 |
| C | -5 to 0 (excluding 0) | -5 to 0 (excluding 0) |
| D | 0 to 5 | -5 to 0 (excluding 0) |

Any other coordinate counts as a miss.

## Features

- Asks the user for the number of darts to throw
- Generates random x and y coordinates
- Determines regions A, B, C, and D using if-else conditions
- Ends the game when a dart lands in the missed area
- Prints region statistics at the end of the game

## How to Run

1. Open the project in Eclipse (or any Java IDE).
2. Run `DartOyunu`.
3. Enter the number of darts when prompted.

## Sample Output

```
Dart 1:
Coordinates :(3, 2)
Region: A
Dart 2:
Coordinates :(-4, -1)
Region: C
...

Region statistics:
Total game: 135
A: 52 dart(s) 38.51851851851852%
...
```


