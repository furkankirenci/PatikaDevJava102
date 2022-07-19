package UniversiteTakipSistemi;

public class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telNo, String eposta, String bolum, String unvan) {
        super(adSoyad, telNo, eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir() {
        System.out.println(this.getAdSoyad() + " derse girdi.");
    }
}
