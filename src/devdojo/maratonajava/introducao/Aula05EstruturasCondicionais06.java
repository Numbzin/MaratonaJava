package devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Exercicio
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final
        // de semana, considerando 1 como domingo

        final byte day = 4;

        switch (day) {
            case 1, 7 -> System.out.println("Hoje é final de semana.");
            case 2, 3, 4, 5, 6 -> System.out.println("Hoje é um dia útil.");
            default -> System.out.println("Valor inválido.");
        }
    }
}
