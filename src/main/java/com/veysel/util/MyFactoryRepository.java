package com.veysel.util;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

public class MyFactoryRepository <T,ID> implements ICrud<T,ID> {

    private Session session;

    private Transaction transaction;

    private CriteriaBuilder criteriaBuilder;

    private EntityManager entityManager;

    T t;
    public MyFactoryRepository(T entity) {
        entityManager=HibernateUtility.getSessionFactory().createEntityManager();
        criteriaBuilder=entityManager.getCriteriaBuilder();
        this.t=entity;
    }

    private void openSession(){
        session=HibernateUtility.getSessionFactory().openSession();
        transaction=session.beginTransaction();
    }

    private void closeSession(){
        transaction.commit();
        session.close();
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T>criteria=(CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T>root=(Root<T>) criteria.from(t.getClass());
        criteria.select(root);
        List<T>findAll=entityManager.createQuery(criteria).getResultList();
        findAll.forEach(System.out::println);
        return findAll;
    }

    @Override
    public Optional<T> findById(ID id) {
        CriteriaQuery<T> criteriaQuery = (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T> root = (Root<T>) criteriaQuery.from(t.getClass());
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.equal(root.get("id"), id));
        try {
            T  findId= entityManager.createQuery(criteriaQuery).getSingleResult();
            return Optional.ofNullable(findId);
        } catch (NullPointerException e) {
            return Optional.empty();
        }
    }
    }



