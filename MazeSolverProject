
package mazeproj;

public class MazeSolverProject {


    public static void main(String[] args) {
        int grid = 5;
        int[][] maze = getMaze(grid);
        
       Stack path = new Stack();
       maze[1][1]=2;      
       System.out.println("First version of the maze");
       MazeUtility.plotMaze(maze);       
       System.out.println("Last version of the maze");
       MazeUtility.plotMaze(MazeRunner(grid));
       
       
    }
        
    public static int[][] MazeRunner(int grid){
    int[][] maze = getMaze(grid);
    Stack<int[]> pathStack = new Stack<>();  // Stack to store coordinates [i, j]
    
    int i = 1;  // Starting row
    int j = 1;  // Starting column
    pathStack.push(new int[]{i, j});  // Push the starting coordinates to the stack
    maze[i][j] = 2;  
    while (!(i == 2 * grid - 1 && j == 2 * grid - 1)) {
       if (pathStack.isEmpty()) {
            System.out.println("No valid path found.");
            break;
        }
      
       else if(isValidMove(maze,i,j-1)){  // path above current path              
        //    maze[i][j]=0; 
           pathStack.push(new int[]{i, j-1});                    
           maze[i][j-1]=2;
                 j--;            
              continue;
           }         
       else if(isValidMove(maze,i,j+1)){  // path under current path                            
          //   maze[i][j]=0; 
              pathStack.push(new int[]{i, j+1}); 
              maze[i][j+1]=2;
                 j++;
                 continue;
           }    
       else if(isValidMove(maze,i-1,j)){  // right path of current path            
          //   maze[i][j]=0; 
              pathStack.push(new int[]{i-1, j});
              maze[i-1][j]=2;  
              i--;    
              continue;
              
           }
         else if(isValidMove(maze,i+1,j)){  // left path of current path           
         //    maze[i][j]=0;   
              pathStack.push(new int[]{i+1, j});      
              maze[i+1][j]=2;
              i++;
              continue;
           }      
         else { // If no valid move
            maze[i][j] = 0; 
            pathStack.pop(); 
        }
       MazeUtility.plotMaze(maze);
     
     } 
    return maze;
     }

    // checks if the given coordinates are valid(equals to 0-space)
    private static boolean isValidMove(int[][] maze, int x, int y) {
        return x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] ==0;
    }
   
   
    public static int[][] getMaze(int grid) {
        MazeGenerator maze = new MazeGenerator(grid);  
        String str = maze.toString();   //getting the maze as a string(X,0,current path and spaces)
        
        int[][] maze2D = MazeUtility.Convert2D(str);   //converting the string maze as an integer 2D array
        return maze2D;  
    }   
}
