import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] Angka = new int[7];
        System.out.println("Masukkan 7 angka:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            Angka[i] = input.nextInt();
        }
        System.out.println("Data angka:");
        for (int i = 0; i < 7; i++) {
            System.out.print(Angka[i]);
            if (Angka[i] % 2 == 0) {
                System.out.println(" Angka genap");
            } else {
                System.out.println(" Angka ganjil");
            }
        }
    }
}
