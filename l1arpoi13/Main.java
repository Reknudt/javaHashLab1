//Напишите класс Student, предоставляющий информацию об имени студента
//методом getName() и о его курсе методом getCourse(). Напишите метод
//printStudents(LinkedList students, int course), который получает список
//студентов и номер курса и печатает имена тех студентов из списка, которые
//обучаются на данном курсе. Протестируйте метод (для этого предварительно
//придется создать десяток объектов класса Student и поместить их в список).
//Напишите методы union(LinkedList set1, LinkedList set2) и intersect(LinkedList
//set1, LinkedList set2), реализующие операции объединения и пересечения двух
//множеств. Протестируйте работу этих методов на двух предварительно
//заполненных множествах (понадобится написать вспомогательный метод,
//выводящий все элементы множества на консоль.) Реализуйте интерфейс
//Comparable так, чтобы студенты сортировались по номеру курса. Проверьте
//работу, используя класс TreeSet.

package lab4.l1arpoi13;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]) {
        LinkedList<Student> students1 = new LinkedList<>();
        students1.add(new Student("Маша", 1));
        students1.add(new Student("Даша", 3));
        students1.add(new Student("Паша", 2));
        students1.add(new Student("Саша", 4));

        LinkedList<Student> students2 = new LinkedList<>();

        students2.add(new Student("Маша", 1));
        students2.add(new Student("Коля", 2));
        students2.add(new Student("Зоя", 3));

        StudentListCompare.courseListCompare(students2, 2);

        unionCall(students1, students2);
        intersectionCall(students1, students2);

        treeCall(students1, students2);

    }
    public static void treeCall(LinkedList<Student> set1, LinkedList<Student> set2){
        TreeSet<Student> treeSet = new TreeSet<>(set1);
        treeSet.addAll(set2);

        for (Student student : treeSet) {
            System.out.println(student.getName() + ": курс " + student.getCourse());
        }
    }
    public static void intersectionCall(LinkedList<Student> set1, LinkedList<Student> set2) {
        System.out.println("Пересечение множеств:");
        StudentIntersection.intersect(set1, set2);
    }

    public static void unionCall(LinkedList<Student> set1, LinkedList<Student> set2) {
        System.out.println("Объединение множеств:");
        StudentUnion.union(set1, set2);
    }
}
