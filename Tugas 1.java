import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables
        String nama = "Contoh";
        int angka = 36;
        int x = 5;
        int y = 7;
        int z = 9;
        double akar = Math.sqrt(angka);
        int angka1 = 4;
        int angka2 = 3;
        double result = Math.pow(angka1, angka2);
        
        // Mencetak ke layar tulisan sekaligus varibael 
        System.out.println("Test! " + nama);
        // Deklarasi sekaligus inisialisasi variabel baru
        System.out.println("Angka pertamanya: " + angka);
        System.out.println("Angka xyz " + "= " + x + y + z);
        // Menghitung akar 2 dari sebuah angka
        System.out.println("Akar dari " + angka + ": " + akar);
        // Menghitung pangkat
        System.out.println(angka2 + " Pangkat " + angka1 + ": " + result);
        // Inputan keyboard 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);
        scanner.close();
    }
}
