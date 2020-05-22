package example;

class Person{
    String name;
    String id;
    Person(String name){
        this.name=name;
    }
}
class Student extends Person{
    String grade;
    String department;
    Student(String name){
        super(name);
    }
}
public class DowncastingEx {
    public static void main(String[] args){
        Person p = new Person("최승서");
        Student s;

        s = (Student)p;

        System.out.println((s.name));
         s.grade = "A";
        System.out.println((s.grade));
    }
}
