package com.reps.dms.data;

import com.reps.dms.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByStudentIdNumber (String id);
    //Select everything from students where last name is equal to our first argument
    @Query(value = "SELECT * FROM student_list WHERE last_name = ?1", nativeQuery = true)
    List<Student> findByLastName(String lastName);
    Student findByStudentEmail(String email);
}