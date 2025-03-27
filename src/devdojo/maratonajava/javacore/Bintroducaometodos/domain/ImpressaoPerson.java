package devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class ImpressaoPerson {
    public void imprime(Person person) {
        System.out.println("---------------");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.gender);
    }
}
