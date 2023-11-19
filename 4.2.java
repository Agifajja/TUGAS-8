import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai huruf (A/B/C/D/E): ");
        char nilaiHuruf = scanner.next().charAt(0);

        double nilaiIndeks = 0.0;

        switch (nilaiHuruf) {
            case 'A':
                nilaiIndeks = 4.0;
                break;
            case 'B':
                nilaiIndeks = 3.0;
                break;
            case 'C':
                nilaiIndeks = 2.0;
                break;
            case 'D':
                nilaiIndeks = 1.0;
                break;
            case 'E':
                nilaiIndeks = 0.0;
                break;
            default:
                System.out.println("Input tidak valid. Masukkan nilai huruf yang benar (A/B/C/D/E).");
                scanner.close();
                return;
        }

        System.out.println("Nilai huruf " + nilaiHuruf + " setara dengan nilai indeks " + nilaiIndeks);

        scanner.close();
    }
}
