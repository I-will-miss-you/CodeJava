package exercicios;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
        printContador();

        Contador contador = new Contador();
        printContador();
        
        Contador contador2 = new Contador();
        printContador();
        
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        printContador();
       
        Contador.zerar();
        printContador();
        
    }
    
    static void printContador(){
       System.out.println(Contador.getContador()); 
    }

}
