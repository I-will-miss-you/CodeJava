/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

import java.util.Scanner;

/**
 *
 * @author fonse
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*
        System.out.print("Informe a sua idade:");
        int idade = scan.nextInt();
        
        if(idade >= 18){
            System.out.println("É maior de idade.");
        }else{
            System.out.println("Não é maior de idade.");
        }
        */
        
        //barato <= 10
        // 10 < valor < 15 - pedir desconto
        // 15 <= valor < 17 - pesquisar mais
        // >= 17 - muito caro
        
        System.out.println("Informe o preço: ");
        double valor = scan.nextDouble();
        
        if(valor <= 10){
            System.out.println("Está barato, pode comprar.");
        }else if( valor > 10 && valor < 15){
            System.out.println("Pedir desconto.");
        }else if(valor <= 15 && valor < 17){
            System.out.println("Pesquisar em outra loja.");
        }else{// valor >= 17
            System.out.println("Esquece, é muito caro.");
        }
        
        
    }
    
}
