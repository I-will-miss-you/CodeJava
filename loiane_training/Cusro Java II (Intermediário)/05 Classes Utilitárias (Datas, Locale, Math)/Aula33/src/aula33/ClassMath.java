package aula33;

/**
 *
 * @author Code36u4r60
 */
public class ClassMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Calculo da potencia
        System.out.println(Math.pow(2, 3));

        //Arredondamento 'Normal'
        System.out.println(Math.round(4.7));
        System.out.println(Math.round(4.4));

        //Arredondamento para 'Cima'
        System.out.println(Math.ceil(4.7));
        System.out.println(Math.ceil(4.4));

        //Arredondamento para 'Baixo'
        System.out.println(Math.floor(4.7));
        System.out.println(Math.floor(4.4));

        //Numero aleatorio [0 - 100]
        System.out.println(Math.round(Math.random() * 100));

        //Calculo do Seno (sen(30)) 
        System.out.println(Math.sin(Math.toRadians(30)));

        //Calculo do Coseno (cos(30)) 
        System.out.println(Math.cos(Math.toRadians(1)));

        //Calculo do Tangente (tan(30)) 
        System.out.println(Math.tan(Math.toRadians(45)));
        
        
    }

}
