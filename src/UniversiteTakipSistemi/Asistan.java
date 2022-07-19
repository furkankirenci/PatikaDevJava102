package UniversiteTakipSistemi;

public class Asistan extends Akademisyen {
    private String ofisSaati;

    public Asistan(String adSoyad, String telNo, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telNo, eposta, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public void quizYap(){
        System.out.println(this.getAdSoyad() + " quiz yapti.");
    }
}
