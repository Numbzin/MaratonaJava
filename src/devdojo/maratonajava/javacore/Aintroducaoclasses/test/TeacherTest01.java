package devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Nami";
        teacher.age = 22;
        teacher.gender = 'F';
        System.out.println("Name: " + teacher.name);
        System.out.println("Age: " + teacher.age);
        System.out.println("Gender: " + teacher.gender);
    }
}
