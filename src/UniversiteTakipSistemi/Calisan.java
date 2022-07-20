package UniversiteTakipSistemi;

public class Calisan {
    private String adSoyad;
    private String telNo;
    private String eposta;

    public Calisan(String adSoyad, String telNo, String eposta) {
        this.adSoyad = adSoyad;
        this.telNo = telNo;
        this.eposta = eposta;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void giris() {
        System.out.println(this.adSoyad + " uniye giris yapti.");
    }

    public void cikis() {
        System.out.println(this.adSoyad + " uniden ayrildi.");
    }

    public void yemekhane() {
        System.out.println(this.adSoyad + " yemekhaneye giris yapti.");
    }
    
    public static void loginUsers(Calisan[] loginUser){
        for (Calisan c : loginUser){
            c.giris();
        }
    }

}
