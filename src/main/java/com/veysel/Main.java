package com.veysel;

import com.veysel.enums.EBrans;
import com.veysel.repository.entity.KisiselBilgiler;
import com.veysel.repository.entity.Ogrenci;
import com.veysel.repository.entity.Ogretmen;
import com.veysel.repository.entity.Sinif;
import com.veysel.util.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class Main {


    public static void main(String[] args) {
        Session session ;
        Transaction transaction ;
        session= HibernateUtility.getSessionFactory().openSession();
        transaction=session.beginTransaction();


//        Ogretmen ogretmen= Ogretmen.builder()
//                .isim("Alperen")
//                .soyisim("İkinci")
//                .tcKimlik("15475674568")
//                .brans(EBrans.Matematik)
//                .iseBaslama(LocalDate.of(2020,9,29))
//                .build();

        KisiselBilgiler kisiselBilgiler= KisiselBilgiler.builder()
                .isim("veysel")
                .soyisim("Kayhan")
                .tcKimlik("16325571538")
                .build();

        KisiselBilgiler kisiselBilgiler1=KisiselBilgiler.builder()
                .isim("Alperen")
                .soyisim("Ikinci")
                .tcKimlik("16325574538")
                .build();

        Ogrenci ogrenci= Ogrenci.builder()
                .kisiselBilgiler(kisiselBilgiler)
                .dogumTarihi(LocalDate.of(1998,8,13))
                .build();

        Ogretmen ogretmen= Ogretmen.builder()
                .brans(EBrans.MATEMATIK)
                .iseBaslama(LocalDate.of(2020,8, 14))
                .kisiselBilgiler(kisiselBilgiler)
                .build();

        session.save(ogretmen);
        session.save(ogrenci);

        Sinif sinif= Sinif.builder()
                .sinifAdi("MF")
                .ogretmenId(ogretmen.getId())
                .ogrenciler(Arrays.asList(ogrenci.getKisiselBilgiler().getIsim()))
                .build();

        session.save(sinif);
        transaction.commit();
        session.close();
    }
}