/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopwhile;

/**
 *
 * @author Code36u4r60
 */
public class LoopWhile {

    public static void main(String[] args) {
      int i = 1;
      int max= 10;
        System.out.println("Contando até " + max);
        
        while( i <= max){
            System.out.println("O valor de i: " + i);
            i++;
        }
        System.out.println(i); //valor 11
        
        do{
            i++;
            System.out.println("Valor de i: " + i);
        }while(i < 13);
    
        System.out.println(i);
    }
    
}
