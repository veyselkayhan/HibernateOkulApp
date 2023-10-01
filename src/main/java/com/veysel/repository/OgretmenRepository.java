package com.veysel.repository;

import com.veysel.repository.entity.Ogretmen;
import com.veysel.util.MyFactoryRepository;

public class OgretmenRepository extends MyFactoryRepository<Ogretmen,Long> {
    public OgretmenRepository() {
        super(new Ogretmen());
    }
}
