import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by GA on 10/13/17.
 */
public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumOfMines = scanner.nextInt();
        List<String> mineCoordinateList = new ArrayList<>();
        System.out.print("Enter the number of mines: ");
        for(int i = 0; i < totalNumOfMines; i ++) {

        }
        String mineCoordinate = scanner.nextLine();
        Board board = new Board(5, 5, 0);
        board.print();
    }
}
