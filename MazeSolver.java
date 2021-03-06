/**
  Represent a maze, containing an existing treasure for use with the maze
  solver problem.
  A space " " respresents a wall, a "x" represents a stepping stone, where
  the explorer is legally allowed to move onto, an "e" is the explorer, and
  a "0" is the desired treasure.
  MazeSolver.java will find a path between the explorer and the treasure,
  given that there is a *legal* travelling path and that there is an
  existing treasure.
*/

public class MazeSolver {
    private static Maze maze;
    private static int[] directions = {Maze.EAST, Maze.NORTH, Maze.WEST, Maze.SOUTH};
    public MazeSolver(Maze m) {
        maze = new Maze(m);
    }

    public static boolean solve() {
        if (maze.explorerIsOnA() == Maze.TREASURE) {
            return true;
        }
        else if (maze.explorerIsOnA() == Maze.WALL) {
            return false;
        }
      	else {
            Maze snapshot = new Maze(maze);
            for (int dir = 0; dir < 4; dir++) {
                maze.dropA(Maze.WALL);
                maze.go(directions[dir]);
                if (solve()) {
                    return true;
                }
                maze = new Maze(snapshot);
                System.out.println(maze);
            }
            return false;
        }
    }
  }
