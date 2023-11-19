import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai angka: ");
        double nilaiAngka = scanner.nextDouble();

        char nilaiHuruf;
        switch ((int) nilaiAngka / 10) {
            case 10:
            case 9:
                nilaiHuruf = 'A';
                break;
            case 8:
                nilaiHuruf = 'B';
                break;
            case 7:
                nilaiHuruf = 'C';
                break;
            case 6:
                nilaiHuruf = 'D';
                break;
            default:
                nilaiHuruf = 'E';
        }

        System.out.println("Nilai huruf: " + nilaiHuruf);

        scanner.close();
    }
}
