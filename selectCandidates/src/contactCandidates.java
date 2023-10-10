package selectCandidates.src;
import java.util.concurrent.ThreadLocalRandom;

public class contactCandidates {
    public static void main (String[] args){
        System.out.println("Processo seletivo");
        double salarioBase = 2000;
        // String contatar = analiseCandidate(1900);
        //System.out.println(contatar);

        selectCandidates(2000);
    }
    
    public static String analiseCandidate (double salarioPretendido, double salarioBase) {
        String naFaixa = "Temos uma vaga para você!";
        String foraFaixa = "Você aceitaria 2.000?";

        String contatarCandidato = salarioBase >= salarioPretendido ? naFaixa : foraFaixa;
        return contatarCandidato;

    }

    /**
     * @param salarioBase
     */
    static void selectCandidates(double salarioBase){
        String [] candidatos = {"Felipe", "Márcia", "Júlia", "Paulo", "Monica", "Fabrício", "Mirela", "Daniela", "José", "Mauro"};
        int candidatosSelec = 0;
        
        int candidatoAtual = 0;
        
        while (candidatosSelec < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = randomNum();
            System.out.println("O candidato " + candidato + "solicitou o valor de salário " + salarioPretendido);
            
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatoAtual ++;
            }
        candidatoAtual ++;
        }
    }

    static double randomNum (){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }
}
