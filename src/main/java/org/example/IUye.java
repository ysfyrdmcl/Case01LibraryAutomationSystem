package org.example;

import java.util.List;

public interface IUye {
    void kitapOduncAl(Kitap kitap);
    void kitapIadeEt(Kitap kitap);
    List<Kitap> getOduncKitaplar();
    void oduncKitaplarigoruntule();
}
