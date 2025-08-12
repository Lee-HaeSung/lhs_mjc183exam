package com.lhsspring.springbootwebprj.genre.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "GenreEntity")
@Table(name = "genre_tb")
public class GenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30, unique = true) //unique 중복제거
    private String name;
}
