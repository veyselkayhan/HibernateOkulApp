package com.veysel.repository.entity;


import com.veysel.enums.EBrans;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_ogretmen")

public class Ogretmen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;

    @Column(nullable = false,length = 30)
    String isim;

    @Column(nullable = false,length = 30)
    String soyisim;

    @Column(unique = true,nullable = false,length = 11)
    String tcKimlik;


    @Enumerated(EnumType.STRING)
    EBrans brans;


    @Builder.Default
    @Column(nullable = false)
    private LocalDate iseBaslama=LocalDate.now();


}
