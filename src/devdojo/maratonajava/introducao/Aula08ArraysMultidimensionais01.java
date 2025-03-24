package devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // Criando um array bidimensional (matriz) chamado "dias"
        // O primeiro colchete [3] representa o número de linhas (conjuntos de dados)
        // O segundo colchete [3] representa o número de colunas (valores em cada
        // conjunto)
        int[][] dias = new int[3][3];

        // Preenchendo a matriz manualmente com valores inteiros
        // Cada número representa a quantidade de dias em um determinado mês (exemplo
        // hipotético)

        // Primeira linha (índice 0) do array
        dias[0][0] = 31; // Janeiro (exemplo)
        dias[0][1] = 28; // Fevereiro (exemplo)
        dias[0][2] = 31; // Março (exemplo)

        // Segunda linha (índice 1) do array
        dias[1][0] = 31; // Janeiro de novo (só para manter o exemplo)
        dias[1][1] = 28; // Fevereiro de novo
        dias[1][2] = 31; // Março de novo

        // Loop tradicional para percorrer a matriz e exibir os valores
        // Primeiro percorremos as linhas do array (índice i)
        for (int i = 0; i < dias.length; i++) {
            // Para cada linha, percorremos as colunas (índice j)
            for (int j = 0; j < dias[i].length; j++) {
                // Exibe cada valor armazenado na matriz
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("---------------"); // Separação visual no console

        // Agora usamos um loop "for-each" para percorrer a matriz de forma mais simples
        // Aqui, "arrBase" representa cada linha do array (ou seja, um array
        // unidimensional)
        for (int[] arrBase : dias) {
            // Para cada linha (que é um array), percorremos os elementos individuais
            for (int num : arrBase) {
                // Exibe os valores armazenados na matriz
                System.out.println(num);
            }
        }
    }
}
