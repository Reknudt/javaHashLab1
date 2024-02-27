package lab4.l1arpoi13;

import java.util.HashSet;
import java.util.LinkedList;

public class StudentIntersection {
    public static void intersect(LinkedList<Student> set1, LinkedList<Student> set2) {
        HashSet<Student> intersectSet = new HashSet<>(set1);
        HashSet<Student> intersectSet2 = new HashSet<>(set2);
        intersectSet.retainAll(intersectSet2);

        for (Student student : intersectSet) {
            System.out.println(student.getName());
        }
    }
}
