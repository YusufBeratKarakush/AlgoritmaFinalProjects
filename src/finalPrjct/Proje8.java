package finalPrjct;

public class Proje8 {

	public static void main(String[] args) {

		int n = 20; // İlk 20 Fibonacci terimi için

        // Fibonacci dizisi için bir dizi oluştur
        int[] fibonacciDizisi = new int[n];

        // İlk iki terimi elle ata
        fibonacciDizisi[0] = 0;
        fibonacciDizisi[1] = 1;

        // Fibonacci serisini hesapla
        for (int i = 2; i < n; i++) {
            fibonacciDizisi[i] = fibonacciDizisi[i - 1] + fibonacciDizisi[i - 2];
        }

        // Fibonacci serisini ekrana yazdır
        System.out.println("Fibonacci Sayısının ilk 20 terimi:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciDizisi[i] + " ");
        }
    }
		
		
		
	}


