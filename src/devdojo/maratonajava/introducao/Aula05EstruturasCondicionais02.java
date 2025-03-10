package devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade > 18 categoria adulto
        int age = 17;
        String category;
        if (age < 15) {
            category = "Categoria infantil";
        } else if (age >= 15 && age < 18) {
            category = "Categoria juvenil";
        } else {
            category = "Categoria adulto";
        }
        System.out.println(category);
    }
}
