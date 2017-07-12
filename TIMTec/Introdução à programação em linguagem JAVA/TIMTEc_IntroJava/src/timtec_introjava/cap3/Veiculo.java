package timtec_introjava.cap3;

/**
 *
 * @author code36u4r60
 */
public class Veiculo {

    static int atributoEstatico = 1;

    float velocidadeAtual = 0f;
    long numeroDeSerie = 0;

    static String metodoEstatico() {
        return "Atributo estático vale " + atributoEstatico;
    }

    public Veiculo() {
        numeroDeSerie = -1;
    }

    public Veiculo(float val, long num) {
        velocidadeAtual = val;
        numeroDeSerie = num;
    }

    void acelerar(float deltaV) {
        velocidadeAtual += deltaV;
    }

    void brecar() {
        velocidadeAtual -= 1.0f;
    }

    void parar() {
        while (velocidadeAtual > 0) {
            brecar();
        }
        velocidadeAtual = 0;
    }

}
