package br.com.fiap.code_rats.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseCreationDTO {
    private Long id;
    private String name;
    private Double rating;
    private Integer durationInHours;
}
