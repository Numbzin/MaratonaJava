package devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 6000;
        String messageDonate = "500 conto pro c";
        String messageDontDonate = "Vai da n, to sem money";
        String result = salary >= 5000 ? messageDonate : messageDontDonate;

        System.out.println(result);
    }
}
