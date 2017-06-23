package cap3;

/**
 * Um seguimenmto de reta é representável por dois pontos de coordenadas reais: o início e ofim do
 * segmento. Desenvolva o código de uma classe {@code Segmento} que implemente os seguintes métodos.
 *
 * <ul>
 * <li> Calcular o comprimento do segmento;
 * <li> Determinar o declive do segmento, cf. <strong>(y2 - y1) / (x2 - x1)</strong>;
 * <li> Determinar se o segmento sobe ou desce a partir do seu início (devolver uma {@code String});
 * <li> Deslocar o segmento <strong>dx</strong> em XX e <strong>dy</strong> no eixo dos YY;
 * <li> Se o segmento for o diâmetro de uma circunferência, determinar qual o perímetro desta.
 * </ul>
 *
 * @author code36u4r60
 */
public class Segmento {

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    Ponto2D p0;
    Ponto2D p1;

    public Segmento(Ponto2D p0, Ponto2D p1) {
        this.p0 = p0;
        this.p1 = p1;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
