package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10, 20);
        calculadora.divideDoisNumeros(20, 2);
        System.out.println("Finalizando CalculadoraTest02");
    }
}
