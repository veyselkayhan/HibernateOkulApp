package com.veysel;

import com.veysel.enums.EBrans;
import com.veysel.repository.entity.Ogretmen;
import com.veysel.util.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.Date;

public class Main {


    public static void main(String[] args) {
        Session session ;
        Transaction transaction ;
        session= HibernateUtility.getSessionFactory().openSession();
        transaction=session.beginTransaction();

        Ogretmen ogretmen= Ogretmen.builder()
                .isim("Alperen")
                .soyisim("İkinci")
                .tcKimlik("15475674568")
                .brans(EBrans.Matematik)
                .iseBaslama(LocalDate.of(2020,9,29))
                .build();

        session.save(ogretmen);
        transaction.commit();
        session.close();
    }
}