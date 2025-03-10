package devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 22;
        boolean isAutorized = age >= 18;
        if (isAutorized) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        if (!isAutorized) {
            System.out.println("Menor de idade");
        }

        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito.");
        }

        System.out.println("Fora do if");
    }
}
