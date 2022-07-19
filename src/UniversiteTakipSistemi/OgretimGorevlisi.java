package UniversiteTakipSistemi;

public class OgretimGorevlisi extends Akademisyen {
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telNo, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telNo, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public void senatoToplantisi() {
        System.out.println(this.getAdSoyad() + " senato toplantisina katildi.");
    }

    public void sinavYap() {
        System.out.println(this.getAdSoyad() + " sinav baslatti.");
    }
}
