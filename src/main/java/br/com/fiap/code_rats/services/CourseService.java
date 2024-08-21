package br.com.fiap.code_rats.services;

import br.com.fiap.code_rats.models.Course;
import br.com.fiap.code_rats.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository repository;

    public List<Course> getAllCourses() {
        return repository.findAll();
    }
    public void createCourse(Course course) {
        repository.save(course);
    }
    public Course getCourseById(Long id) {
        return repository.getReferenceById(id);
    }
    public void updateCourse(Course data) {
        Course entityToBeUpdated = repository.getReferenceById(data.getId());
        entityToBeUpdated.updateData(data);
    }
    public void deleteCourse(Long id) {
        repository.deleteById(id);
    }
}
