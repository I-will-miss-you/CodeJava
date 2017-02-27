/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio2 {

    /*
     * Faça um programa que leia um nome de usuário e a sua senha e não
     * aceite a senha igual ao nome do usuário, mostrando uma mensagem
     * de erro e voltando a pedir as informações.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean erro = false;
        String username;
        String password;
        
        do {
            System.out.println("Username: ");
            username = scan.next();
            System.out.println("Password: ");
            password = scan.next();
            erro = username.equalsIgnoreCase(password);
        } while (erro);
        
        System.out.println("Dados inseridos: ");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
    
}
