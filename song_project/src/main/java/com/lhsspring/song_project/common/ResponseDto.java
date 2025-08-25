package com.lhsspring.song_project.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseDto {
    private ResponseEnumCode resultCode;
    private String message;
    private Object resultData;
}
