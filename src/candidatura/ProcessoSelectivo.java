package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSelectivo {
    public static void main(String[] args) {
        /* System.out.println("Processo selectivo");
        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2100.0); */
    }

    static void selecaoCandidato(){

        String [] candidatos = {"TIAGO", "PAULO", "LUSSATI", "SANTOS", "ADELINO", "FIRMINO", "CHIMBANDA", "ESPERANCA", "ERMELINDA", "ALBERTINA"};
        
        int candidatosSelecionados = 0;
        int candidatoActual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatoActual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.print("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoActual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else{
            System.out.println("AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
