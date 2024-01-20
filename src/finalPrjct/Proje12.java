package finalPrjct;

public class Proje12 {

	public static void main(String[] args) {
		
		   String kelime = "Programlama";
	        int uzunluk = kelime.length();

	        for (int i = 0; i < uzunluk+1; i++) {
	            for (int j = i; j < uzunluk; j++) {
	                System.out.print(kelime.charAt(j));
	            }
	            for (int k = 0; k < i; k++) {
	                System.out.print(kelime.charAt(k));
	            }
	            System.out.println();
	        }
	    }
	}


