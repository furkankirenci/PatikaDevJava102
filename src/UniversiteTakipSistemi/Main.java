package UniversiteTakipSistemi;

public class Main {
    public static void main(String[] args) {
        OgretimGorevlisi og1 = new OgretimGorevlisi("Ali", "542","ali@gmail.com","Statik","Prof","1");
        Asistan a1 = new Asistan("Veli", "542","veli@gmail.com","Yapi Statigi","Docent","10.00-18.00");
        LabAsistani l1 = new LabAsistani("Hasan", "542","hasan@gmail.com","Zemin","Arastirma Gorevlisi","10.00-18.00");
        BilgiIslem b1 = new BilgiIslem("Mehmet", "542","mehmet@gmail.com","Veri Takip","17.00-18.00","network kurulum");
        GuvenlikGorevlisi g1 = new GuvenlikGorevlisi("Osman", "542","osman@gmail.com","Guvenlik","17.00-18.00","Guvenlik Belgesi");

        System.out.println(og1.getKapiNo());
        System.out.println(a1.getBolum());
        l1.lablaraGir();
        b1.calis();
        g1.giris();
    }
}
