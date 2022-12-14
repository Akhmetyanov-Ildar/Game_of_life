package trainingCode;

public class Cell {
    public static char ALIVE_CELL = '#';
    public static char DEAD_CELL = '.';

    int x;
    int y;
    boolean alive;
    char printableCharacter;
    int neighboursCount;

    public  char getPrintableChar() {
        if(alive) return  ALIVE_CELL;
        else return DEAD_CELL;
    }

    public Cell(int x, int y, boolean alive) {
        this.x = x;
        this.y = y;
        this.alive = alive;
    }
}
