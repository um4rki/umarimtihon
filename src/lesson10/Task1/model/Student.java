package lesson10.Task1.model;

import java.util.List;
import java.util.Objects;

/**
 * Created by: Umar
 * DateTime: 8/24/2024 4:58 PM
 */
public class Student {
    private Integer id;
    private String lastName;
    private String firstName;

    private Address address;

    private List<Course> students;


    public Student(Integer id, String lastName, String firstName, Address address, List<Course> students) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Course> getStudents() {
        return students;
    }

    public void setStudents(List<Course> students) {
        this.students = students;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(lastName, student.lastName) && Objects.equals(firstName, student.firstName) && Objects.equals(address, student.address) && Objects.equals(students, student.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, address, students);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", address=" + address +
                ", students=" + students +
                '}';
    }
}
