import Personagem.Personagem;
import Personagem.Barbaro;
public class Main {
    public static void main(String[] args) {



         Personagem personagem = new Personagem();

         Barbaro barbaro = new Barbaro(personagem.getNome(), personagem.getIdade());

    barbaro.exibir();



        }
    }
