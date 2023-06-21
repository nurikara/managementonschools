

Feature: US-17 Teacher öğrencilere not verebilmeli
  Background:Login
    Given Kullanici  "vicedean" olarak giriş yapar
    And Kullanıcı sağ üstte bulunan "Menü" butonuna tıklar
    And Kullanıcı çıkan menüden "Teacher Management" yazısını tıklar
    Then Kullanıcı "Choose Lessons" alanını tıklayarak çıkan listeden ders seçimini yapar