package finalPrjct;

import java.util.Scanner;

public class Proje7 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int toplamBuyuk = 0;
	    int toplamKucuk = 0;
	    for (int i = 0; i < 10; i++) {

	      System.out.print((i + 1) + ". sayıyı giriniz: ");

	      int sayi = scan.nextInt();
	      if (sayi >= 50) {
	        toplamBuyuk += sayi;
	      } else {
	        toplamKucuk += sayi;
	      }
	    }
	    double oran = (double) toplamBuyuk / toplamKucuk;

	    System.out.println("50 ve üstü sayıların toplamı: " + toplamBuyuk);
	    System.out.println("50'den küçük sayıların toplamı: " + toplamKucuk);
	    System.out.println("Büyük Sayının Küçük Sayıya Oranı: " + oran);
	    scan.close();
	}

}
