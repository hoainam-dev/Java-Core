package SortByComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Nam", 222);
        Student s2 = new Student("Loc", 124);
        Student s3 = new Student("Nhan", 120);
        Student s4 = new Student("Nam", 111);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println("Before sort: ");
        for (Student s : students){
            System.out.println(s);
        }

        Collections.sort(students, new CustomerSortingComparator());

        System.out.println("After sort: ");
        for (Student s: students){
            System.out.println(s);
        }
    }
}
