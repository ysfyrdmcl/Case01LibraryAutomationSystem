CASE-1-Başlangıç Seviye: Kütüphane Otomasyon Sistemi  
Bir kütüphane programı, kitapların ödünç alınması ve iade edilmesi için bir otomasyon sistemi 
oluşturmanız isteniyor. Bu sistemi Java programlama dili ile OOP prensiplerine uygun bir şekilde 
geliştirmeniz gerekiyor.  
Kütüphanemizde birden fazla türde kitaplar bulunmaktadır. Örneğin (Bilim, Roman, Tarih, v.b.) bu kitap 
türleri zaman içerisinde genişletilebilir yapıda olmalıdır. Kütüphanemizde tek tip üye bulunmaktadır. 
Kütüphane sistemine dahil olan herkes kütüphane stoğunda bulunan kitaplardan ödünç alabilir. 
(Ödünç işlemi için şartlar; sisteme dahil olmak ve kütüphane stoğundan yeterli sayıda kitap olması.)  
Beklenen İşlevler:  
• Bir üye kitap ödünç alabilmeli.  
• Bir üye ödünç aldığı kitabı iade edebilmeli.  
• Bir kitabın mevcut durumu güncellenebilmeli (ödünç alınabilir, ödünçte, mevcut 
değil). 
• Bir üyenin ödünç aldığı kitapları görüntüleyebilmeli. 
• Kütüphane durumunu (mevcut kitaplar, ödünç alınan kitaplar, üyeler vb.) 
görüntüleyebilmeli. 
Başlangıç:  
Öncelikle yeni bir java projesi oluşturalım ve adını Case01 _JavaLibraryManagement diyelim. Bu 
uygulama aşağıda gösterildiği gibi altı sınıftan oluşmaktadır.  
• Kitap (Abstract Class)  
• Durum (Enum)  
• KitapBilim: Kitap (Sub Class)  
• KitapRoman: Kitap (Sub Class)  
• KitapTarih: Kitap (Sub Class)  
• IUye : (Interface)  
• Uye: IUye (Inheritance)  
• Kutuphane (Class)  
Temel Bileşenler:  
1. Kitap: Kitapların temel özelliklerini (ISBN, başlık, yazar, yayın yılı vb.) içerir ve diğer 
kitap türleri için temel (base class) görevi görür.  
2. KitapBilim, KitapRoman, KitapTarih: Kütüphanede bulunan kitap türlerimize göre 
BaseKitap’dan kalıtım alırak kütüphanedeki kitap türü kadar alt sınıf (sub class) 
oluşturulur. (KitapBilim, KitapRoman, v.b.) Bu sınıf mevcut durumunu (ödünç alınabilir, 
ödünçte, mevcut değil) tutan bir sınıf olmalıdır.  
3. Durum: Kitap sınıfı içerisinde kullanmak üzere kitapların ödünç durumunu belirtmek 
için (OduncAlabilir, OduncVerildi, MevcutDegil, v.b.) bir enum tanımlayın.  
5. IUye:  Üyelerin ödünç kitap alma ve iade etme gibi işlemleri gerçekleştirmelerini 
sağlayan metotları tanımlayan bir interface. Bu interface, üyelerin kütüphane sistemiyle 
etkileşimini yöneten metotları içerir. 
6. Üye: IUye interface’inden implent edilerek kütüphaneye üye olan kişilerin özelliklerini 
ve metotlarının uygulandığı bir sınıf.   
6. Kütüphane: Kitapları ve üyeleri yöneten ana sınıf. Kitapların ödünç verilmesi, iade 
edilmesi ve mevcut durumunun güncellenmesi gibi işlemleri yapacak metotları içermeli.  
Bu programı hazırlayanız. Buradaki yapılar dışında ekleme yapmak istediğiniz tüm yapıları 
ekleyebileceğinizi unutmayınız. 
