
package aula;

/**
 *
 * @author Code36u4r60
 */
public class Carro {

    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: "
                + this.capCombustivel * this.consumoCombustivel + " km");
    }

    double obterAutonomia() {
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        return km / this.consumoCombustivel;
    }
}
