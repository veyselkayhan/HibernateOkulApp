package com.veysel.repository;

import com.veysel.repository.entity.Ogrenci;
import com.veysel.util.MyFactoryRepository;

public class OgrenciRepository extends MyFactoryRepository<Ogrenci,Long> {
    public OgrenciRepository() {
        super(new Ogrenci());
    }
}
