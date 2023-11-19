import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        File evidence = new File("cookedBooks.txt");
        
        if (evidence.exists()) {
            Scanner keyboard = new Scanner(System.in);
            char reply;

            do {
                System.out.print("Delete evidence? (y/n) ");
                reply = keyboard.findWithinHorizon(".", 0).charAt(0);
            } while (reply != 'y' && reply != 'n');

            if (reply == 'y') {
                System.out.println("Okay, here goes...");
                evidence.delete();
                System.out.println("The evidence has been deleted.");
            } else {
                System.out.println("Sorry, buddy. Just asking.");
            }

            keyboard.close();
        }
    }
}
