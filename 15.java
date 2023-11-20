import javax.swing.JOptionPane;

public class Authentication {

    public static void main(String args[]) {
        String username = JOptionPane.showInputDialog("Nama Pengguna");
        String password = JOptionPane.showInputDialog("Sandi");

        if (username != null && password != null &&
                ((username.equals("Ahmad") && password.equals("Istimewa")) ||
                 (username.equals("Agit") && password.equals("smile")))) {
            JOptionPane.showMessageDialog(null, "You're in.");
        } else {
            JOptionPane.showMessageDialog(null, "Authentication failed.");
        }
    }
}
