import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan Fibonacci serisinin eleman sayısını alıyoruz
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        // İlk iki elemanını tanımlıyoruz
        int first = 0, second = 1;

        System.out.print("Fibonacci Serisi: " + first + " " + second + " ");

        // Döngü ile Fibonacci serisini oluşturuyoruz
        for (int i = 2; i < n; i++) {  // İlk iki elemanı zaten yazdığımız için 2'den başlıyoruz
            int next = first + second;
            System.out.print(next + " ");

            // Değerleri güncelliyoruz
            first = second;
            second = next;
        }
    }
}
