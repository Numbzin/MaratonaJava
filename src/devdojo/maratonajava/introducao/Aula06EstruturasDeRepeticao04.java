package devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Exercicio
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000

        int carValue = 15_212;
        int minParcelValue = 1_000;

        // Loop para descobrir as parcelas possíveis
        for (int parcelas = 1; parcelas <= carValue; parcelas++) {
            int valorParcela = carValue / parcelas; // Calcula o valor da parcela

            // Se o valor da parcela for menor que 1000, interrompe o loop
            if (valorParcela < minParcelValue) {
                break;
            }

            System.out.println(parcelas + "x de R$ " + valorParcela);
        }
    }
}
