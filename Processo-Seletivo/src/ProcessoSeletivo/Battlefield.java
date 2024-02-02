package ProcessoSeletivo;
import java.util.concurrent.ThreadLocalRandom;

public class Battlefield {
    public static void main(String[] args) {
        battlefield();
    }
    static void battlefield() {
        String[] warriors = {"Alfarr","Helewidis","Yngvarr","Hloddoviko","Mackeswell","Karl","Absalom","Liam","Héktor","Friedrich","Atlas","Herácles","Ícarus","Maximilian","Adônis","Aurora","Natalis","Saori","Lot-regne","Héloïse","Dandara","Philoméne","Jacinta","Athena","Ártemis","Pan","Barbar","Alaska","Têmis","Íres","Esperanza","Afrodite"};

        int warriorsSelected = 0;
        int warriorCurrent = 0;
        double warriorStrength = 8000.0;


        while (warriorsSelected < 10 && warriorCurrent < warriors.length) {
            String warrior = warriors[warriorCurrent];
            double warriorPower = warriorPowerBased();

            if (warriorPower >= warriorStrength) {
                System.out.println("\nGuerreiro: "+ warrior + " Selecionado. Poder de: "+ warriorPower);
                warriorsSelected++;

            }

        warriorCurrent++;
        }
        System.out.println("\nSelected Warriors: " + warriorsSelected);
    }
    
    static double warriorPowerBased() {
        return ThreadLocalRandom.current().nextDouble(1000,10000);
    }
}
