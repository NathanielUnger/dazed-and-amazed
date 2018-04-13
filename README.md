# dazed-and-amazed

## personnel
  Unger, Nathaniel<br>
  Zhao, Kevin
  
## statement of problem
  Navigate a two-dimensional maze and
  
  return a boolean value determining whether or not it is navigable.

## recursive abstraction
  When I am asked to
    <br>return the boolean value of the statement "the maze is navigable, having a legal travel path that is continuous from start point to existing treasure"
    <br>the recursive abstraction can
    <br>return the boolean value of the statement "the maze is navigable, having a legal travel path that is continuous from start point to existing treasure" given moves already made.
  
## base case
  return the boolean value of the statement "the maze is navigable, having a legal travel path that is one unit long and that is continuous from an initial start point to existing treasure"
  
## English or pseudocode description of algorithm
```
  if the current square is the treasure
    return true
  else if the current square is out of bounds
    remove until the last square where there are at least 2 forks in path
  else
    move forwards
    if the current square is out of bounds
    backtrack and move one block forward in the most leftward adjacent direction,
    where the path has never travelled before
```
    
## class(es), with fields and methods
  mazeSolver.java  
  userOfMazeSolver.java  
  Path lineOfPath;  
  moveForward();  
  turn90();  
  remove(); 

## known bugs
  mazeSolver is unable to solve mazes just yet, though the maze.go(direction) function does work. the method always returns false, except when an explorer is spawned on top of the treasure. when the explorer does land on top of the treasure, the method doesn't return true. 
  i'm familiar on how to backtrack the maze to a previous position, and have the working code, but am still unable to implement it into our design. 

## version*n* wish list
