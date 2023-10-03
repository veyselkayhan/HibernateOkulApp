package com.veysel.repository;

import com.veysel.repository.entity.Ogrenci;
import com.veysel.util.HibernateUtility;
import com.veysel.util.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

public class OgrenciRepository extends MyFactoryRepository<Ogrenci,Long> {

    EntityManager entityManager = HibernateUtility.getSessionFactory().createEntityManager();
    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

    public OgrenciRepository() {
        super(new Ogrenci());
    }

    @Override
    public List<Ogrenci> findAll() {
        CriteriaQuery<Ogrenci> criteria = criteriaBuilder.createQuery(Ogrenci.class);
        Root<Ogrenci> root = criteria.from(Ogrenci.class);
        criteria.select(root);
        List<Ogrenci> ogrenciList = entityManager.createQuery(criteria).getResultList();
        return ogrenciList;
    }

    @Override
    public Optional<Ogrenci> findById(Long id) {
        CriteriaQuery<Ogrenci> criteria = criteriaBuilder.createQuery(Ogrenci.class);
        Root<Ogrenci> root = criteria.from(Ogrenci.class);
        criteria.select(root);
        criteria.where(criteriaBuilder.equal(root.get("id"),id));
        Ogrenci ogrenci = entityManager.createQuery(criteria).getSingleResult();
        return Optional.ofNullable(ogrenci);
    }

}
