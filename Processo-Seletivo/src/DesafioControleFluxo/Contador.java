package DesafioControleFluxo;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = parametroDois - parametroUm;
       
        if (parametroDois > parametroUm) {
            System.out.println("Resultado = " + contagem);
            for (int c = 0; c < contagem; c++) {
                System.out.println("Imprimindo o número " + (c+1));
            }
        } else {
            throw new ParametrosInvalidosException();
        }

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
