/**
 * Created by GA on 10/13/17.
 */
public class Board {
    public int[][] cells;
    public int numOfUnsearchedCells;

    public Board(int m, int n, int numOfMines) {
        cells = new int[m][n];
        numOfUnsearchedCells = m * n;

    }

    public void print() {
        for(int[] row : cells) {
            for(int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
