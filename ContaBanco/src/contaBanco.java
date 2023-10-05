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


        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        
            // Define an SQL INSERT statement
            String insertSQL = "INSERT INTO your_table_name (numeroBanco, saldo, agencia, nomeCliente) VALUES " +
                               "(" + numeroBanco + ", " + saldo + ", '" + agencia + "', '" + nomeCliente + "')";
        
            // Execute the SQL INSERT statement
            int rowsAffected = stmt.executeUpdate(insertSQL);
        
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data.");
            }
        
            conn.close(); // Close the connection when done
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }   
}