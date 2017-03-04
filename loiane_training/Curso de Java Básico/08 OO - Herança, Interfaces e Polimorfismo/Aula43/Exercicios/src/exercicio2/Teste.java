
package exercicio2;

import java.util.Arrays;

/**
 *
 * @author code36u4r60
 */
public class Teste {
    public static void main(String[] args) {
        PessoaFisica p1 = new PessoaFisica("583.358.456-62", "Contribuinte 01", 10000);
        
        PessoaJuridica p2 = new PessoaJuridica("91.403.512/0001-54", "Contribuinte 02", 5000);
        
        PessoaFisica p3 = new PessoaFisica("828.277.078-70","Contribuinte 03",2000);
       
        PessoaJuridica p4 = new PessoaJuridica("35.434.693/0001-05","Contribuinte 04",3000);
        
        PessoaFisica p5 = new PessoaFisica("547.653.548-90","Contribuinte 05",3700);
        
        PessoaJuridica p6 = new PessoaJuridica("10.684.822/0001-92","Contribuinte 06",4000);
        
        Contribuinte[] contribuintes = new Contribuinte[6];
        Arrays.toString(contribuintes);
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;
        
        for (Contribuinte contribuinte : contribuintes) {
            System.out.println(contribuinte);
        }
    }
 
}
