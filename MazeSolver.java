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
  private static int[] directions = new int[]{Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST};
  public static boolean solve(Maze maze) {
    Maze snapshot = new Maze(maze);
    if (maze.explorerIsOnA() == 0) {
			return true;
    }
    else {
      maze.go(Maze.EAST);
      System.out.println(maze);
      solve(maze);
    }
    return false;
  }}
