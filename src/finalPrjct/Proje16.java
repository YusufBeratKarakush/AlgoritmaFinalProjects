package finalPrjct;

import java.util.Scanner;

public class Proje16 {

	public static void main(String[] args) {
		
		String txt= "ABCABCABCA";
		Scanner scan= new Scanner(System.in);
	    System.out.print("Bir Karakter giriniz: ");
	    char karakter = scan.next().charAt(0);
	    int sayac=0;
	    int i=0;

	    while (i< txt.length()) {

	    	 if (txt.charAt(i) == karakter) {
	                sayac++;	               
		    }
	    	 i++;
	    }		
	    System.out.print("Girdiğiniz karakterden "+ sayac +" adet vardır.");
	    scan.close();
	}

}
