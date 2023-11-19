import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai modal: ");
        int modal = scanner.nextInt();
        System.out.print("Masukkan persentase keuntungan: ");
        int persenKeuntungan = scanner.nextInt();
        double profit = modal + (modal * (persenKeuntungan / 100));

        System.out.println("Modal: " + modal);
        System.out.println("Persentase Keuntungan: " + persenKeuntungan + "%");
        System.out.println("Profit: " + profit);
		
        scanner.close();
    }
}
