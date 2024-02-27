package lab4.l1arpoi13;
import java.util.HashSet;
import java.util.LinkedList;

public class Student implements Comparable<Student> {
    private String name;
    private int course;
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
    public String getName() { return name;}
    public int getCourse() { return course;}

    public int compareTo(Student obj) {
        return Integer.compare(this.course, obj.course);
    }
}
