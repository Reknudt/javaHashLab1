package lab4.l1arpoi13;

import java.util.HashSet;
import java.util.LinkedList;

public class StudentUnion {
    public static void union(LinkedList<Student> set1, LinkedList<Student> set2) {
        HashSet<Student> unionSet = new HashSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        for (Student student : unionSet) {
            System.out.println(student.getName());
        }
    }
}
