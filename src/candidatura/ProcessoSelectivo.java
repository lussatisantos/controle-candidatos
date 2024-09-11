package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSelectivo {
    public static void main(String[] args) {
        /* System.out.println("Processo selectivo");
        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2100.0); */

        String [] candidatos = {"TIAGO", "PAULO", "LUSSATI", "SANTOS", "ADELINO"};

        for(String candidato: candidatos){
            entrandoEmContacto(candidato);
        }
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"TIAGO", "PAULO", "LUSSATI", "SANTOS", "ADELINO"};

        for(String candidato: candidatos){
            System.out.println("O candidato " + candidato + "foi selecionado");
        }
    }

    static void entrandoEmContacto(String candidato){
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativaRealizadas++;
            }else {
                System.out.println("CONTACTO REALIZADO COM SUCESSO");
            }

        }while(continuarTentando && tentativaRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS FAZER CONTACTO COM " + candidato + " NA " + tentativaRealizadas + " TENTITVA REALIZADA");
        } else {
            System.out.println("NÃO FOI POSSÍVEL FAZER CONTACTO COM " + candidato + " NA " + tentativaRealizadas + " TENTATIVA REALIZADA");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidato(){

        String [] candidatos = {"TIAGO", "PAULO", "LUSSATI", "SANTOS", "ADELINO", "FIRMINO", "CHIMBANDA", "ESPERANCA", "ERMELINDA", "ALBERTINA"};
        
        int candidatosSelecionados = 0;
        int candidatoActual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoActual < candidatos.length){
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
