package com.veysel.util;

import com.veysel.controller.OgrenciController;
import com.veysel.controller.OgretmenController;
import com.veysel.controller.SinifController;
import com.veysel.enums.EBrans;
import com.veysel.repository.entity.KisiselBilgiler;
import com.veysel.repository.entity.Ogrenci;
import com.veysel.repository.entity.Ogretmen;
import com.veysel.repository.entity.Sinif;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataGenerator {
    OgrenciController ogrenciController;
    OgretmenController ogretmenController;

    SinifController sinifController;

    public DataGenerator(){
        this.ogrenciController = new OgrenciController();
        this.ogretmenController=new OgretmenController();
        this.sinifController=new SinifController();
    }

    public List<Ogrenci> ogrenciOlustur(){

        Ogrenci ogrenci = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Banu")
                        .soyisim("Yilmaz Yildiz")
                        .tcKimlik("256560185")
                        .build())
                .dogumTarihi(LocalDate.of(1996,9,9))
                .build();

        Ogrenci ogrenci1 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Seviay")
                        .soyisim("Biçer Uçar")
                        .tcKimlik("444444")
                        .build())
                .dogumTarihi(LocalDate.of(1992,3,7))
                .build();

        Ogrenci ogrenci2 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Yeliz")
                        .soyisim("H.")
                        .tcKimlik("5202777")
                        .build())
                .dogumTarihi(LocalDate.of(1991,03,14))
                .build();

        Ogrenci ogrenci3 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Sedat")
                        .soyisim("Akdogan")
                        .tcKimlik("45554535")
                        .build())
                .dogumTarihi(LocalDate.of(1997,5,19))
                .build();

        Ogrenci ogrenci4 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Veysel")
                        .soyisim("Kayhan")
                        .tcKimlik("99999799")
                        .build())
                .dogumTarihi(LocalDate.of(1999,3,12))
                .build();

        Ogrenci ogrenci5 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Mert")
                        .soyisim("Duman")
                        .tcKimlik("123478")
                        .build())
                .dogumTarihi(LocalDate.of(1994,10,3))
                .build();

        Ogrenci ogrenci6 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Berke")
                        .soyisim("Yildirimer")
                        .tcKimlik("55531555")
                        .build())
                .dogumTarihi(LocalDate.of(1997,6,26))
                .build();


        Ogrenci ogrenci7 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Zeynep")
                        .soyisim("Seckinli")
                        .tcKimlik("777813")
                        .build())
                .dogumTarihi(LocalDate.of(1995,12,19))
                .build();

        Ogrenci ogrenci8 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Erdal")
                        .soyisim("Kömürcü")
                        .tcKimlik("235698")
                        .build())
                .dogumTarihi(LocalDate.of(1972,7,20))
                .build();

        Ogrenci ogrenci9 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Ugur")
                        .soyisim("Celik")
                        .tcKimlik("0177771")
                        .build())
                .dogumTarihi(LocalDate.of(1994,06,16))
                .build();
        return ogrenciController.saveAll(List.of(ogrenci,ogrenci1,ogrenci2,ogrenci3,ogrenci4,ogrenci5,ogrenci6,ogrenci7,ogrenci8,ogrenci9));
    }



    public List<Ogretmen> ogretmenOlustur(){
        Ogretmen ogretmen = Ogretmen.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Abuzer")
                        .soyisim("Komurcu")
                        .tcKimlik("12375591")
                        .build())
                .iseBaslama(LocalDate.of(1951,7,1))
                .brans(EBrans.KIMYA)
                .build();

        Ogretmen ogretmen2 = Ogretmen.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Alperen")
                        .soyisim("Ikinci")
                        .tcKimlik("45477687")
                        .build())
                .iseBaslama(LocalDate.of(2010,11,13))
                .brans(EBrans.FIZIK)
                .build();

        Ogretmen ogretmen3 = Ogretmen.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Muhammet")
                        .soyisim("Kaya")
                        .tcKimlik("87965426")
                        .build())
                .iseBaslama(LocalDate.of(2003,5,15))
                .brans(EBrans.MATEMATIK)
                .build();

        return  ogretmenController.saveAll(List.of(ogretmen,ogretmen3,ogretmen2));
    }

    public List<Sinif> sinifOlustur(List<Ogrenci> ogrenciList, List<Ogretmen> ogretmenList){
        Sinif sinif = Sinif.builder()
                .sinifAdi("Sinif 1")
                .ogretmenId(ogretmenList.get(0).getId())
                .ogrenciler(ogrenciList.subList(0,3).stream().map(ogrenci -> ogrenci.getKisiselBilgiler().getIsim()).collect(Collectors.toList()))
                .build();
        Sinif sinif2 = Sinif.builder()
                .sinifAdi("Sinif 2")
                .ogretmenId(ogretmenList.get(1).getId())
                .ogrenciler(ogrenciList.subList(3,6).stream().map(ogrenci -> ogrenci.getKisiselBilgiler().getIsim()).collect(Collectors.toList()))
                .build();
        Sinif sinif3 = Sinif.builder()
                .sinifAdi("Sinif 3")
                .ogretmenId(ogretmenList.get(2).getId())
                .ogrenciler(ogrenciList.subList(6,10).stream().map(ogrenci -> ogrenci.getKisiselBilgiler().getIsim()).collect(Collectors.toList()))
                .build();

        return sinifController.saveAll(List.of(sinif,sinif2,sinif3));
    }
}
