package devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Exercício: Dado o valor de um carro, descubra em quantas vezes ele pode ser
        // parcelado
        // Condição: valorParcela >= 1000

        int carValue = 15_212;
        int minParcelValue = 1_000;

        // Começamos pelo maior número de parcelas possíveis (valor total do carro)
        for (int parcelas = carValue; parcelas >= 1; parcelas--) {
            int valorParcela = carValue / parcelas; // Calcula o valor da parcela

            // Se o valor da parcela for menor que 1000, pula para a próxima iteração
            if (valorParcela < minParcelValue) {
                continue;
            }

            System.out.println(parcelas + "x de R$ " + valorParcela);
        }
    }
}
