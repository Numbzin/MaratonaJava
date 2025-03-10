package devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "NMB";
        String address = "Eles estão de olho em nós da silva, 33";
        double salary = 2500.20;
        String date = "21/07/2025";

        // Usando String.format para formatação mais limpa
        System.out.println(String.format("Eu %s", name));
        System.out.println(String.format("Morando no endereço %s", address));
        System.out.println(String.format("Confirmo que recebi o salário de %.2f", salary));
        System.out.println(String.format("Na data %s", date));
    }
}
