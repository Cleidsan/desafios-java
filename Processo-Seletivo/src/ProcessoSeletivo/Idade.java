package ProcessoSeletivo;
import java.util.concurrent.ThreadLocalRandom;

public class Idade {
    public static void main(String[] args) {
        ultimaDoDia();
    }
    static void ultimaDoDia() {
        String[] pessoas = {"Loocky","iLector","AtiradorX","ZeDaMira","PapaCapim","JucaSniper","ZeDoAmedoim","MatadorXnice","Ghost007","FulanoDeTal"};
        int pessoaTestAtual = 0;
        int idade = 18;

        while (pessoaTestAtual < pessoas.length) {
            String cidadao = pessoas[pessoaTestAtual];
            int idadePessoas = idadeGeradaPessoas();
         
            if (idadePessoas < idade) {
                System.out.println("Voce é menor de idade! "+ cidadao +" "+ idadePessoas );
        
            } else {
                System.out.println("voce é maior de idade! " + cidadao +" "+ idadePessoas );
            }

        pessoaTestAtual++;
        }
    }
    static int idadeGeradaPessoas() {
        return ThreadLocalRandom.current().nextInt(16, 25);
    }
}