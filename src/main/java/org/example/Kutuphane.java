package org.example;



import java.util.ArrayList;
import java.util.List;

public class Kutuphane {


    private List<Kitap> kitaplar = new ArrayList<>();
    private List<Uye> uyeler = new ArrayList<>();

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public void uyeEkle(Uye uye) {
        uyeler.add(uye);
    }

    public void kitapDurumGoruntuleme() {
        System.out.println("Kütüphane Durumu:");
        System.out.println("Kitaplar:");
        for (Kitap kitap : kitaplar) {
            System.out.println(kitap.getBaslik() + " - Durum: " + kitap.getDurum());
        }
        System.out.println("Üyeler:");
        for (Uye uye : uyeler) {
            System.out.println(uye.getAdSoyad());
            System.out.println("Ödünç Kitaplar:");
            for (Kitap oduncKitap : uye.getOduncKitaplar()) {
                System.out.println(oduncKitap.getBaslik());
            }
            System.out.println();
        }
    }
}
