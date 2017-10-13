import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by GA on 10/13/17.
 */
public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of mines: ");
        int totalNumOfMines = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the number of rows: ");
        int numOfRows = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the number of columns: ");
        int numOfColumns = Integer.parseInt(scanner.nextLine());
        List<String> mineCoordinateList = new ArrayList<>();
        System.out.println("Enter coordinates for mines (x and y split by single space): ");
        for(int i = 0; i < totalNumOfMines; i ++) {
            mineCoordinateList.add(scanner.nextLine());
        }
        Board board = new Board(numOfRows, numOfColumns, totalNumOfMines, mineCoordinateList);
        board.print();
    }
}
