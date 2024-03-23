package org.example;



import java.time.LocalDate;




public abstract class Kitap {

    private Long ISBN;
    private String baslik;
    private String yazar;
    private LocalDate yayinYili;

    private Kutuphane kutuphane;

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "ISBN=" + ISBN +
                ", baslik='" + baslik + '\'' +
                ", yazar='" + yazar + '\'' +
                ", yayinYili=" + yayinYili +
                ", kutuphane=" + kutuphane +
                ", durum=" + durum +
                '}';
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public LocalDate getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(LocalDate yayinYili) {
        this.yayinYili = yayinYili;
    }

    public Kutuphane getKutuphane() {
        return kutuphane;
    }

    public void setKutuphane(Kutuphane kutuphane) {
        this.kutuphane = kutuphane;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }

    private Durum durum;

    public void oduncAl() {
        durum = Durum.ODUNC_VERILDI;
    }

    public void iadeEt() {
        durum = Durum.ODUNC_ALINABILIR;
    }
}
