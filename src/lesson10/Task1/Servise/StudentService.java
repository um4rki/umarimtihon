package lesson10.Task1.Servise;

import lesson10.Task1.model.Student;

import java.util.List;

/**
 * Created by: Umar
 * DateTime: 8/24/2024 5:01 PM
 */
public interface StudentService {

    List<Student> getStudents();

    boolean addStudent(Student student);

    boolean deleteStudent(Integer id);

    boolean updateStudent(Integer id, Student student);

    List<Student> getStudentsByName(List<String> courseNames);
}
