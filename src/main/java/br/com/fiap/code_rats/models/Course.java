package br.com.fiap.code_rats.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity(name = "courses")
public class Course {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double rating;
    private int durationInMinutes;
    private int durationInHours;

    public void updateData(Course data){
        if (data.durationInHours != 0) this.durationInHours = data.durationInHours;
        if (data.durationInMinutes != 0) this.durationInMinutes = data.durationInMinutes;
        if (data.rating != 0) this.rating = data.getRating();
        if (data.name != null) this.name = data.name;
    }
}
