import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai mata kuliah: ");
        double nilaiMataKuliah = scanner.nextDouble();

        double nilaiIndeks;

        if (nilaiMataKuliah >= 80 && nilaiMataKuliah <= 100) {
            nilaiIndeks = 4.0;
        } else if (nilaiMataKuliah >= 70 && nilaiMataKuliah < 80) {
            nilaiIndeks = 3.0;
        } else if (nilaiMataKuliah >= 60 && nilaiMataKuliah < 70) {
            nilaiIndeks = 2.0;
        } else if (nilaiMataKuliah >= 50 && nilaiMataKuliah < 60) {
            nilaiIndeks = 1.0;
        } else if (nilaiMataKuliah >= 0 && nilaiMataKuliah < 50) {
            nilaiIndeks = 0.0;
        } else {
            System.out.println("Input tidak valid. Masukkan nilai antara 0 dan 100.");
            scanner.close();
            return;
        }

        System.out.println("Nilai indeks: " + nilaiIndeks);

        scanner.close();
    }
}
