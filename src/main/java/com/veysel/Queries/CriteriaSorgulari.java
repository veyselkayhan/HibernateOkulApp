package com.veysel.Queries;

import com.veysel.Views.VwOgrenci;
import com.veysel.repository.entity.Ogrenci;
import com.veysel.util.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CriteriaSorgulari {
    private EntityManager entityManager;
    private CriteriaBuilder criteriaBuilder;

    public CriteriaSorgulari() {
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }

    public List<String> findAllStudentsByName(){
        CriteriaQuery<String> criteria = criteriaBuilder.createQuery(String.class);
        Root<Ogrenci> ogrenciRoot = criteria.from(Ogrenci.class);
        criteria.select(ogrenciRoot.get("kisiselBilgiler").get("isim"));

//        TypedQuery<String> query = entityManager.createQuery(criteria);
//        return query.getResultList();
        List<String> result = entityManager.createQuery(criteria).getResultList();
        return result;
    }

}
