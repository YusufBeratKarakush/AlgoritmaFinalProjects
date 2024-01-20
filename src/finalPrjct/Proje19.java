package finalPrjct;
/* Farklı pazaryerleri için bir sınıf tanımlanacaktır. Bu sınıf; pazaryerlerinin isim, renk, ve ("yerli", "yabancı"
ve "melez" değerlerinden birini alabilecek) sahiplik bilgisini tutacaktır. Ancak, bu sınıftan nesneler
oluşturulmayacak/oluşturulamayacak, sınıf daha sonra türetilecek sınıflara temel teşkil edecektir.
Ayrıca, sınıf değişkenlerine, sınıf dışından erişilemeyecek, ve tüm bu sınıf değişkenlerine değer atayan
ve sınıf dışından erişilebilecek tek bir nesne kurucu (constructor) tanımlanacaktır.
Yine sınıf degişkenleri sayısında parametre alan ve bunları sınıf değişkenlerine atayan bir set metodu,
ve isim ile renk değişkenleri için parametre alan ve bunları bu iki sınıf değişkenine atayan diğer bir set
metodu olmak üzere 2 set metodu tanımlanırken; sınıf değişkenlerinin her biri için ayrı ayrı get
metodları tanımlanacaktır. Son olarak, Pazaryeri sınıfı içerisinde PazaryeriTuru isimli ve dışardan
erişilebilen bir metod tanımlanacaktır. Bu metod parametre almayacak ve değer olarak "belirsiz"
döndürecektir.
Pazaryeri isimli bu sınıfı tanımlayan java kodunu yazınız.*/


public class Proje19 {

	public static void main(String[] args) {		

		AltPazaryeri altPazarYeri;	
		AltPazaryeri altPazarYeri2;		

		altPazarYeri=AltPazaryeri.olusturAltPazaryeri("BAKIRKOY PAZARI", "YEŞİL",SahiplikBilgisi.YERLI);
		altPazarYeri.getIsim();
		altPazarYeri.getRenk();
		altPazarYeri.PazaryeriTuru();
		altPazarYeri.getSahiplikBilgisi();	
		
		
        System.out.println("//////////////////////////////////////////");

		
		altPazarYeri2=AltPazaryeri.olusturAltPazaryeri("KADIKÖY PAZARI", "KIRMIZI",SahiplikBilgisi.YABANCI);
		altPazarYeri2.getIsim();
		altPazarYeri2.getRenk();
		altPazarYeri2.PazaryeriTuru();
		altPazarYeri2.getSahiplikBilgisi();	
		
	}

}
