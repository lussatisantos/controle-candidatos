package candidatura;

public class ProcessoSelectivo {
    public static void main(String[] args) {
        System.out.println("Processo selectivo");
        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2100.0);
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
