public class Location {
    private int theRow;
    private int theCol;
    public String toString(){
        return theRow + ", " + theCol;
    }
    public Location(int r, int c) {
        theRow = r;
        theCol = c;
    }

    public int getRow() {
        return theRow;
    }

    public int getCol() {
        return theCol;
    }
}
