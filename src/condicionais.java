package src;
public class condicionais {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;
        float nota = 6;

        if (valorSolicitado<saldo)
        saldo = saldo - valorSolicitado;

        System.out.println("o seu saldo é " + saldo);

        if (valorSolicitado<saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("o seu saldo é " + saldo);
        }
        else {System.out.println("fundos insuficientes");
        }

        if (nota>=7){
            System.out.println("Aprovado, nota " + nota);
        }

        else if (nota>= 5 && nota < 7){
            System.out.println("Em recuperação, nota " + nota);
        }

        else{
            System.out.println("Reprovado, nota " + nota);
        }

    


        
    
    }

}