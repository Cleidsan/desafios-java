package ProcessoSeletivo;
import java.util.concurrent.ThreadLocalRandom;

public class Age2 {
    public static void main(String[] args) {
        age2();
    }

    static void age2() {
        String[] peoples = { "Alfarr", "Helewidis", "Yngvarr", "Hloddoviko", "Mackeswell", "Karl", "Absalom", "Liam",
                "Héktor", "Friedrich", "Atlas", "Herácles", "Ícarus" };

        int peopleCurrent = 0;
        int contYoungCurrent = 0;
        while (peopleCurrent < peoples.length) {
            String people = peoples[peopleCurrent];
            int age = ageSelected();

            if (age == 1) {
                System.out.println("O " + people + " Tem: " + age + " ano. <<<<<<<<<<");
            } else {
                System.out.println("O " + people + " Tem: " + age + " anos.");
            }

            if (age >= 18 && age <= 25) {
                System.out.println("Selecionado: " + people + " Tem " + age + " anos. <<<<<<<<<<<<<<<");
                contYoungCurrent++;
            }
            peopleCurrent++;
        }
        System.out.println("\nUm Total de " + contYoungCurrent +" Jovens.");

    }

    static int ageSelected() {
        return ThreadLocalRandom.current().nextInt(15, 60);
    }
}