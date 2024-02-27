package lab4.l1arpoi13;

import java.util.LinkedList;

public class StudentListCompare {
    public static void courseListCompare(LinkedList<Student> students, int course) {
        System.out.println("Студенты " + course + "-го курса:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
