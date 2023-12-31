package com.veysel.repository;

import com.veysel.repository.entity.Sinif;
import com.veysel.util.HibernateUtility;
import com.veysel.util.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

public class SinifRepository extends MyFactoryRepository<Sinif,Long> {

    EntityManager entityManager = HibernateUtility.getSessionFactory().createEntityManager();
    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
    public SinifRepository() {
        super(new Sinif());
    }

    @Override
    public List<Sinif> findAll() {
        CriteriaQuery<Sinif> criteria = criteriaBuilder.createQuery(Sinif.class);
        Root<Sinif> root = criteria.from(Sinif.class);
        criteria.select(root);
        List<Sinif> sinifList = entityManager.createQuery(criteria).getResultList();
        return sinifList;
    }

    @Override
    public Optional<Sinif> findById(Long id) {
        CriteriaQuery<Sinif> criteria = criteriaBuilder.createQuery(Sinif.class);
        Root<Sinif> root = criteria.from(Sinif.class);
        criteria.select(root);
        criteria.where(criteriaBuilder.equal(root.get("id"),id));
        Sinif sinif = entityManager.createQuery(criteria).getSingleResult();
        return Optional.ofNullable(sinif);
    }
}
