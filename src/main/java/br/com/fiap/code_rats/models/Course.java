package br.com.fiap.code_rats.models;

import br.com.fiap.code_rats.dtos.CourseCreationDTO;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
