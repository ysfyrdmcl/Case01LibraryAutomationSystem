package org.example;



import java.util.ArrayList;
import java.util.List;

public class Uye implements IUye{

    private String adSoyad;
    private List<Kitap> oduncKitaplar = new ArrayList<>();

    public Uye(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    @Override
    public String toString() {
        return "Uye{" +
                "adSoyad='" + adSoyad + '\'' +
                ", oduncKitaplar=" + oduncKitaplar +
                '}';
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }



    public void setOduncKitaplar(List<Kitap> oduncKitaplar) {
        this.oduncKitaplar = oduncKitaplar;
    }

    @Override
    public void kitapOduncAl(Kitap kitap) {
        if (kitap.getDurum() == Durum.ODUNC_ALINABILIR) {
            kitap.oduncAl();
            oduncKitaplar.add(kitap);
            System.out.println(adSoyad + " isimli üye " + kitap.getBaslik() + " kitabını ödünç aldı.");
        } else {
            System.out.println("Bu kitap şu anda ödünç alınamaz.");
        }
    }

    @Override
    public void kitapIadeEt(Kitap kitap) {
        if (oduncKitaplar.contains(kitap)) {
            kitap.iadeEt();
            oduncKitaplar.remove(kitap);
            System.out.println(adSoyad + " isimli üye " + kitap.getBaslik() + " kitabını iade etti.");
        } else {
            System.out.println("Bu kitap zaten size ödünç verilmemiş.");
        }
    }

    @Override
    public List<Kitap> getOduncKitaplar() {
        return oduncKitaplar;
    }

    @Override
    public void oduncKitaplarigoruntule() {

        if (oduncKitaplar.isEmpty()) {
            System.out.println(adSoyad + " adlı üyenin ödünç aldığı kitap bulunmamaktadır.");
        } else {
            System.out.println(adSoyad + " adlı üyenin ödünç aldığı kitaplar:");
            for (Kitap kitap : oduncKitaplar) {
                System.out.println(kitap.getBaslik());
            }
        }
    }

}
