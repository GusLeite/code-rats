package br.com.fiap.code_rats.models;

import br.com.fiap.code_rats.dtos.CourseCreationDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private Double rating;
    @NotNull
    private Integer durationInHours;

    public void updateData(CourseCreationDTO data){
        if (data.getDurationInHours() != 0) this.durationInHours = data.getDurationInHours();
        if (data.getRating() != 0) this.rating = data.getRating();
        if (data.getName() != null) this.name = data.getName();
    }
}
