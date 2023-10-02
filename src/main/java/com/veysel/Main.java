package com.veysel;

import com.veysel.controller.OgrenciController;
import com.veysel.controller.OgretmenController;

import com.veysel.enums.EBrans;
import com.veysel.hql.OgrenciDao;
import com.veysel.repository.entity.KisiselBilgiler;
import com.veysel.repository.entity.Ogrenci;
import com.veysel.repository.entity.Ogretmen;
import com.veysel.repository.entity.Sinif;
import com.veysel.service.OgrenciService;
import com.veysel.util.DataGenerator;
import com.veysel.util.HibernateUtility;
import com.veysel.util.MyFactoryRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Session session ;
        Transaction transaction ;
        session= HibernateUtility.getSessionFactory().openSession();
        transaction=session.beginTransaction();

//
//        Ogretmen ogretmen= Ogretmen.builder()
//                .isim("Alperen")
//                .soyisim("İkinci")
//                .tcKimlik("15475674568")
//                .brans(EBrans.Matematik)
//                .iseBaslama(LocalDate.of(2020,9,29))
//                .build();

//        KisiselBilgiler kisiselBilgiler= KisiselBilgiler.builder()
//                .isim("veysel")
//                .soyisim("Kayhan")
//                .tcKimlik("16325571538")
//                .build();
//
//        KisiselBilgiler kisiselBilgiler1=KisiselBilgiler.builder()
//                .isim("Alperen")
//                .soyisim("Ikinci")
//                .tcKimlik("16325574538")
//                .build();
//
//        Ogrenci ogrenci= Ogrenci.builder()
//                .kisiselBilgiler(kisiselBilgiler)
//                .dogumTarihi(LocalDate.of(1998,8,13))
//                .build();
//
//        Ogretmen ogretmen= Ogretmen.builder()
//                .brans(EBrans.MATEMATIK)
//                .iseBaslama(LocalDate.of(2020,8, 14))
//                .kisiselBilgiler(kisiselBilgiler)
//                .build();
//
//        session.save(ogretmen);
//        session.save(ogrenci);
//
//        Sinif sinif= Sinif.builder()
//                .sinifAdi("MF")
//                .ogretmenId(ogretmen.getId())
//                .ogrenciler(Arrays.asList(ogrenci.getKisiselBilgiler().getIsim()))
//                .build();
//
//        session.save(sinif);
//        transaction.commit();
//        session.close();

//        MyFactoryRepository<Ogrenci,Long>ogrenciRepository= new MyFactoryRepository<>(new Ogrenci());
//        ogrenciRepository.findAll();
//        Long id=1L;
//        System.out.println(ogrenciRepository.findById(id));
//        System.out.println("*******************************************");
//
//        MyFactoryRepository<Ogretmen,Long>ogretmenList= new MyFactoryRepository<>(new Ogretmen());
//        ogretmenList.findAll();
//        System.out.println(ogretmenList.findById(id));
//
//        System.out.println("*******************************************");
//
//        MyFactoryRepository<Sinif,Long>sinifList= new MyFactoryRepository<>(new Sinif());
//        sinifList.findAll();
//        System.out.println(sinifList.findById(id));
//
//        System.out.println("**********************");
//        System.out.println("**********************");
//
//        OgretmenCriteria ogretmenCriteria = new OgretmenCriteria();
//        Ogretmen ogretmen = ogretmenCriteria.findById(1L);
//        List<Ogretmen> ogretmenListe = ogretmenCriteria.findAll();
//        System.out.println("Tekli ogretmen (findById : " + ogretmen);
//        System.out.println("######################################");
//        ogretmenListe.forEach(x -> System.out.println(x));
//
//
//        System.out.println("**********************");

        OgrenciService ogrenciService;

        KisiselBilgiler kisiselBilgiler= KisiselBilgiler.builder()
                .tcKimlik("465465465")
                .isim("Abuzer")
                .soyisim("Komurcu")
                .build();

        Ogretmen ogretmen1=Ogretmen.builder()
                .kisiselBilgiler(kisiselBilgiler)
                .brans(EBrans.KIMYA)
                .iseBaslama(LocalDate.of(2002,4,12))
                .build();
        
        OgretmenController ogretmenController = new OgretmenController();
        
        // ogretmenController.save(ogretmen1);

        DataGenerator dataGenerator = new DataGenerator();
        dataGenerator.ogrenciOlustur();




    }
}