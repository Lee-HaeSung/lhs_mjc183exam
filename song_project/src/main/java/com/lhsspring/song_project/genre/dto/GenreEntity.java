package com.lhsspring.song_project.genre.dto;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity(name = "GenreEntity")
@Table(name = "genre_tb")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GenreEntity implements IGenre{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1씩 증가하는 id
    private Long id;

    @Column(nullable = false, length = 30, unique = true)
    private String name;
}
