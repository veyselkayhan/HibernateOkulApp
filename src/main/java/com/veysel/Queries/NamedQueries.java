package com.veysel.Queries;

import com.veysel.repository.entity.KisiselBilgiler;
import com.veysel.repository.entity.Ogrenci;
import com.veysel.util.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class NamedQueries {
    EntityManager entityManager;

    public NamedQueries() {
        this.entityManager= HibernateUtility.getSessionFactory().createEntityManager();
    }

    public List<String> findAllStudentsByName(){
        TypedQuery<String> namedQuery= entityManager.createNamedQuery("Ogrenci.findAllByIsım", String.class);
        return namedQuery.getResultList();
    }
}
