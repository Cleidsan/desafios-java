import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class JogoDoAdivinha {
    public static void main(String[] args) {
        gameStart();
    }
    static void gameStart() {

        int numChoice = numberChoice();

        Scanner tec = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escolha um numero.");

        int tentativasRealizadas = 0;
        int numerosTentativas = 3;

        for (int g=0; g < numerosTentativas; g++) {
            int number = tec.nextInt();
            tentativasRealizadas++;
            if (tentativasRealizadas > numerosTentativas) {
                System.out.println("Game Over");
            }else if (number > numChoice) {
                System.out.println("Escolha um numero menor.");
            }else if (number < numChoice) {
                System.out.println("Escolha um numero maior.");
            }else {
                System.out.println("Parabéns, você acertou em "+ tentativasRealizadas + " tentativas.");
                break;
            }
        }

        System.out.println("O numero era " + numChoice + ". Obrigado Por Jogar!");
    }

    static int numberChoice() {
        return ThreadLocalRandom.current().nextInt(0,10);
    }
}
