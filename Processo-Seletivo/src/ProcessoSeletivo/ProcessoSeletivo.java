package ProcessoSeletivo;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
        imprimirCandidatos();
    }

    static void imprimirCandidatos() {
        String[] candidatosImp = { "Jó", "Fé", "Nan", "Goku", "Gohan" };

        for (int i = 0; i < candidatosImp.length; i++) {
            System.out.println("O Candidato de indice n° " + (i + 1) + " e o " + candidatosImp[i]);
        }

        for (String candidato : candidatosImp) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {

        int tentativasRealizadas = 1;

        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato REALIZADO com SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " +
                    tentativasRealizadas + " tentativa.");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", Numero Maximo de Tentativas "
                    + tentativasRealizadas + ".");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Jó", "Fé", "Nan", "Goku", "Gohan", "Naru", "Chichi", "Hena", "Bulma", "Vegeta", "Nami",
                "Kuririn" };

        int CandidatoSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (CandidatoSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + ", Solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                CandidatoSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}