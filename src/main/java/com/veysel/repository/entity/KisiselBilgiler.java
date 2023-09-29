package com.veysel.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class KisiselBilgiler  {


    @Column(nullable = false,length = 30)
    String isim;

    @Column(nullable = false,length = 30)
    String soyisim;

    @Column(unique = true,nullable = false,length = 11)
    String tcKimlik;





}
