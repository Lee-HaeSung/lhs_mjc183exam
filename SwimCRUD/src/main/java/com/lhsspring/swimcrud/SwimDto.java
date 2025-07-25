package com.lhsspring.swimcrud;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SwimDto {
    private Long id;
    private String name;
    private int lanes;
    private String lane_type;
    private String center_number;
    private String addr;
}
