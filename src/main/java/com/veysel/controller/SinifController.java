package com.veysel.controller;

import com.veysel.repository.entity.Sinif;
import com.veysel.service.SinifService;

import java.util.List;
import java.util.Optional;

public class SinifController {


    SinifService sinifService;

    public SinifController (){
        this.sinifService = new SinifService();
    }

    public Sinif save(Sinif sinif){
        return sinifService.save(sinif);
    }

    public void update(Sinif sinif){
        sinifService.update(sinif);
    }

    public List<Sinif> findAll(){
        return sinifService.findAll();
    }

    public Optional<Sinif> findById(Long id){
        return sinifService.findById(id);
    }


    public List<Sinif> saveAll(List<Sinif> sinifList){
        return (List<Sinif>) sinifService.saveAll(sinifList);
    }

    public void delete(Sinif sinif){
        sinifService.delete(sinif);
    }

    public void deleteById(Long id){
        sinifService.deleteById(id);
    }

    public boolean existById(Long id){
        return sinifService.existById(id);
    }
    public List<Sinif> findByEntity(Sinif sinif){
        return sinifService.findByEntity(sinif);
    }

    public List<Sinif> findByColumnNameAndValue(String columnName, String columnValue){
        return sinifService.findByColumnNameAndValue(columnName,columnValue);
    }



}
