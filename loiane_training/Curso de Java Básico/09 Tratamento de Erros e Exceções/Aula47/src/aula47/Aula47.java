package aula47;

/**
 *
 * @author code36u4r60
 */
public class Aula47 {

    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];
            System.out.println("Antes da exception");
            vetor[4] = 1;
            System.out.println("Esse texto não será impresso");
        } /*catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exceção ao acessar um índice do vetor que não existe...");
        }*/catch(Exception e){
            System.out.println(e.getCause());
        }
        
        System.out.println("Esse texto sera impresso após a execption");

    }

}
