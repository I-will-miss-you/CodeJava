package cap3;

/**
 * <p>
 * Um veículo motorizado é caracterizado pela sua matrícula, quilometragem total(km), número total de litros
 * do seu depósito (capacidade) e número de litros ontidos em tal depósito (reserva incluida = 10 litros).
 * Sabe-se também o seu consumo médio aos 100km, que raramente varia. O veículo possui ainda um contador de
 * viagens realizadas.</p>
 * <p>
 * Crie um clase {@code Veiculo} que implemente métodos que permitam obter os seguintes resultados:</p>
 * <ul>
 * <li> Determinar quantos quilómetros é possivel percorrer com o combustível que está no depósito;
 * <li> Registar uma viagem de K quilómetros e atualizar os dados do veiculo;
 * <li> Determinar se o veiculo já entrou na reserva;
 * <li> Dado um valor médio de custo por litro, calcular o valor total gasto em combustível;
 * <li> Dado um valor médio de custo por litro, calcular o custo médio por quilómetro;
 * <li> Meter L litros de gasolina, ou máximo possível inferior a L, sem transbordar.
 * </ul>
 *
 * @author code36u4r60
 */
public class Veiculo {

    ///////////////////////////////////////////
    // Constantes
    ///////////////////////////////////////////
    private final int RESERVA = 10;

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    private String matricula;
    private double kmTotal;
    private double deposito;
    private double litros;
    private double consumoMed;
    private int viagens;

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    public Veiculo(String matricula, double kmTotal, double deposito, double litros, double consumoMed, int viagens) {
        this.matricula = matricula;
        this.kmTotal = kmTotal;
        this.deposito = deposito;
        this.litros = litros;
        this.consumoMed = consumoMed;
        this.viagens = viagens;
    }

    public Veiculo(Veiculo v) {
        this(v.getMatricula(), v.getKmTotal(), v.getDeposito(), v.getLitros(), v.getConsumoMed(), v.getViagens());
    }

    ///////////////////////////////////////////
    // Getters and Setters
    ///////////////////////////////////////////
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getKmTotal() {
        return kmTotal;
    }

    public void setKmTotal(double kmTotal) {
        if (kmTotal < 0) {
            this.kmTotal = 0;
        } else {
            this.kmTotal = kmTotal;
        }
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        if (deposito < 0) {
            this.deposito = 0;
        } else {
            this.deposito = deposito;
        }
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros < 0 ? 0 : litros < deposito ? litros : deposito;
    }

    public double getConsumoMed() {
        return consumoMed;
    }

    public void setConsumoMed(double consumoMed) {
        this.consumoMed = consumoMed;
    }

    public int getViagens() {
        return viagens;
    }

    public void setViagens(int viagens) {
        this.viagens = viagens;
    }

    ///////////////////////////////////////////
    // Outros Método
    ///////////////////////////////////////////    
    /**
     * Quantos quilômetros o veículo consegues realizar com a quantidade atual de combustível em depósito.
     *
     * @return km que pode realizar
     */
    public double podeRealizar() {
        return litros / consumoMed * 100;
    }

    /**
     * Informa se o veículo consegue realizar uma dada distância em quilômetros.
     *
     * @param km quilômetros que pretende percorrer.
     * @return {@code true} se conseguir realizar. {@code false} caso contrário.
     */
    public boolean podeRealizar(double km) {
        return podeRealizar() >= km;
    }

    /**
     * Calcula o número de litros de combustível necessário para viajar para percorrer uma dada distância em
     * km.
     *
     * @param km distância
     * @return litros de combustível necessário
     */
    public double consumo(double km) {
        return consumoMed / 100 * km;
    }

    /**
     * Regista viagem realizada
     *
     * @param km realizados
     */
    public void registarViagem(double km) {
        viagens++;
        setLitros(litros - consumo(km));
        setKmTotal(kmTotal + km);
    }

    /**
     * Verificar se o veiculo esta na reserva
     *
     * @return {@code true} se estiver na reserva; {@code false} caso contrario.
     */
    public boolean naResarva() {
        return litros <= RESERVA;
    }

    /**
     * Custo financeiro de combustivel gasto até a data
     *
     * @param preco por litro
     * @return custo financeiro total
     */
    public double totalCombustivelGasto(double preco) {
        return consumoMed / 100 * kmTotal * preco;
    }

    /**
     * Calcular o custo financeiro por km
     *
     * @param preco por litro
     * @return custo financeiro por km
     */
    public double custoKm(double preco) {
        return consumoMed / 100 * preco;
    }

    /**
     * Encher depósito
     *
     * @param litros de combustivel
     */
    public void meterCombustivel(double litros) {
        setLitros(this.litros + litros);
    }

    @Override
    public String toString() {
        return "Veiculo{" 
                + "RESERVA=" + RESERVA 
                + ", matricula=" + matricula 
                + ", kmTotal=" + kmTotal 
                + ", deposito=" + deposito 
                + ", litros=" + litros 
                + ", consumoMed=" + consumoMed 
                + ", viagens=" + viagens 
                + '}';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("31-ZC-67", 0, 60, 60, 5.7, 0);
        System.out.printf("Qualtos km pode realizar: %.2f km \n", v1.podeRealizar());

        // Registar Viagens
        System.out.println("");
        v1.registarViagem(500);
        System.out.println("Registo de uma viagem de 500km");
        System.out.printf("Qualtos km pode realizar: %.2f km \n", v1.podeRealizar());

        //Pode Realizar
        System.out.println("");
        System.out.println("Pode realizar uma viagem de 600km: " + v1.podeRealizar(600));
        System.out.println("Pode realizar uma viagem de 500km: " + v1.podeRealizar(500));

        //Reserva
        System.out.println("Esta na reserva: " + v1.naResarva());

        //Encher depósito
        v1.meterCombustivel(5000);
        System.out.println(v1.getLitros());
        
        System.out.println(v1.toString());
        
    }

}
