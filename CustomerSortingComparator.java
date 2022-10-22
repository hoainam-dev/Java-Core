package SortByComparator;

import java.util.Comparator;

public class CustomerSortingComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int NameCompare = o1.getName().compareTo(o2.getName());
        int IdCompare = o1.getId().compareTo(o2.getId());

        return (NameCompare == 0)?IdCompare:NameCompare;
    }
}
