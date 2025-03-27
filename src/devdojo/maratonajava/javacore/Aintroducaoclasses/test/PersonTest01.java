package devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Sanji";
        person.age = 21;
        person.gender = 'M';
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.gender);
    }
}
