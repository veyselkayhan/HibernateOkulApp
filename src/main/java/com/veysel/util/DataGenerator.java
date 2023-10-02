package com.veysel.util;

import com.veysel.controller.OgrenciController;
import com.veysel.repository.entity.KisiselBilgiler;
import com.veysel.repository.entity.Ogrenci;
import com.veysel.repository.entity.Sinif;

import java.time.LocalDate;
import java.util.Arrays;

public class DataGenerator {
    OgrenciController ogrenciController;

    public DataGenerator(){
        this.ogrenciController = new OgrenciController();
    }

    public void ogrenciOlustur(){

        Ogrenci ogrenci = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Banu")
                        .soyisim("Yilmaz Yildiz")
                        .tcKimlik("25656201085")
                        .build())
                .dogumTarihi(LocalDate.of(1996,9,9))
                .build();
        OgrenciController ogrenciController = new OgrenciController();
        ogrenciController.save(ogrenci);

        Ogrenci ogrenci1 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Seviay")
                        .soyisim("Biçer Uçar")
                        .tcKimlik("44444444444")
                        .build())
                .dogumTarihi(LocalDate.of(1992,3,7))
                .build();
        ogrenciController.save(ogrenci1);

        Ogrenci ogrenci2 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Yeliz")
                        .soyisim("H.")
                        .tcKimlik("520257777")
                        .build())
                .dogumTarihi(LocalDate.of(1991,03,14))
                .build();
        ogrenciController.save(ogrenci2);


        Ogrenci ogrenci3 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Sedat")
                        .soyisim("Akdogan")
                        .tcKimlik("455545345345")
                        .build())
                .dogumTarihi(LocalDate.of(1997,5,19))
                .build();
        ogrenciController.save(ogrenci3);

        Ogrenci ogrenci4 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Veysel")
                        .soyisim("X_KRALTR_X")
                        .tcKimlik("99999999")
                        .build())
                .dogumTarihi(LocalDate.of(1999,3,12))
                .build();
        ogrenciController.save(ogrenci4);
        Ogrenci ogrenci5 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Mert")
                        .soyisim("Duman")
                        .tcKimlik("1234789")
                        .build())
                .dogumTarihi(LocalDate.of(1994,10,3))
                .build();
        ogrenciController.save(ogrenci5);

        Ogrenci ogrenci6 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Berke")
                        .soyisim("Shaco Main")
                        .tcKimlik("5555555555")
                        .build())
                .dogumTarihi(LocalDate.of(1997,6,26))
                .build();
        ogrenciController.save(ogrenci6);


        Ogrenci ogrenci7 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Zeynep")
                        .soyisim("Seckinli")
                        .tcKimlik("777")
                        .build())
                .dogumTarihi(LocalDate.of(1995,12,19))
                .build();

        ogrenciController.save(ogrenci7);
        Ogrenci ogrenci8 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Erdal")
                        .soyisim("Kömürcü")
                        .tcKimlik("23546988")
                        .build())
                .dogumTarihi(LocalDate.of(1972,7,20))
                .build();
        ogrenciController.save(ogrenci8);

        Ogrenci ogrenci9 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Ugur")
                        .soyisim("AAAAAA")
                        .tcKimlik("0177777701")
                        .build())
                .dogumTarihi(LocalDate.of(1994,06,16))
                .build();
        ogrenciController.update(ogrenci9);
    }

    public void ogretmenOlustur(){

    }

    public void sinifOlustur(){


    }
}
