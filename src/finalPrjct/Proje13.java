package finalPrjct;

import java.util.Scanner;

/*Kullanıcıdan alınan 3 sayı ile üçgen oluşup oluşmadığını, üçgen ise eşkenar, ikizkenar ve dik kenar
olup olmadığını denetleyen ve sonucu yazdıran programı yazınız.*/

public class Proje13 {

	public static void main(String[] args) {

		
		   Scanner scanner = new Scanner(System.in);

	        // Kullanıcıdan üç kenar uzunluğunu alın
	        System.out.print("Birinci kenar uzunluğunu girin: ");
	        int kenarBir = scanner.nextInt();

	        System.out.print("İkinci kenar uzunluğunu girin: ");
	        int kenarİki = scanner.nextInt();

	        System.out.print("Üçüncü kenar uzunluğunu girin: ");
	        int kenarUc = scanner.nextInt();

	        // Üçgen olup olmadığını kontrol et
	        if (isUcgen(kenarBir, kenarİki, kenarUc)) {
	            // Eşkenar, ikizkenar ve dik üçgen kontrolü
	            if (kenarBir == kenarİki && kenarİki == kenarUc) {
	                System.out.println("Bu bir eşkenar üçgendir.");
	            } else if (kenarBir == kenarİki || kenarBir == kenarUc || kenarİki == kenarUc) {
	                System.out.println("Bu bir ikizkenar üçgendir.");
	            }

	            if (isDikUcgen(kenarBir, kenarİki, kenarUc)) {
	                System.out.println("Bu aynı zamanda bir dik üçgendir.");
	            }
	        } else {
	            System.out.println("Bu kenar uzunlukları ile bir üçgen oluşturulamaz.");
	        }

	        scanner.close();
	    }

	    // Üçgen olup olmadığını kontrol eden metot
	    private static boolean isUcgen(int kenarBir, int kenarİki, int kenarUc) {
	        return (kenarBir + kenarİki > kenarUc) && (kenarBir + kenarUc > kenarİki) && (kenarİki + kenarUc > kenarBir);
	    }

	    // Dik üçgen olup olmadığını kontrol eden  pisagor metotu
	    private static boolean isDikUcgen(int kenarBir, int kenarİki, int kenarUc) {
	        int[] kenarlar = { kenarBir, kenarİki, kenarUc };
	        // Kenar uzunluklarını sırala
	        java.util.Arrays.sort(kenarlar);

	        // Pisagor teorem kontrolü
	        return Math.pow(kenarlar[0], 2) + Math.pow(kenarlar[1], 2) == Math.pow(kenarlar[2], 2);
	    }
		
		
	}


