package com.kiran.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProdRelease {

    private String crq; //change request number
    private String releaseDate;
    private List<String> features;


}
