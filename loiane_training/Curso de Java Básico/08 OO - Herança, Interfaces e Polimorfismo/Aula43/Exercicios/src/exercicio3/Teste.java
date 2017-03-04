
package exercicio3;

/**
 *
 * @author code36u4r60
 */
public class Teste {

    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", 150,"Amarelo", "Terra", 2);
        
        Peixe tubarao = new Peixe( "Tubarão", 300, 1.5);
        
        Mamifero urso = new Mamifero("Urso-do-canadá", 180, 0.5);
        urso.setCor("Vermelho");
        
        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;
        
        for (Animal animal : animais){
            System.out.println(animal);
            System.out.println("");
        }
    }

}
