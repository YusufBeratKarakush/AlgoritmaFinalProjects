package finalPrjct;

/*Bir decimal sayıyı binary (10’luk – 2 ‘lik) sayıya çeviren programı yazınız.*/
public class Proje9 {

	public static void main(String[] args) {

		int decimalSayi=6;

        String binarySayi = decimalToBinary(decimalSayi);//metod çağrılır.

        System.out.println("Decimal Sayının Binary karşılığı: " + binarySayi); //sonuç ekrana yazdırılır

    }

    // Decimal sayıyı binary sayıya çeviren metot
    private static String decimalToBinary(int decimalSayi) {
        StringBuilder binarySayi = new StringBuilder();

        // Decimal sayıyı 2'lik tabana çevirme
        while (decimalSayi > 0) {
            int kalan = decimalSayi % 2;
            binarySayi.insert(0, kalan); // Kısmi binary sayıyı başa ekleme
            decimalSayi /= 2;
        }

        // StringBuilder'dan String'e çevirme
        return binarySayi.toString();
    }
				
	}


