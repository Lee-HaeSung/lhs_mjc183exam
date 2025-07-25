package com.lhsspring.common;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDto {
    private ResponseCode code;
    private String message;
    private Object responseData;
}
