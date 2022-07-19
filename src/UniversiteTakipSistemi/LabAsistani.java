package UniversiteTakipSistemi;

public class LabAsistani extends Asistan {
    public LabAsistani(String adSoyad, String telNo, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telNo, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir() {
        System.out.println(this.getAdSoyad() + " laba girdi.");
    }
}
