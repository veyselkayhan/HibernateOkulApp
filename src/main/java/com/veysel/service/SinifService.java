package com.veysel.service;

import com.veysel.repository.SinifRepository;
import com.veysel.repository.entity.Sinif;

import java.util.List;
import java.util.Optional;

public class SinifService {

    SinifRepository sinifRepository;

    public SinifService() {
        this.sinifRepository = new SinifRepository();
    }

    public Sinif save(Sinif sinif) {
        return sinifRepository.save(sinif);
    }

    public void update(Sinif sinif) {
        sinifRepository.update(sinif);
    }

    public List<Sinif> findAll() {
        return sinifRepository.findAll();
    }

    public Optional<Sinif> findById(Long id) {
        return sinifRepository.findById(id);
    }


    public List<Sinif> saveAll(List<Sinif> sinifList){
        return (List<Sinif>) sinifRepository.saveAll(sinifList);
    }

    public void delete(Sinif sinif){
        sinifRepository.delete(sinif);
    }

    public void deleteById(Long id){
        sinifRepository.deleteById(id);
    }

    public boolean existById(Long id){
        return sinifRepository.existById(id);
    }
    public List<Sinif> findByEntity(Sinif sinif){
        return sinifRepository.findByEntity(sinif);
    }

    public List<Sinif> findByColumnNameAndValue(String columnName, String columnValue){
        return sinifRepository.findByColumnNameAndValue(columnName,columnValue);
    }
}
