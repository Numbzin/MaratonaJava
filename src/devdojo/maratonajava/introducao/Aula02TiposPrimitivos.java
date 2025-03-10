package devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int age = (int) 10000000000L;
        long largeNumber = 100000;
        double salaryDouble = 2080.0D;
        float salaryFloat = 2500.0f;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean truee = true;
        boolean falsee = false;
        char character = '\u0041'; // A
        String name = "NMB";
        String name2 = "ai que num sei oq";

        System.out.println("A idade é " + age + " anos");
        System.out.println(falsee);
        System.out.println("char " + character);
        System.out.println(largeNumber);
        System.out.println("Oi, meu nome é " + name);
        System.out.println(name);
    }
}
