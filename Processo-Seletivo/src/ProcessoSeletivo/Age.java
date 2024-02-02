package ProcessoSeletivo;
import java.util.concurrent.ThreadLocalRandom;

public class Age {
    public static void main(String[] args) {
        youngSelected();
    }
    static void youngSelected() {
        String[] peoples = {"Alfarr","Helewidis","Yngvarr","Hloddoviko","Mackeswell","Karl","Absalom","Liam","Héktor","Friedrich","Atlas","Herácles","Ícarus"};

        int peoplesCurrent = 0;
        int contYoung = 0;
        while (peoplesCurrent < peoples.length) {
            String young = peoples[peoplesCurrent];
            int age = agePeoples();
            if (age == 1) {
                System.out.println(young + " Tem " + age+" ano. >>>>>>>>>><<<<<<<<<<");
            }else {
                System.out.println(young + " Tem " + age+" anos.");
            }
            
            if (age >= 18 && age <= 25) {
                System.out.println("Selecionado: "+young + " Tem " + age+" anos. <<<<<<<<<<<<<<<");
                contYoung++;
            }
            peoplesCurrent++;
        }
        System.out.println("\nUm Total de " + contYoung +" Jovens.");
    }
    static int agePeoples() {
        return ThreadLocalRandom.current().nextInt(1, 60);
    }
}
