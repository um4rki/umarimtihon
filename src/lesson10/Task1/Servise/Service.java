package lesson10.Task1.Servise;

import lesson10.Task1.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by: Umar
 * DateTime: 8/24/2024 5:15 PM
 */
public class Service implements StudentService {

    private final List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    @Override
    public boolean addStudent(Student student) {
        if(!students.contains(student)) {
            students.add(student);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteStudent(Integer id) {
        return students.removeIf(student -> student.getId().equals(id));
    }

    @Override
    public boolean updateStudent(Integer id, Student student) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId().equals(id)) {
                students.set(i, student);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Student> getStudentsByName(List<String> courseNames) {
        List<Student> child = new ArrayList<>();
        for (Student student : students) {

        }
        return List.of();
    }

    public static void main(String[] args) {
        Regionn qashqadaryo = new Regionn("Qashqadaryo");
        District mirishkor = new District("Mirishkor", qashqadaryo);
        Course java = new Course("Java");
        Address nurafshon = new Address("Nurafshon", 88, mirishkor);
        Service service = new Service();
//        new Student(1 , "Umar", "Qarshiyev" , nurafshon , );
    }
}
