package finalPrjct;


public abstract class Pazaryeri {

    // Sınıf değişkenleri
    private String isim;
    private String renk;
    private SahiplikBilgisi sahiplikBilgisi;
    private String pazaryeriTuru="BELİRSİZ";


    // Nesne kurucu (constructor)
    protected Pazaryeri(String isim, String renk,SahiplikBilgisi sahiplikBilgisi) {
        this.isim = isim;
        this.renk = renk;
        this.sahiplikBilgisi = sahiplikBilgisi;
    }
    
    //setSahiplikBilgisi setter metodu
    public void setSahiplikBilgisi(SahiplikBilgisi sahiplikBilgisi_) {
        this.sahiplikBilgisi = sahiplikBilgisi_;
    }       

    public String getSahiplikBilgisi() {
        System.out.println("SAHİPLİK BİLGİSİ:  "+   sahiplikBilgisi.getDeger());
        return sahiplikBilgisi.getDeger();
    }
    
    // Set metodu - Tüm sınıf değişkenlerine değer atar
    protected void setBilgiler(String isim, String renk) {
        this.isim = isim;
        this.renk = renk;
    }

    // Set metodu - İsim ve renk değişkenlerine değer atar
    protected void setIsimRenk(String isim, String renk) {
        this.isim = isim;
        this.renk = renk;

    }

    // Get metodu - İsim değişkenine erişim
    public String getIsim() {
        System.out.println("PAZARIN İSMİ:  "+ isim);
        return isim;
    }

    // Get metodu - Renk değişkenine erişim
    public String getRenk() {
        System.out.println("PAZARIN RENGİ:  "+ renk);
        return renk;
    }


    public String PazaryeriTuru() {
        System.out.println("PAZARIN TÜRÜ:  "+ pazaryeriTuru);
        return pazaryeriTuru;
    }
    
}