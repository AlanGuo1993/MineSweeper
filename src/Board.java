import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.List;

/**
 * Created by GA on 10/13/17.
 */
public class Board {
    public int numOfRows;
    public int numOfColumns;
    public int[][] cells;
    public int numOfUnsearchedCells;
    public int numOfMines;
    public List<String> mineCoordinateList;

    public Board(int m, int n, int numOfMines, List<String> mineCoordinateList) {
        numOfRows = m;
        numOfColumns = n;
        this.numOfMines = numOfMines;
        cells = new int[numOfRows][numOfColumns];
        numOfUnsearchedCells = numOfRows * numOfColumns;
        this.mineCoordinateList = mineCoordinateList;
        putMines();
    }

    private void putMines() {
        for(String singleMine : mineCoordinateList) {
            String[] singleMineCoordinate = singleMine.split(" ");

            //(x, y) coordinate
            int x = Integer.parseInt(singleMineCoordinate[0]);
            int y = Integer.parseInt(singleMineCoordinate[1]);

//            if(x > numOfRows - 1 || y > numOfColumns - 1 || x < 0 || y < 0) {
//                Exception exception = new Exception("mine should be placed in bound.");
//                return;
//            }
            cells[x][y] = -1;

            if(x - 1 >= 0 && y - 1 >= 0 && cells[x - 1][y - 1] != -1)
                ++cells[x - 1][y - 1];
            if(x >= 0 && y - 1 >= 0 && cells[x][y - 1] != -1)
                ++cells[x][y - 1];
            if(x + 1 <= numOfRows - 1 && y - 1 >= 0 && cells[x + 1][y - 1] != -1)
                ++cells[x + 1][y - 1];
            if(x - 1 >= 0 && y >= 0 && cells[x - 1][y] != -1)
                ++cells[x - 1][y];
            if(x + 1 <= numOfRows -1 && y >= 0 && cells[x + 1][y] != -1)
                ++cells[x + 1][y];
            if(x - 1 >= 0 && y + 1 <= numOfColumns - 1 && cells[x - 1][y + 1] != -1)
                ++cells[x - 1][y + 1];
            if(x >= 0 && y + 1 <= numOfColumns - 1 && cells[x][y + 1] != -1)
                ++cells[x][y + 1];
            if(x + 1 <= numOfRows - 1 && y + 1 <= numOfColumns - 1 && cells[x + 1][y + 1] != -1)
                ++cells[x + 1][y + 1];
        }
    }

    public void print() {
        for(int[] row : cells) {
            for(int cellValue : row) {
                if(cellValue == -1)
                    System.out.print("*" + " ");
                else
                    System.out.print(cellValue + " ");
            }
            System.out.println();
        }
    }
}
