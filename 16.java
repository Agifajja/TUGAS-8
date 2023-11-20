import static java.lang.System.out;
import java.util.Scanner;

public class Mai {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Nama User: ");
        String username = keyboard.next();

        if (username.equals("Al-Ghifary")) {
            out.print("Pasaword: ");
            String password = keyboard.next();

            if (password.equals("dipenuhisemangat")) {
                out.println("Akun diterima");
            } else {
                out.println("Salah password");
            }
        } else {
            out.println("Kesalahan username");
        }

        keyboard.close();
    }
}
