Feature: US14 ViceDean Add-Update Teacher API
  @Api
  Scenario: TC01 Teacher Post-Put Request
    Given Kullanici Post Request ile Teacher olusturur
    Then Post edilen data ile gelen Response dogrulamasi yapilir
    And  Kullanici Put Request yaparak datanın id bilgisi ile Teacher Günceller
    Then Put edilen data ile gelen Response dogrulamasi yapilir

