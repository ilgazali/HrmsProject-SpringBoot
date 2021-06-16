# Human Resource Management System Project 
![hrms-human-resource-management-system](https://user-images.githubusercontent.com/73468385/122237775-44eb8980-cec8-11eb-85d1-20f05f6dc14b.jpg)
# BACKEND İSTERLERİ  
## Sistemimiz üç temel kullanıcı türüne sahiptir. Sistem personeli, İş Arayanlar ve İş verenler.
# :star2: Req 1 : İş Arayanlar sisteme kayıt olabilmelidir.
## Kabul Kriterleri:
### :milky_way: Kayıt sırasında kullanıcıdan ad, soyad, tcno, doğum yılı, e-Posta, şifre, şifre tekrarı bilgileri istenir.
### :milky_way: Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
### :milky_way: Mernis doğrulaması yapılarak sisteme kayıt gerçekleştirilir.
### :milky_way: Doğrulama geçerli değilse kullanıcı bilgilendirilir.
### :milky_way: Daha önce kayıtlı bir e-posta veya tcno var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
### :milky_way: Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir.
# :star2: Req 2 : İş verenler sisteme kayıt olabilmelidir.
## Kabul Kriterleri:
### :milky_way: Kayıt sırasında kullanıcıdan şirket adı, web sitesi, web sitesi ile aynı domaine sahip e-posta, telefon, şifre, şifre tekrarı bilgileri istenir. Burada amaç sisteme şirket olmayanların katılmasını engellemektir.
### :milky_way: Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
### :milky_way: Şirket kayıtları iki şekilde doğrulanır. Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir. HRMS personelinin (bizim :)) onayı gerekmektedir.
### :milky_way: Daha önce kayıtlı bir e-posta var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
# :star2: Req 3 : Sisteme genel iş pozisyonu isimleri eklenebilmelidir. (Örneğin Software Developer, Software Architect.)
## Kabul Kriterleri:
### :milky_way: Bu pozisyonlar tekrar edemez. Kullanıcı uyarılır.
##--------- Sistem'e Swagger desteği getirildi
# :star2: Req 4 : İş verenler listelenebilmelidir. (Sadece tüm liste)
# :star2: Req 5 : İş arayanlar listelenebilmelidir. (Sadece tüm liste)
# :star2: Req 6 : İş pozisyonları listelenebilmelidir. (Sadece tüm liste)
# :star2: Req 7 : İş verenler sisteme iş ilanı ekleyebilmelidir.
###  İş ilanı formunda;
### :milky_way: Seçilebilir listeden (dropdown) genel iş pozisyonu seçilebilmelidir.(Örneğin Java Developer)(Zorunlu)
### :milky_way: İş tanımı girişi yapılabilmelidir. (Örneğin; firmamız için JAVA, C# vb. dillere hakim....)(Zorunlu)
### :milky_way: Şehir bilgisi açılır listeden seçilebilmelidir. (Zorunlu)
### :milky_way: Maaş skalası için min-max girişi yapılabilmelidir. (Opsiyonel)
### :milky_way: Açık pozisyon adedi girişi yapılabilmelidir. (Zorunlu)
### :milky_way: Son başvuru tarihi girişi yapılabilmelidir.
# :star2: Req 8 : Sistemdeki tüm aktif iş ilanları listelenebilmelidir.
### :milky_way: Liste, tablo formunda gelmelidir.
### :milky_way: Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.
# :star2: Req 9 : Sistemdeki tüm aktif iş ilanları tarihe göre listelenebilmelidir.
### :milky_way: Liste, tablo formunda gelmelidir.
### :milky_way: Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.
# :star2: Req 10 : Sistemde bir firmaya ait tüm aktif iş ilanları listelenebilmelidir.
### :milky_way: Liste, tablo formunda gelmelidir.
### :milky_way: Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.
# :star2: Req 11 : İş verenler sistemdeki bir ilanı kapatabilmelidir. (Pasif ilan)
# :star2: Req 12: Adaylar sisteme CV girişi yapabilmelidir.
### :milky_way: Adaylar okudukları okulları sisteme ekleyebilmelidir. (Okul adı, bölüm)
### :milky_way: Bu okullarda hangi yıllarda okuduklarını sisteme girebilmelidir.
### :milky_way: Eğer mezun değilse mezuniyet yılı boş geçilebilmelidir.
### :milky_way: Adayların okudukları okullar mezuniyet yılına göre tersten sıralanabilmelidir. Mezun olunmamışsa yine bu okul en üstte ve "devam ediyor" olarak görüntülenmelidir.
### :milky_way: Adaylar iş tecübelerini girebilmelidir. (İş yeri adı, pozisyon)
### :milky_way: Bu tecrübelerini hangi yıllarda yaptıklarını sisteme girebilmelidir.
### :milky_way: Eğer hala çalışıyorsa işten ayrılma yılı boş geçilebilmelidir.
### :milky_way: Adayların tecrübeleri yıla göre tersten sıralanabilmelidir. Hala çalışıyorsa yine bu tecrübesi en üstte ve "devam ediyor" olarak görüntülenmelidir.
### :milky_way: Adaylar bildikleri yabancı dilleri sisteme girebilmelidir. ( Dil, Seviye -> 1-5)
### :milky_way: Adaylar sisteme fotoğraf girebilmelidir. Adaya ait fotoğraf https://cloudinary.com/pricing sisteminde tutulacaktır.
### :milky_way: Adaylar sisteme github adreslerini girebilmelidir.
### :milky_way: Adaylar sisteme linkedin adreslerini girebilmelidir.
### :milky_way: Adaylar bildikleri programlama dillerini veya teknolojilerini sisteme girebilmelidir. (Programlama/Teknoloji adı) Örneğin; React
### :milky_way: Adaylar sisteme ön yazı ekleyebilmelidir. (Örneğin: Çalışmayı çok severim....)
# :star2: Req 13 : Bir adaya ait tüm CV bilgisi görüntülenebilmelidir.
## Veri tabanı olarak PostgreSQL kullanılmıştır. Projenin güncel veri tabanı modeli aşağıdaki gibidir:
![Untitled (2)](https://user-images.githubusercontent.com/73468385/122258454-b8e25d80-ced9-11eb-85f8-5c7d0f85d9b2.png)



