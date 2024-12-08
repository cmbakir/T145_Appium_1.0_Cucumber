Feature: Kullanici Aile Butcem uygulamasindaki gorevleri yerine getirir


    Background:
    * ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
    * "mail" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap"
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin

    Scenario Outline: Kullanici Aile Butcem uygulamasinda profil bilgilerinin degistirir
      * sol kisimdaki menuden "Hesabım" bolumune gidin
      * hesabim sayfasindaki bilgileri degistirerek "<isim>" "<soyisim>" "<sehir>" "<yas>" "<meslek>" ve cinsiyet "Kadın" degisikleri kaydedin ve değişikleri dogrulayin
      * uygulamayi kapatir

      Examples:
      |isim     |soyisim    |sehir     |   yas    |  meslek   |
      |isim1    |soyisim1   |sehir1    |   yas1   |  meslek1  |
      |isim2    |soyisim2   |sehir2    |   yas2   |  meslek2  |


  Scenario:Kullanici Aile Butcem uygulamasinda profil bilgilerinin degistirir
    * sol kisimdaki menuden "Hesabım" bolumune gidin
    * hesabim sayfasindaki bilgileri degistirerek "isim" "soyisim" "sehir" "yas" "meslek" ve cinsiyet "Kadın" degisikleri kaydedin ve değişikleri dogrulayin
    * uygulamayi kapatir

  @aile
  Scenario: Kullanici Ayrlar bolumunde verilen gorevleri yapar
    * sol kisimdaki menuden "Ayarlar" bolumune gidin

  Scenario: Kullanici bize ulasin bolumunde verilen gorevleri yapar
    * sol kisimdaki menuden "Bize Ulasin" bolumune gidin
