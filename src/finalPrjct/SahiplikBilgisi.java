package finalPrjct;

public enum SahiplikBilgisi {
	
    YERLI("YERLİ"),
    YABANCI("YABANCI"),
    MELEZ("MELEZ");

    private final String deger;

    SahiplikBilgisi (String deger) {
        this.deger = deger;
    }

    public String getDeger() {
        return deger;
    }

}
