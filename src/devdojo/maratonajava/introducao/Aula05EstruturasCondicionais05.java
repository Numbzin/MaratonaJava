package devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        byte day = 1;

        // char, int, byte, short, enum, String
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

        String sex = "M";
        switch (sex) {
            case "M":
                System.out.println("Men");
                break;
            case "F":
                System.out.println("Female");
                break;

            default:
                System.out.println("Invalide");
                break;
        }

    }

}
