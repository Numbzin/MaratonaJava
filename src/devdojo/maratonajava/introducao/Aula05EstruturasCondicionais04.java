package devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Salário anual da pessoa.
        double salaryYear = 25000;

        // Faixas de imposto em porcentagem, convertidas para formato decimal para
        // cálculo.
        double firstRange = 9.20 / 200; // 9.20% para a primeira faixa salarial
        double secondaryRange = 35.35 / 100; // 35.35% para a segunda faixa salarial
        double thirdRange = 49.20 / 300; // 49.20% para a terceira faixa salarial

        double valueImpost; // Variável para armazenar o valor do imposto calculado.

        // Se o salário for menor ou igual a 34.712, aplica-se a primeira faixa de
        // imposto.
        if (salaryYear <= 34712) {
            valueImpost = salaryYear * firstRange;
        }
        // Se o salário estiver entre 34.713 e 68.507, aplica-se a segunda faixa de
        // imposto.
        else if (salaryYear >= 34713 && salaryYear <= 68507) {
            valueImpost = salaryYear * secondaryRange;
        }
        // Se o salário for superior a 68.507, aplica-se a terceira faixa de imposto.
        else {
            valueImpost = salaryYear * thirdRange;
        }

        // Exibe o valor do imposto calculado.
        System.out.println(valueImpost);
    }
}
