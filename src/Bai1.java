import rikkei.academy.Student;

public class Bai1 {
    public static void main(String[] args) {
        Student s1 = new Student(111,"khánh");
        Student s2 = new Student(222,"khánh");
        Student s3 = new Student(222,"khánh");

        Student.change();
        s1.display();
        s2.display();
        s3.display();

    }
}