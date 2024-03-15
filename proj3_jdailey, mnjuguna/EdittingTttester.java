
import java.util.Scanner;


/**
 * this class contains 
 * A main method for testing purposes.
 * prints out commands lineto ask for user input
 */

public class EdittingTttester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EditinggManager manager = new EditinggManager();
        
        while (true) {
            System.out.print("Type edit command> ");
            String command = scanner.next();
            
            if (command.equals("quit")) {
                break;
            } else if (command.equals("undo")) {
                manager.undo();
            } else {
                manager.processCommand(command);
            }
        }
        
        scanner.close();
        System.out.println("Good-bye!");
    }

}