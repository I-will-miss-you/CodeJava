package cap3;

import java.time.LocalDate;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DAYS;
import java.time.temporal.TemporalUnit;
import javafx.util.converter.LocalDateStringConverter;

/**
 * Uma <strong>conta bancária</strong> a prazo é criada com um código e um titular, tem uma data de
 * início (dia, mês e ano) de contagem de juros que é atualizada sempre que os juros são calculados
 * e adicionados ao capital, tem um dado montante de capital depositado com um prazo para cáculo de
 * juros e uma taxa de juro de t% para tal prazo, definida quando da sua criação. Crie uma classe
 * {@code ContaPrazo} que, para além dos construtores e dos métodos de consulta, permite realizar as
 * seguintes operações:
 * <ul>
 * <li> Calcular o número de dias passados desde a baertura da conta;
 * <li> Alterar o titular da conta ou a taxa de juro;
 * <li> Atingido o prazo para juros, calcular tais juros, juntá-los ao capital e registar a nova
 * data de cáculo de juros;
 * <li> Fechar a conta calculando o valor total a pagar ao titular (capital inicial + juros).
 * </ul>
 *
 * @author code36u4r60
 */
public class ContaPrazo {

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    private String codigo;
    private String titular;
    private int prazo;
    private double taxa;
    private double capital;
    private LocalDate dataInicio;
    private LocalDate dataJuros;

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    public ContaPrazo(String codigo, String titular, int prazo, double taxa, double capital, LocalDate dataInicio) {
        this.codigo = codigo;
        this.titular = titular;
        this.prazo = prazo;
        this.taxa = taxa;
        this.capital = capital;
        this.dataInicio = dataInicio;
        this.dataJuros = dataInicio.plusDays(prazo);
    }

    public ContaPrazo(ContaPrazo cp) {
        this(cp.getCodigo(), cp.getTitular(), cp.getPrazo(), cp.getTaxa(), cp.getCapital(), cp.getDataInicio());
    }

    ///////////////////////////////////////////
    // Getters e Setters
    ///////////////////////////////////////////
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataJuros() {
        return dataJuros;
    }

    public void setDataJuros(LocalDate dataJuros) {
        this.dataJuros = dataJuros;
    }

    ///////////////////////////////////////////
    // Outros Metedos
    ///////////////////////////////////////////
    /**
     * Calcula a diferença em dias entre duas datas.
     *
     * @param inicio data inicio
     * @param fim data fim
     * @return número de dias
     */
    private int diasEntreDatas(LocalDate inicio, LocalDate fim) {
        return (int) inicio.until(fim, DAYS);
    }

    /**
     * Dias entre hoje e o cáculo dos juros
     *
     * @return número de dias
     */
    public int diasAteJuros() {
        return diasEntreDatas(LocalDate.now(), dataJuros);
    }

    /**
     * Dias passados desde a abertura da conta
     *
     * @return número de dias
     */
    public int diasDeJuros() {
        return diasEntreDatas(dataInicio, LocalDate.now());
    }

    /**
     * Calcular juros atuais, somar ao capital e calcular nova data de cálculo de juros
     *
     * @param data
     */
    public void venceJuros(LocalDate data) {
        int dias = diasEntreDatas(dataInicio, data);
        capital += capital * (taxa / 100 / prazo) * dias;
        dataInicio = data;
        dataJuros = dataInicio.plusDays(dias);
    }

    /**
     * Calcular juros atuais, somar ao capital e calcular nova data de cálculo de juros.
     */
    public void venceJuros() {
        LocalDate hoje = LocalDate.now();
        if (hoje.isBefore(dataJuros)) {
            venceJuros(hoje);
        } else {
            venceJuros(dataJuros);
        }
    }

    /**
     * Fechar a conta
     */
    public void fecharConta() {
        venceJuros();
        dataInicio = null;
        dataJuros = null;
    }

    /**
     * Criar <i>String</i> com a data no formato dd-mm-yyyy.
     *
     * @param date LocalDate
     * @return <i>String</i> com a data formatada
     */
    private String dataToString(LocalDate date) {
        StringBuilder s = new StringBuilder();
        s.append(date.getDayOfMonth()).append(" - ");
        s.append(date.getMonthValue()).append(" - ");
        s.append(date.getYear());
        return s.toString();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("====== Conta a Prazo ======");
        s.append("\nCódigo: ").append(codigo);
        s.append("\nTitular: ").append(titular);
        s.append("\nCapital: ").append(String.format("%.2f €", capital));
        s.append("\nTaxa de juros: ").append(taxa);
        s.append("\nPrazo: ").append(prazo);
        s.append("\nData de inicio: ").append(dataInicio);
        s.append("\nData Juros: ").append(dataJuros);
        return s.toString();
    }

    /**
     * Teste a classe {@code ContaPrazo}
     *
     * @param args
     */
    public static void main(String[] args) {
        ContaPrazo conta = new ContaPrazo("conta1", "titular 1 ", 1460, 15, 1500, LocalDate.of(2017, Month.FEBRUARY, 28));
        System.out.println(conta.diasAteJuros());
        conta.venceJuros();
        System.out.println(conta.getDataInicio());
        System.out.println(conta.getDataJuros());

        System.out.println(conta.toString());
    }
}
