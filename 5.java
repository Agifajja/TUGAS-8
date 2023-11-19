import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai angka: ");
        double nilaiAngka = scanner.nextDouble();
        char nilaiHuruf;

        if (nilaiAngka >= 80 && nilaiAngka <= 100) {
            nilaiHuruf = 'A';
        } else if (nilaiAngka >= 70 && nilaiAngka < 80) {
            nilaiHuruf = 'B';
        } else if (nilaiAngka >= 60 && nilaiAngka < 70) {
            nilaiHuruf = 'C';
        } else if (nilaiAngka >= 50 && nilaiAngka < 60) {
            nilaiHuruf = 'D';
        } else if (nilaiAngka >= 0 && nilaiAngka < 50) {
            nilaiHuruf = 'E';
        } else {
            System.out.println("Nilai tidak valid.");
            return;
        }

        System.out.println("Nilai huruf: " + nilaiHuruf);
    }
}
