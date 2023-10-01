package com.veysel.util;

import java.util.List;
import java.util.Optional;

public interface ICrud <T,ID>{

    List<T> findAll();

    Optional<T>findById(ID id);

}
