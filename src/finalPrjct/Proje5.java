package finalPrjct;
/*Girilen 5 basamaklı pozitif bir sayıyı basamaklarına ayırarak yazdıran programı Java kullanarak yazınız.*/

import java.util.Scanner;

public class Proje5 {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    System.out.print("Beş Basamaklı bir sayi giriniz: ");
	    int girilenSayi=scan.nextInt();
	    
	    if (girilenSayi >= 10000 && girilenSayi <= 99999) {
            int birlerBasamagi = girilenSayi % 10;
            int onlarBasamagi = (girilenSayi / 10) % 10;
            int yuzlerBasamagi = (girilenSayi / 100) % 10;
            int binlerBasamagi = (girilenSayi / 1000) % 10;
            int onbinlerBasamagi = (girilenSayi / 10000) % 10;
            
    	    System.out.println("Onbinler basamağı: " + onbinlerBasamagi);
            System.out.println("Binler basamağı: " + binlerBasamagi);
            System.out.println("Yüzler basamağı: " + yuzlerBasamagi);
            System.out.println("Onlar basamağı: " + onlarBasamagi);
            System.out.println("Birler basamağı: " + birlerBasamagi);
            
        } 
	    else {
            System.out.println("Girdiğiniz sayı 5 basamaklı değil!");
        }
	    scan.close();
	}

}
