
package mazeproj;

public class MazeUtility {
    
    public static int[][] Convert2D(String str) {
                int i=0, j=0;   //row and column as i and j
                for (i=0;str.charAt(i)!='\n';i++) {}   
                int[][] maze2D = new int[i+1][i+1];         
                i=0;           //reseting row
        for (int c = 0; c<str.length(); c++) {    
            if (str.charAt(c)=='X') {   //if the character is x
                maze2D[i][j]=1;              //set coordinates as 1 which is a wall
                j++;                         //increase the column
            }
            else if (str.charAt(c)=='O') {   //if the character is 0
                maze2D[i][j]=2;                   //set coordinates as 2 which is the current path
                j++;                              //increase column
            }
            else if (str.charAt(c)==' ') {   //if the character is space
                j++;                              //just increase the column
            }
            else if (str.charAt(c)=='\n') {  //if the character is a new line
                i++; j=0;                         //increase row and reset column
            }                    
        }
        return maze2D;    

    }
    
    public static void plotMaze(int[][] maze) {  //takes an integer array
        for (int i=0;i<maze.length;i++) {       //a loop for the rows of the array
            for (int j=0;j<maze[0].length;j++)  //and another one for the columns of the array
                if (maze[i][j]==1)              //if the coordinates are 1 than:
                    System.out.print('X');   //print X for walls
                else if (maze[i][j]==2)        //if the coordinates are 2 than:
                    System.out.print('O');   //print 0 for the current path
                else                           //if the coordinates are empty space than:
                    System.out.print(' ');   //print space
            System.out.println();       
        }        
    }
}
