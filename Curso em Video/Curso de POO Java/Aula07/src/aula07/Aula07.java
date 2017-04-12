/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.util.AbstractCollection;
import java.util.ArrayList;

/**
 *
 * @author Code36u4r60
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Lutador> lutadores = new ArrayList<>();
        uploadLutadores(lutadores);

        apresentar(lutadores, 0);

    }

    public static void uploadLutadores(AbstractCollection lutadores) {
        lutadores.add(new Lutador(
                "Pretty Boy",
                "França",
                31, 1.75f, 68.9f,
                11, 3, 1));

        lutadores.add(new Lutador(
                "Putscript",
                "Brasil",
                29, 1.68f, 57.8f,
                14, 2, 3));

        lutadores.add(new Lutador(
                "Snapshadow",
                "EUA",
                35, 1.65f, 80.9f,
                12, 2, 1));

        lutadores.add(new Lutador(
                "Dead Code",
                "Austrália",
                28, 1.93f, 81.6f,
                13, 0, 2));
    }

    public static void apresentar(ArrayList<Lutador> lutadores, int id){
      lutadores.get(id).apresentar();  
    }




}
