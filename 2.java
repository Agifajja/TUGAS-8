import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan nilai c: ");
        int c = scanner.nextInt();
        double rata = (double)(a + b + c) / 3;

        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        System.out.println("Nilai c: " + c);
        System.out.println("Rata-rata: " + rata);

        scanner.close();
    }
}
