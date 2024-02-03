package net.management.studentmanagementsystem.services.Implementation;

import net.management.studentmanagementsystem.entity.Student;
import net.management.studentmanagementsystem.repo.StudentRepo;
import net.management.studentmanagementsystem.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    private StudentRepo studentRepo;

    public StudentServiceImplementation(StudentRepo studentRepo) {
        super();
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents(){

        return studentRepo.findAll();
    }
}
