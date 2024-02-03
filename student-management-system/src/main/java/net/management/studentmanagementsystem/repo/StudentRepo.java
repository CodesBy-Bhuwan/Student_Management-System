package net.management.studentmanagementsystem.repo;

import net.management.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


//JPA Entity has two parameters=TypeOfEntity and TypeOfPrimary key
//so we have Student as entity and Id as primary key where long is datatype of id
//Also we can use as usual technique using @Repository annotation
public interface StudentRepo extends JpaRepository<Student, Long> {
//    Also JPaRepo provides auto Transitional to all method.


}
