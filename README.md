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
  return the boolean value of the statement "the maze is navigable, having a legal travel path that is one unit long and that is continuous from a start point to an existing treasure"
  
## English or pseudocode description of algorithm
```
  if the next closest adjacent square is the treasure
    return true
  else if there are no open paths (dead end)
    remove until the last square where there are at least 2 forks in path
  else 
    if there is only square that is legal to move onto
      move forward
    else 
      move one block forward in the most leftward adjacent direction,
      where the path has never travelled before
```
    
## class(es), with fields and methods
  mazeSolver.java
  userOfMazeSolver.java
  Path lineOfPath;
  moveForward();
  turn90();
  remove();

## version*n* wish list
