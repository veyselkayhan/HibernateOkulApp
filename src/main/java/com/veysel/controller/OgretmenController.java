package com.veysel.controller;

import com.veysel.repository.entity.Ogretmen;
import com.veysel.service.OgrenciService;
import com.veysel.service.OgretmenService;

import java.util.List;
import java.util.Optional;

public class OgretmenController {

    OgretmenService ogretmenService;

    public OgretmenController (){
        this.ogretmenService = new OgretmenService();
    }

    public Ogretmen save(Ogretmen ogretmen){
        return ogretmenService.save(ogretmen);
    }

    public void update(Ogretmen ogretmen){
        ogretmenService.update(ogretmen);
    }

    public List<Ogretmen> findAll(){
        return ogretmenService.findAll();
    }

    public Optional<Ogretmen> findById(Long id){
        return ogretmenService.findById(id);
    }


    public List<Ogretmen> saveAll(List<Ogretmen> ogretmenList){
        return (List<Ogretmen>) ogretmenService.saveAll(ogretmenList);
    }

    public void delete(Ogretmen ogretmen){
        ogretmenService.delete(ogretmen);
    }

    public void deleteById(Long id){
        ogretmenService.deleteById(id);
    }

    public boolean existById(Long id){
        return ogretmenService.existById(id);
    }
    public List<Ogretmen> findByEntity(Ogretmen ogretmen){
        return ogretmenService.findByEntity(ogretmen);
    }

    public List<Ogretmen> findByColumnNameAndValue(String columnName, String columnValue){
        return ogretmenService.findByColumnNameAndValue(columnName,columnValue);
    }

}
