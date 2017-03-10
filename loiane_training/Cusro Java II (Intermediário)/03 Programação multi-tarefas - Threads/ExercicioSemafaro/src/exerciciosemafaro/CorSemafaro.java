/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosemafaro;

/**
 *
 * @author code36u4r60
 */
public enum CorSemafaro {
    VERDE(5000), 
    AMARELO(1000), 
    VERMELHO(4000);

    private int tempoEspera;

    private CorSemafaro(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
       
}
