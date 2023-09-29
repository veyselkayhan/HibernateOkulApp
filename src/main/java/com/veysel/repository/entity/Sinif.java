package com.veysel.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_sinif")
public class Sinif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;

    String sinifAdi;

    Long ogretmenId;

    @ElementCollection
    List<String>ogrenciler;
}
