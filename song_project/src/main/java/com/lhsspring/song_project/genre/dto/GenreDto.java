package com.lhsspring.song_project.genre.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GenreDto implements IGenre{
    private Long id;  // 재즈/팝/힙합/락/헤비메탈
    private String name;
}
