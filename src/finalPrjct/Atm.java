package finalPrjct;

import java.util.Scanner;

public class Atm {

	 private int atmNo;
	 private double bakiye;
   	 Scanner scanner = new Scanner(System.in);


	    public Atm(int atmNo) {
	        this.atmNo = atmNo;
	        this.bakiye = 0.0;
	    }

	  
	    public int getAtmNo() {
	        return atmNo;
	    }

	    public double getBakiye() {
	        return bakiye;
	    }

	    public void setBakiye(double bakiye) {
	        this.bakiye = bakiye;
	    }

	    public void paraYatir(double miktar) {
	        if (miktar > 0) {
	            this.bakiye += miktar;
	            System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + this.bakiye + " TL");
	        } else {
	            System.out.println("Geçersiz miktar. Lütfen pozitif bir değer girin.");
	        }
	    }

	    public void paraCek(double miktar) {
	        if (miktar > 0 && miktar <= this.bakiye) {
	            this.bakiye -= miktar;
	            System.out.println(miktar + " TL çekildi. Yeni bakiye: " + this.bakiye + " TL");
	        } else if (miktar <= 0) {
	        	System.out.println("Geçersiz miktar. Lütfen pozitif bir değer girin.");
	        } else {
	            System.out.println("Yetersiz bakiye. Çekim işlemi gerçekleştirilemedi.");
	        }
	    }
	    	        
	    public void hesapKontrolu() {

	        while (true) {           
	            if (kayitKontrol()==true) {
	                System.out.println("Başarıyla giriş yapıldı.");
	                break;
	            } else {
	                System.out.println("Geçersiz hesap numarası veya şifre. Tekrar deneyin.");                
	            }
	            kayitKontrol();
	        }
            scanner.close();
	    }
	    
	    public boolean kayitKontrol() {
	        // Burada gerçek bir hesap numarası ve şifre kontrolü yapılabilir.
	        // Örnek olarak 1234 hesap numarasına ve 5678 şifresine sahip bir kullanıcıyı kabul ediyoruz.
	    	int hesap=getHesap();
	    	int sifre=getSifre();
	    	if(hesap == 1234 && sifre == 5678) { 
	    	return true;}
	    	else {return false;}
	    }
	    	   
	    	public int getHesap() {	    
		 	 System.out.print("Hesap Numaranızı Giriniz : ");
	         int hesapNo_ = scanner.nextInt();
	         return  hesapNo_;  	
	    }
	    		    	
	    	public int getSifre() {
		         System.out.print("Şifrenizi Giriniz : ");
		         int sifre_ = scanner.nextInt();
		         return sifre_;
		         }
	    	
		        
		    
}


	    	
	    
	 

