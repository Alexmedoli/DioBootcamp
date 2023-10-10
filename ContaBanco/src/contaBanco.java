package ContaBanco.src;
import java.util.Scanner;

public class contaBanco {
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "guest";
    static final String PASS = "guest123";
    public static void main (String [] args) {
        try (Scanner sc1 = new Scanner(System.in)) {
            System.out.println("Qual é seu nome?");
            sc1.nextLine();

            System.out.println("Qual é o número do seu banco?");
            sc1.nextInt();

            System.out.println("E a sua agência?");
            sc1.nextLine();

            System.out.println("Qual é seu saldo atual?");
            sc1.nextFloat();
        }

    }   
}