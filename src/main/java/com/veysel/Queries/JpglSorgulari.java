package com.veysel.Queries;

import com.veysel.util.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpglSorgulari {

    EntityManager entityManager;

    public JpglSorgulari() {
        this.entityManager= HibernateUtility.getSessionFactory().createEntityManager();
    }

    public List<String> findAllStudentsByName(){
        String jpql="Select o.kisiselBilgiler.isim FROM Ogrenci o";
        List<String>result=entityManager.createQuery(jpql,String.class).getResultList();
        return result;
    }
}
