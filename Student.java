import java.util.*;

class Student {
    private final String name; 
    private int rollNumber;
    private int age;

    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + ", age=" + age + "}";
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(); 

        students.add(new Student("abc", 12, 19));
        students.add(new Student("def", 21, 21));

        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
