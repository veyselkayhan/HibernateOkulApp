package com.veysel.repository;

import com.veysel.repository.entity.Sinif;
import com.veysel.util.MyFactoryRepository;

public class SınıfRepository extends MyFactoryRepository<Sinif,Long> {
    public SınıfRepository() {
        super(new Sinif());
    }
}
