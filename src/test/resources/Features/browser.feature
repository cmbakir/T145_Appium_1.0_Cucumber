Feature: Kullanici ilgili browsera gider
  @browser
  Scenario: Kullanici ilgili browseri acar
    #Given Kullanici hepsiburada adresine gider
    Given "url" sayfasina gider
    Then Avantajli urunler icon u oldugunu dogrular
    Then Avantajli urunler listesinin acildigini dogrular
