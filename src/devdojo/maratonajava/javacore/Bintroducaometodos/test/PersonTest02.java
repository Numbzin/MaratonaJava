package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.domain.Person;

public class PersonTest02 {
    public static void main(String[] args) {
        Person person01 = new Person();
        Person person02 = new Person();

        person01.name = "Sung Jin-Woo";
        person01.age = 25;
        person01.gender = 'M';

        person02.name = "Sakura";
        person02.age = 16;
        person02.gender = 'F';

        person01.imprime();
        person02.imprime();

    }

}
