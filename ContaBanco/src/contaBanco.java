package ContaBanco.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class contaBanco {
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "guest";
    static final String PASS = "guest123";
    public static void main (String [] args) {
        int numeroBanco;
        String agencia, nomeCliente;
        float saldo;

        Scanner sc1 = new Scanner(System.in); 

        System.out.println("Qual é seu nome?");
        nomeCliente = sc1.nextLine();

        System.out.println("Qual é o número do seu banco?");
        numeroBanco = sc1.nextInt();

        System.out.println("E a sua agência?");
        agencia = sc1.nextLine();

        System.out.println("Qual é seu saldo atual?");
        saldo = sc1.nextFloat();

    }   
}