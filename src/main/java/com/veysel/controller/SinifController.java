package com.veysel.controller;

import com.veysel.repository.entity.Sinif;
import com.veysel.service.SinifService;

import java.util.List;
import java.util.Optional;

public class SinifController {


    SinifService sinifService;

    public Sinif save(Sinif sinif){
        return sinifService.save(sinif);
    }

    public void update(Sinif sinif){
        sinifService.update(sinif);
    }

    public List<Sinif>findAll(){
        return sinifService.findAll();
    }

    public Optional<Sinif>findById(Long id){
        return sinifService.findById(id);
    }




}
