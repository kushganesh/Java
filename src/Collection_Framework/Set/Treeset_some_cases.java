package Collection_Framework.Set;


import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_some_cases {
    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>();
        Student s1 = new Student("Ganesh", 12, "0191CS201064");
        Student s2 = new Student("Mohit", 22, "0191CS201065");
        Student s3 = new Student("Rohit", 32, "0191CS201066");
        Student s4 = new Student("Ajay ", 42, "0191CS201067");
        Student s5 = new Student("Ravin", 52, "0191CS201068");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        System.out.println(students);

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s.name + " " + s.rollNumber + " " + s.age);
        }

    }
}

class Student implements Comparable {
    String name;
    int age;
    String rollNumber;

    Student() {

    }

    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }


    public int compareTo(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.rollNumber.compareTo(s2.rollNumber) > 1) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
