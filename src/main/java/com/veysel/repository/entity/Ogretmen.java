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

    @Enumerated(EnumType.STRING)
    EBrans brans;


    @Builder.Default
    @Column(nullable = false)
    private LocalDate iseBaslama=LocalDate.now();

    @Embedded
    KisiselBilgiler kisiselBilgiler;







}
