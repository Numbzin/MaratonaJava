package devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos: usados para realizar cálculos matemáticos básicos (+,
        // -, *, /)
        int numberOne = 1000;
        int numberTwo = 200;
        int sumResult = numberOne + numberTwo; // Soma de 1000 + 200
        System.out.println("Resultado da soma: " + sumResult);

        // Operador de módulo (%): retorna o resto da divisão
        int remainder = 21 % 7; // 21 dividido por 7 tem resto 0
        System.out.println("Resto da divisão de 21 por 7: " + remainder);

        // Operadores relacionais: usados para comparar valores e retornam um booleano
        // (true ou false)
        boolean isGreater = 10 > 20; // 10 é maior que 20? (false)
        boolean isSmaller = 10 < 20; // 10 é menor que 20? (true)
        boolean isEqual = 10 == 20; // 10 é igual a 20? (false)
        boolean isEqualTen = 10 == 10; // 10 é igual a 10? (true)
        boolean isDifferent = 10 != 10; // 10 é diferente de 10? (false)

        System.out.println("10 é maior que 20? " + isGreater);
        System.out.println("10 é menor que 20? " + isSmaller);
        System.out.println("10 é igual a 20? " + isEqual);
        System.out.println("10 é igual a 10? " + isEqualTen);
        System.out.println("10 é diferente de 10? " + isDifferent);

        // Operadores lógicos: usados para combinar expressões booleanas
        boolean conditionOne = true;
        boolean conditionTwo = false;

        System.out.println("&& (E lógico): Ambas as condições precisam ser verdadeiras.");
        System.out.println("true && false: " + (conditionOne && conditionTwo)); // false

        System.out.println("|| (OU lógico): Apenas uma condição precisa ser verdadeira.");
        System.out.println("true || false: " + (conditionOne || conditionTwo)); // true

        System.out.println("! (NÃO lógico): Inverte o valor booleano.");
        System.out.println("!true: " + (!conditionOne)); // false

        // Exemplo: Verificando se a pessoa atende aos requisitos legais de idade e
        // salário
        int age = 22;
        float salary = 3500F;
        boolean isWithinLaw = age >= 30 && salary >= 4612; // Deve ter 30+ anos E salário de pelo menos 4612
        boolean isWithinLawUnderThirty = age < 30 && salary >= 3381; // Deve ter menos de 30 anos E salário de pelo
                                                                     // menos 3381
        System.out.println("Dentro da lei " + isWithinLaw);
        System.out.println("Dentro da lei menor que trinta " + isWithinLawUnderThirty);

        // Exemplo: Verificando se há dinheiro suficiente para comprar um PS5
        double checkingAccountBalance = 200;
        double savingsAccountBalance = 10000;
        float ps5Price = 5000F;

        boolean canBuyPs5 = checkingAccountBalance > ps5Price || savingsAccountBalance > ps5Price;
        // O PS5 pode ser comprado se a conta corrente OU a conta poupança tiver
        // dinheiro suficiente
        System.out.println("PS5 é comprável " + canBuyPs5);

        // Operadores de atribuição: usados para modificar o valor de uma variável (=,
        // +=, -=, *=, /=, %=)
        double bonus = 2500;
        bonus += 1000; // Equivalente a bonus = bonus + 1000;
        bonus -= 1000; // Equivalente a bonus = bonus - 1000;
        bonus *= 2; // Equivalente a bonus = bonus * 2;
        bonus /= 2; // Equivalente a bonus = bonus / 2;
        bonus %= 2; // Equivalente a bonus = bonus % 2;
        System.out.println(bonus);

        // Operadores de incremento e decremento (++ e --)
        int counter = 0;
        counter += 1; // Incrementa em 1
        counter++; // Pós-incremento (incrementa DEPOIS da execução)
        counter--; // Pós-decremento (decrementa DEPOIS da execução)
        ++counter; // Pré-incremento (incrementa ANTES da execução)
        --counter; // Pré-decremento (decrementa ANTES da execução)

        int counterTwo = 0;
        System.out.println(counter++); // Imprime counter, depois incrementa
        System.out.println(counterTwo--); // Imprime counterTwo, depois decrementa
    }
}
