package com.veysel.service;

import com.veysel.repository.OgretmenRepository;
import com.veysel.repository.entity.Ogrenci;
import com.veysel.repository.entity.Ogretmen;

import java.util.List;
import java.util.Optional;

public class OgretmenService {
    OgretmenRepository ogretmenRepository;

    public OgretmenService() {
        this.ogretmenRepository=new OgretmenRepository();
    }

    public Ogretmen save(Ogretmen ogretmen){
        return ogretmenRepository.save(ogretmen);
    }

    public void update(Ogretmen ogretmen){
        ogretmenRepository.update(ogretmen);
    }

    public List<Ogretmen>findAll(){
        return ogretmenRepository.findAll();
    }

    public Optional<Ogretmen>findById(Long id){
        return ogretmenRepository.findById(id);
    }
}
