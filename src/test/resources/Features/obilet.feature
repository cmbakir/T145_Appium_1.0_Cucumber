Feature: Kullanici obilet sayfasindaki gorevleri yapar

  Scenario: Kullanici obilet sayfasina gider
    Given "ObiletURL" sayfasina gider
    When Dil türkce secilir
    When Para birimi TL secilir
    When Otobus bul a tiklanir
    Then Gelen bilet fiyatinin tl para birimi oldugu dogrulanir


