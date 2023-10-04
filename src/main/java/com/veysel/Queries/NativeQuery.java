package com.veysel.Queries;

import com.veysel.util.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class NativeQuery {
    EntityManager entityManager;

    public NativeQuery() {
        this.entityManager= HibernateUtility.getSessionFactory().createEntityManager();
    }

    public List<String> findAllStudentsByName(){
        List<String> nativeQuery=entityManager.createNativeQuery("Select isim From tbl_ogrenci").getResultList();
        return nativeQuery;
    }
}
