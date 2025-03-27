package devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Person;

public class PersonTest02 {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();

        person.name = "Sanji";
        person.age = 21;

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.gender);
        System.out.println("----------------");
        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
        System.out.println("Gender: " + person2.gender);
    }
}
