package finalPrjct;

import java.util.Random;
import java.util.Scanner;
/*Taş, Kağıt, Makas oyununu bilgisayara karşı olacak şekilde yazınız. Taş 0, Kağıt 1, Makas 2 kabul
edilmelidir. Bilgisayar rastgele 0,1 veya 2 üretecektir. 3 kere kazanan oyunu kazanmış sayılmalıdır ve
“Tebrikler” ekrana yazdırılmalıdır.*/

public class Proje11 {

		 public static void main(String[] args) {
			 
		        Scanner scan = new Scanner(System.in);
		        Random random = new Random();

		        int kullaniciSkor = 0;
		        int bilgisayarSkor = 0;
		        int oyunSayisi = 0;	        
		        int kullaniciSecimi;
		        int bilgisayarSecimi;

		        while (kullaniciSkor < 3 && bilgisayarSkor < 3) {
		            System.out.println("\nTaş (0), Kağıt (1), Makas (2) - Bir seçim yapın:");
		            kullaniciSecimi = scan.nextInt();

		            if (kullaniciSecimi < 0 || kullaniciSecimi > 2) {
		                System.out.println("Geçersiz seçim. Lütfen 0, 1 veya 2 girin.");
		                continue;
		            }

		             bilgisayarSecimi = random.nextInt(3);

		            System.out.println("Bilgisayarın seçimi: " + bilgisayarSecimi);

		            if (kullaniciSecimi == bilgisayarSecimi) {
		                System.out.println("Berabere!");
		            } else if ((kullaniciSecimi == 0 && bilgisayarSecimi == 2) ||
		                       (kullaniciSecimi == 1 && bilgisayarSecimi == 0) ||
		                       (kullaniciSecimi == 2 && bilgisayarSecimi == 1)) {
		                System.out.println("Kazandınız!");
		                kullaniciSkor++;
		            } else {
		                System.out.println("Kaybettiniz!");
		                bilgisayarSkor++;
		            }

		            oyunSayisi++;
		            System.out.println("Oyun Sayısı: " + oyunSayisi);
		            System.out.println("Kullanıcı Skoru: " + kullaniciSkor);
		            System.out.println("Bilgisayar Skoru: " + bilgisayarSkor);
		        }

		        if (kullaniciSkor == 3) {
		            System.out.println("Tebrikler Kazadınız!");
		        } 		        		        
		        else if (bilgisayarSkor == 3){
		            System.out.println("Üzgünüz. Bilgisayar oyunu kazandı.");
		        }
		        scan.close();
		        
		    }
	}


