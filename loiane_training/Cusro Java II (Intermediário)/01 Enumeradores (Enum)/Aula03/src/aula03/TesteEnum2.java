
package aula03;

/**
 *
 * @author code36u4r60
 */
public class TesteEnum2 {


    public static void main(String[] args) {
        
        
        System.out.println(Enum.valueOf(DiaSemana2.class, "DOMINGO"));
        
        DiaSemana2 dia = Enum.valueOf(DiaSemana2.class, "DOMINGO");
        
        System.out.println(dia);
        
    }
    
}
