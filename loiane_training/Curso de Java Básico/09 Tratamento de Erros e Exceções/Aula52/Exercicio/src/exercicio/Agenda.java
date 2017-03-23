package exercicio;


/**
 *
 * @author code36u4r60
 */
public class Agenda {

    private static int N_ELEM = 0;
    private static int MAX = 0;
    private Contato[] contatos;

    public Agenda(int n) {
        this.contatos = new Contato[n];
        this.MAX = n;
    }

    public Agenda() {
        this(5);
    }

    public void adicionarContato(Contato c) throws AgendaCheiaExeption {
        if (N_ELEM >= MAX) {
            throw new AgendaCheiaExeption();
        } else {
            contatos[N_ELEM++] = c;
        }
    }

    public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }
            }
        }
        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos){
            if (c != null){
                s += c.toString() + "\n";
            }
        }
        return s;
    }

}
