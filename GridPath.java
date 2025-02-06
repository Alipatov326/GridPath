public class GridPath {
    public GridPath(int[][] values)
    {
        grid = values;
    }
    public String toString(){
        String s = "";
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                s += grid[row][col] + " ";
            }
            s += "\n";
        }
        return s;
    }
    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;

    /**
     * Returns the Location representing a neighbor of the grid element at row and
     * col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public Location getNextLoc(int row, int col) {
        int below = Integer.MAX_VALUE;
        if(row<grid.length-1) below = grid[row+1][col];
        int right = Integer.MAX_VALUE;;
        if(col<grid[0].length-1) right = grid[row][col+1];
        if(below<right) return new Location(row+1,col);
        else return new Location(row, col+1);
    }        /* to be implemented in part (a) */

    /**
     * Computes and returns the sum of all values on a path through grid, as
     * described in
     * part (b)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public int sumPath(int row, int col) {
        int sum = grid[row][col];
        while(row < grid.length - 1 || col < grid[0].length - 1) {
            Location loc = getNextLoc(row, col);
            row = loc.getRow();
            col = loc.getCol();
            sum += grid[row][col];
        }
        return sum;
        /* to be implemented in part (b) */ }
}
