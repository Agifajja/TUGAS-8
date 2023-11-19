import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang Data: ");
        int panjangar = input.nextInt();

        int[] Angka = new int[panjangar];
        int total = 0;

        System.out.println("Masukkan nilai-nilai Data:");
        for (int i = 0; i < panjangar; i++) {
            System.out.print("Angka ke-" + i + ": ");
            Angka[i] = input.nextInt();
            total += Angka[i];
        }

        System.out.println("Data angka:");
        for (int i = 0; i < panjangar; i++) {
            System.out.print("Angka ke-" + i + ": " + Angka[i]);
            if (Angka[i] % 2 == 0) {
                System.out.println(" angka genap");
            } else {
                System.out.println(" angka ganjil");
            }
        }

        double rata = (double) total / panjangar;

        System.out.println("Total angka: " + total);
        System.out.println("Rata-rata angka: " + rata);
    }
}
