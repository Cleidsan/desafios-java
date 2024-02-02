package ProcessoSeletivo;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Campeonato {
    public static void main(String[] args) {
        ProcessoSeletivoPlayers();
        ligacao();

    }

    static void ligacao() {
        String[] players = { "Loocky", "iLector", "AtiradorX", "ZeDaMira", "PapaCapim" };

        for (String playLig : players) {
            entrarEmContatoPlayer(playLig);
        }
    }

    static void entrarEmContatoPlayer(String playLig) {
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
            System.out.println("Conseguimos contato com " + playLig + " na " + tentativasRealizadas + " tentativa.");
        } else {
            System.out.println("Não conseguimos contato com " + playLig + ", Numero Maximo de Tentativas "
                    + tentativasRealizadas + ".");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void ProcessoSeletivoPlayers() {
        // Possíveis participantes para seleção.
        String[] players = { "Loocky", "iLector", "AtiradorX", "ZeDaMira", "PapaCapim", "JucaSniper", "ZeDoAmedoim",
                "MatadorXnice", "Ghost007", "FulanoDeTal" };

        int playersSelecionados = 0;
        int playerAtual = 0;
        double pontosBase = 500.0;

        while (playersSelecionados < 5 && playerAtual < players.length) {
            String candidato = players[playerAtual];
            double pontosPorPlayers = pontosPlayers();

            System.out.println("O Jogador: " + candidato + " Possui " + pontosPorPlayers + ".");

            if (pontosPorPlayers >= pontosBase) {
                System.out.println("O Candidato: " + candidato + " Foi selecionado para o campeonato.\n");
                playersSelecionados++;

            }
            playerAtual++;

        }
        System.out.println("\nTotal de Participantes do campeonato: " + playersSelecionados);
    }

    static double pontosPlayers() {
        return ThreadLocalRandom.current().nextDouble(0, 1000);
    }
}
