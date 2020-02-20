/**
 * Implements a 2-D array of characters
 */
import java.util.Arrays;
public class CharMatrix
{
  // Fields:
  char[][] grid;

  /**
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  public CharMatrix(int rows, int cols)
  {
    this.grid = new char[rows][cols];
    for (char[] row : grid) 
        Arrays.fill(row, ' '); 
  }

  /**
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
      this.grid = new char[rows][cols];
      for (char[] row : grid) 
        Arrays.fill(row, fill); 
  }

  /**
   * Returns the number of rows in grid
   */
  public int numRows()
  {
    int count = 0;
    for(char[] row : grid)
        count++;
    return count;
  }

  /**
   * Returns the number of columns in grid
   */
  public int numCols()
  {
      int count = 0;
      for(int i = 0; i < grid[0].length; i++)
        count++;
      return count;
  }

  /**
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {
    return grid[row][col];
  }

  /**
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
    grid[row][col] = ch;
  }

  /**
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col)
  {
    if(grid[row][col] == ' ')
        return true;
    else
        return false;
  }

  /**
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for(int r = row0; r <= row1; r++)
        for(int c = col0; c <= col1; c++)
            grid[r][c] = fill;
  }

  /**
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    for(int r = row0; r <= row1; r++)
        for(int c = col0; c <= col1; c++)
            grid[r][c] = ' ';
  }

  /**
   * Returns the count of all non-SPACE characters in row.
   */
  public int countInRow(int row)
  {
    int count = 0;
    for(int r = 0; r < grid[row].length; r++)
        if(!(grid[row][r] == ' '))
            count++;
    return count;
  }

  /**
   * Returns the count of all non-SPACE characters in col.
   */
  public int countInCol(int col)
  {
    int count = 0;
    for(int c = 0; c < grid.length; c++)
        if(!(grid[c][col] == ' '))
            count++;
    return count;
  }
}
