
import java.util.Scanner;
import java.util.Stack;

/**
 * **
 * conatin  the edit history manager that keeps track 
 * of the user's edit history
 * has a mxsize field to represent
 * number of entries that can be stored in the history
 *
 * Maintains a stack of editing operations
 * that can be undone.
 * and also necessary declared instance variables 
 * 
 * @author Mnjuguna,julia
 */
public class EditinggManager {
    private Stack<String> stack;
    private int maxSize;



    
    
    /**
     * Constructs a new EditHistoryManager.
     */

    public EditinggManager() {
        stack = new Stack<String>();
        maxSize = 10;
    }


    
    

    /**
     * Performs an editing operation.
     * 
     * @param edit the edit to perform
     */

    public void processCommand(String command) {
        if (command.equals("undo")) {
            undo();
        }
        else if (!command.equals("quit")) {
            stack.push(command);
        }
        if (stack.size() > maxSize) {
            stack.remove(0);
        }
    }



    /**
     * Undoes the last edit operation.
     */

    public void undo() {
        if (!stack.isEmpty()) {
            String lastCommand = stack.pop();
            System.out.println("undone " + lastCommand + " command");
        }
        else {
            System.out.println("no more edits left in undo history");
        }
    }

    //public static void main(String[] args) {
       // EditinggManager manager = new EditinggManager();
        //Scanner scanner = new Scanner(System.in);
        //String command = "";

        //System.out.println("Type edit command>");
        //command = scanner.nextLine();

        //while (!command.equals("quit")) {
           // manager.processCommand(command);
           // System.out.println("Type edit command>");
           // command = scanner.nextLine();
        //}

        //System.out.println("Good-bye!");
    //}
}