package agenda;

/**
 *
 * @author Code36u4r60
 */
public class Agenda {

    private String nome;
    private Contato[] contatos;

    public Agenda(String nome, Contato[] contatos) {
        this.nome = nome;
        this.contatos = contatos;
    }

    public Agenda(String nome) {
        this.nome = nome;
    }

    public Agenda() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void printAgenda() {
        System.out.println("Agenda " + nome);
        if (contatos != null) {
            for (Contato contato : contatos) {
                if (contato != null) {
                    System.out.println(contato.toString());
                }
            }
        }
    }
}
