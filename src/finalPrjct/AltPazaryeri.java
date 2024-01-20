package finalPrjct;

public class AltPazaryeri extends Pazaryeri{
	
	
    // Alt sınıfın constructor'ı
    public AltPazaryeri(String isim, String renk,SahiplikBilgisi  sahiplikBilgisi_) {
    	super(isim, renk,sahiplikBilgisi_);
    }

	public static AltPazaryeri olusturAltPazaryeri(String isim, String renk,SahiplikBilgisi  sahiplikBilgisi_) {
		return new AltPazaryeri(isim, renk,sahiplikBilgisi_);
	}

}
