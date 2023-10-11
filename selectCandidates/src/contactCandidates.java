package selectCandidates.src;
import java.util.concurrent.ThreadLocalRandom;

public class contactCandidates {
    public static void main (String[] args){
        System.out.println("Processo seletivo");
        // String contatar = analiseCandidate(1900);
        //System.out.println(contatar);

        selectCandidates(2000);
    }
    

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
