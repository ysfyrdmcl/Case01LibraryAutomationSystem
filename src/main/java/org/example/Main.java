package org.example;

public class Main {
    public static void main(String[] args) {
        Kutuphane kutuphane = new Kutuphane();
        kutuphane.kitapDurumGoruntuleme();

        System.out.println("--------------------");
        System.out.println("--------------------");

        Kitap kitap1 = new KitapBilim();
        kitap1.setBaslik("Bilim Kitabı 1");
        kitap1.setDurum(Durum.ODUNC_ALINABILIR);
        kutuphane.kitapEkle(kitap1);

        Kitap kitap2 = new KitapRoman();
        kitap2.setBaslik("Roman Kitabı 1");
        kitap2.setDurum(Durum.MEVCUT_DEGIL);
        kutuphane.kitapEkle(kitap2);
        kutuphane.kitapDurumGoruntuleme();

        System.out.println("--------------------");
        System.out.println("--------------------");

        Uye uye1 = new Uye("Ahmet");
        Uye uye2 = new Uye("Mehmet");
        kutuphane.uyeEkle(uye1);
        kutuphane.uyeEkle(uye2);

        uye1.kitapOduncAl(kitap1);
        kutuphane.kitapDurumGoruntuleme();
        System.out.println("--------------------");
        System.out.println("--------------------");
        uye2.kitapOduncAl(kitap2);
        uye1.kitapIadeEt(kitap1);
        kutuphane.kitapDurumGoruntuleme();
        System.out.println("--------------------");
        System.out.println("--------------------");
        kitap2.setDurum(Durum.ODUNC_ALINABILIR);
        uye2.kitapOduncAl(kitap2);
        kutuphane.kitapDurumGoruntuleme();

        uye2.oduncKitaplarigoruntule();

    }
}