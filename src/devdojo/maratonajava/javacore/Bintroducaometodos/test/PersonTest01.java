package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.domain.ImpressaoPerson;
import devdojo.maratonajava.javacore.Bintroducaometodos.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person01 = new Person();
        Person person02 = new Person();
        ImpressaoPerson impressaoPerson = new ImpressaoPerson();

        person01.name = "Sung Jin-Woo";
        person01.age = 25;
        person01.gender = 'M';

        person02.name = "Sakura";
        person02.age = 16;
        person02.gender = 'F';

        impressaoPerson.imprime(person01);
        impressaoPerson.imprime(person02);

    }

}
