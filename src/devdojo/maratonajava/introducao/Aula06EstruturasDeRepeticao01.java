package devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // Definição de um limite para facilitar futuras alterações
        final int LIMITE = 10;

        // Exemplo de loop WHILE
        int count = 1; // Começa em 1 para evitar a necessidade de ++count dentro do print
        while (count <= LIMITE) { // Enquanto count for menor ou igual a 10
            System.out.println("While: " + count);
            count++; // Incrementa o contador
        }

        // Exemplo de loop DO-WHILE
        count = 1; // Reiniciando count
        do {
            System.out.println("Do-While: " + count);
            count++; // Incrementa o contador
        } while (count <= LIMITE); // Garante a execução pelo menos uma vez

        // Exemplo de loop FOR
        for (int i = 0; i < LIMITE; i++) {
            System.out.println("For: " + (i + 1)); // Ajustando para iniciar em 1
        }
    }
}
