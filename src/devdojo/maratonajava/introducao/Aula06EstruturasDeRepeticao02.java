package devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Exercicio
        // Imprima todos os números pares de 0 até 1.000.000

        int i = 1;

        // Se `i` for ímpar, ajusta para o próximo número par
        if (i % 2 != 0) {
            i++;
        }

        // garantindo apenas números pares
        for (; i <= 1_000_000; i += 2) {
            System.out.println("Número par: " + i);
        }
    }

}
