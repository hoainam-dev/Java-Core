package SortByComparator;

public class Student {
    String name;
    int id;

    public Student(){};

    public Student(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public Integer getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
