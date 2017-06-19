/*
 *  Copyright (c) - Pode usar e abusar
 *
 * O conteúdo desta classe deriva do meu estudo de Algoritmos através do livro
 * <a href="http://algs4.cs.princeton.edu/home/">Algorithms, 4th Edition</a>
 *
 */
package aed;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.TreeMap;

/**
 * A classe {@code ST} representa uma tabela de símbolos de pares de valores-chave genéricos -
 * ordenada. Foram acrescentados alguns métodos a classe original.
 *
 *
 *
 * <p>
 * <table>
 * <th colspan="2"> Métodos disponíveis: </th>
 * <tr><td>get - </td><td>Retorna o valor associado à uma chave</td></tr>
 * <tr><td>put - </td><td>Adiciona um novo par chave-valor na tabela de símbolos</td></tr>
 * <tr><td>addNew - </td><td>Adiciona um novo par chave-valor caso a chave não exista</td></tr>
 * <tr><td>delete - </td><td> Remover elemento correspondente à chave</td></tr>
 * <tr><td>contains - </td><td> Remover elemento correspondente à chave</td></tr>
 * <tr><td>removeValue - </td><td> Remover elemento correspondente à chave</td></tr>
 *
 *
 * </table>
 * </p>
 *
 *
 * @see  <a href="http://algs4.cs.princeton.edu/31elementary/">Section 3.1</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 * @author code36u4r60
 * @param <Key> tipo das chaves
 * @param <Value> tipo dos valores
 */
public class ST<Key extends Comparable<Key>, Value> {

    private TreeMap<Key, Value> st;

    /**
     * O comparador é utilizado para realizar comparações dos valores {@code value}
     *
     * @serial
     */
    private final Comparator<? super Value> comparator;

    /**
     * Cria uma tabela de símbolos vazia.
     */
    public ST() {
        st = new TreeMap<>();
        comparator = null;
    }

    /**
     * Cria uma tabela de símbolos vazia.
     *
     * @return tabela de símbolos vazia.
     */
    public static ST ST() {
        return new ST();
    }

    /**
     * Cria uma tabela de símbolos a partir de uma outra tabela de símbolos
     *
     * @param st tabela de símbolos
     */
    public ST(ST st) {
        this.st = new TreeMap<>();
        st.st.forEach((k, v) -> {
            this.st.put((Key) k, (Value) v);
        });
        comparator = null;
    }

    /**
     * Cria uma tabela de símbolos a partir de uma outra tabela de símbolos
     *
     * @param st tabela de símbolos
     * @return tabela de símbolos preenchida
     */
    public static ST ST(ST st) {
        return new ST(st);
    }

    /**
     * Retorna o valor associado à uma chave.
     *
     * @param key a chave
     * @return o valor associada a chave(key) caso a chave exista na tabela de símbolos.
     * {@code null} caso a chave não exista na tabela de símbolos
     * @throws IllegalArgumentException se {@code key} for {@code null}
     */
    public Value get(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("A chave (key) não pode ser nula");
        }
        return st.get(key);
    }

    /**
     * Inser um par chave-valor na tabela de símbolos. Caso o valor seja {@code null} é efetuada a
     * remoção do elemento correspondente à chave indicada.
     *
     * @param key chave
     * @param val valor
     * @throws IllegalArgumentException se {@code key} for {@code null}
     */
    public void put(Key key, Value val) {
        if (key == null) {
            throw new IllegalArgumentException("A chave (key) não pode ser nula");
        }
        if (val == null) {
            st.remove(key);
        } else {
            st.put(key, val);
        }

    }

    /**
     * Adiciona um novo elemento caso não existe na tabela de símbolos um valor com a mesma
     * {@code key}.
     *
     * @param key chave
     * @param val valor
     * @throws IllegalArgumentException se {@code key} ou {
     * @cade value} for {@code null} ou {@code key} já existir.
     *
     */
    public void addNew(Key key, Value val) {
        if (key == null || val == null) {
            throw new IllegalArgumentException("Nenhum dos campos pode ser nula");
        }
        if (st.containsKey(key)) {
            throw new IllegalArgumentException("Já existe um par chave-valor com essa key.");
        }
        st.put(key, val);
    }

    /**
     * Remover elemento correspondente à chave
     *
     * @param key chave
     * @throws IllegalArgumentException se {@code key} for {@code null}
     */
    public void delete(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("A chave (key) não pode ser nula");
        }
        st.remove(key);
    }

    /**
     * Remover elemento correspondente à chave - faz a mesma coisa que {@code delete(Key key)} só
     * criei porque gosto mais de usar {@code remove(Key key)}
     *
     * @param key chave
     * @throws IllegalArgumentException se {@code key} for {@code null}
     */
    public void remove(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("A chave (key) não pode ser nula");
        }
        st.remove(key);
    }

    /**
     * Remove todos os pares Chave-Valor onde o Valor seja igual a {@code value}
     *
     * @param value
     */
    public void removeValue(Value value) {
        TreeMap<Key, Value> aux = new TreeMap<>();
        st.forEach((k, v) -> {
            if (compareValue(v, value) != 0) {
                aux.put(k, v);
            }
        });
        st = aux;
    }

    /**
     * Verifica se contém algum elemento com uma dada chave
     *
     * @param key a chave
     * @return {@code true]} se a {@code key} existir, {@code false} caso contrário
     * @throws IllegalArgumentException se {@code key} for {@code null}
     */
    public boolean contains(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("A chave (key) não pode ser nula");
        }
        return st.containsKey(key);
    }

    /**
     * Verifica se um dado valor existe na Tabela de Simbolos
     *
     * @param value o valor
     * @return {@code true]} se a {@code value} existir, {@code false} caso contrário
     * @throws IllegalArgumentException se {@code key} for {@code null}
     */
    public boolean containsValue(Value value) {
        if (value == null) {
            throw new IllegalArgumentException("o valor a pesquisar não pode ser nulo");
        }
        return st.containsValue(value);
    }

    /**
     * Retorna o número de elementos par-valor existentes na tabela de símbolos
     *
     * @return número de elementos par-valor existentes na tabela de símbolos
     */
    public int size() {
        return st.size();
    }

    /**
     * Retorna se a Tabela de símbolos esta vazia ou não
     *
     * @return {@code true} se vazia; {
     * @false} caso contrário
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Retorna todas as chaves da Tabela de Símbolos
     *
     * @return todas as chaves da Tabela de Símbolos
     */
    public Iterable<Key> keys() {
        return st.keySet();
    }

    /**
     * Retorna uma {@link Collection} de todos valores contidos na Tabela de Símbolos
     *
     * @return {@link Collection} de todos valores contidos na Tabela de Símbolos
     */
    public Collection<Value> values() {
        return st.values();
    }

    /**
     * Retorna a chave mais pequena (primeira chave) da tabela de símbolos
     *
     * @return a chave mais pequena da tabela de símbolos
     * @throws NoSuchElementException se a tabela de símbolos estiver vazia
     */
    public Key min() {
        if (isEmpty()) {
            throw new NoSuchElementException("A tabela de símbolos esta vazia");
        }
        return st.firstKey();
    }

    /**
     * Retorna a maior chave (última chave) da tabela de símbolos
     *
     * @return a maior chave contida na tabela de símbolos
     * @throws NoSuchElementException se a tabela de símbolos estiver vazia
     */
    public Key max() {
        if (isEmpty()) {
            throw new NoSuchElementException("A tabela de símbolos esta vazia");
        }
        return st.lastKey();
    }

    /**
     * Retorna a chave mais pequena nesta tabela de símbolos maior ou igual a {@code key}.
     *
     * @param key chave
     * @return chave mais pequena nesta tabela de símbolos maior ou igual a {@code key}.
     * @throws NoSuchElementException se não existir uma chave
     * @throws IllegalArgumentException se {@code key} é {@code null}
     */
    public Key ceiling(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("A chave (key) não pode ser nula");
        }
        Key k = st.ceilingKey(key);
        if (k == null) {
            throw new NoSuchElementException("Todas as chaves são menores do que " + key);
        }
        return k;
    }

    /**
     * Retorna a maior chave nesta tabela de símbolos inferior ou igual a {@code key}.
     *
     * @param key chave
     * @return maior chave nesta tabela de símbolos inferior ou igual a {@code key}.
     * @throws NoSuchElementException se não existir uma chave
     * @throws IllegalArgumentException se {@code key} é {@code null}
     */
    public Key floor(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("A chave (key) não pode ser nula");
        }
        Key k = st.floorKey(key);
        if (k == null) {
            throw new NoSuchElementException("Todas as chaves são maiores do que " + key);
        }
        return k;
    }

    /**
     * Cria clone da tabela de simbolos
     *
     * @return clone da Tabela de Símbolos
     */
    public ST cloneST() {
        return ST(this);
    }

    /**
     * Retorna uma lista de {@code Value} ordenados por uma {@code Comparator comp}
     *
     * @param comp método de comparação a ser usado
     * @return TreeSet de {@code value}
     */
    public ArrayList<Value> getList(Comparator comp) {
        ArrayList<Value> list = new ArrayList<>();
        st.forEach((k, v) -> {
            list.add(v);
        });
        list.sort(comp);
        return list;
    }

    /**
     * Compara dois Objetos (Value)
     */
    @SuppressWarnings("unchecked")
    final int compareValue(Object v1, Object v2) {
        return comparator == null ? ((Comparable<? super Value>) v1).compareTo((Value) v2)
                : comparator.compare((Value) v1, (Value) v2);
    }

    ////////////////////////////////////////////////////////////
    // Métodos de "print"
    ///////////////////////////////////////////////////////////
    /**
     * Imprime a Tabela Símbolos
     */
    public void printAll() {
        st.forEach((k, v) -> {
            out.println(k + " -> " + v);
        });

    }

    /**
     * Imprime a Tabela Símbolos de ordem decrescente da {@code Key}
     */
    public void printAllInv() {
        st.descendingMap().forEach((k, v) -> {
            out.println(k + " -> " + v);
        });
    }

    /**
     * Imprime a Tabela Símbolos de ordenada {@code value} a ordenação depende do método comparador
     * previamente criado
     */
    public void printSortedByValue() {
        TreeMap<Value, Key> aux = new TreeMap<>();
        st.forEach((k, v) -> {
            aux.put(v, k);
        });
        aux.forEach((v, k) -> {
            out.println(v);
        });

    }

    /**
     * Imprime a Tabela Símbolos pela ordem defenida pelo métedo {@code Comparator comp}
     *
     * @param comp método de comparação a ser usado
     */
    public void printSortedBy(Comparator comp) {
        TreeMap<Value, Key> aux = new TreeMap<>(comp);
        st.forEach((k, v) -> {
            aux.put(v, k);
        });
        aux.forEach((v, k) -> {
            out.println(v);
        });

    }

    ////////////////////////////////////////////////////////////
    // Método Main - Testes
    ///////////////////////////////////////////////////////////
    /**
     * Método de teste a classe ST
     *
     * @param args
     */
    public static void main(String[] args) {
        ST<String, String> linguas = ST();
        linguas.put("pt", "Portugês");
        linguas.put("fr", "Francês");
        linguas.put("es", "Espanha");
        linguas.put("ro", "Romeno");
        linguas.put("cs", "Checo");
        linguas.put("hr", "Croata");
        linguas.put("de", "Alemão");
        linguas.put("ja", "Japonês");
        linguas.put("ro", "Romeno");
        linguas.put("en", "Inglês");
        linguas.put("eng", "Inglês");
        linguas.put("ENG", "Inglês");

        linguas.keys().forEach((e) -> out.println(e + " -> " + linguas.get(e)));
        out.println("");

        out.println("Put(\"fr\",null) ");
        linguas.put("fr", null);
        linguas.keys().forEach((e) -> out.println(e + " -> " + linguas.get(e)));
        out.println("");

        out.println("remove(\"ro\") ");
        linguas.remove("ro");
        linguas.keys().forEach((e) -> out.println(e + " -> " + linguas.get(e)));
        out.println("");

        out.println("removeValue(\"Inglês\")");
        linguas.removeValue("Inglês");
        linguas.keys().forEach((e) -> out.println(e + " -> " + linguas.get(e)));
        out.println("");

        out.println("put(\"ro\", \"Romeno\")");
        out.println("put(\"en\", \"Inglês\")");
        linguas.put("ro", "Romeno");
        linguas.put("en", "Inglês");
        linguas.keys().forEach((e) -> out.println(e + " -> " + linguas.get(e)));
        out.println("");

        out.println("Existe a chave \"fr\":" + linguas.contains("fr"));
        out.println("Existe a chave \"pt\":" + linguas.contains("fr"));

        out.println("Existe o valor \"Francês\":" + linguas.containsValue("Francês"));
        out.println("Existe o valor \"Portugês \":" + linguas.containsValue("Portugês"));

        out.println("\nST(sTab):");
        ST<String, String> ling = ST(linguas);
        ling.keys().forEach((e) -> out.println(e + " -> " + ling.get(e)));

        out.println("\nClone:");
        ST<String, String> clone = linguas.cloneST();
        out.println("and put(\"co\", \"clone\")");
        clone.put("co", "clone");
        out.println("Print Clone:");
        clone.keys().forEach((e) -> out.println(e + " -> " + clone.get(e)));
        out.println("\nPrint Original:");
        linguas.keys().forEach((e) -> out.println(e + " -> " + linguas.get(e)));
        out.println("");

        out.println("size()");
        out.println(linguas.size());

        out.println("\nprintAll()");
        linguas.printAll();
        out.println("\nprintAllInv()");
        linguas.printAllInv();

        out.println("\nprintSortedByValue()");
        linguas.printSortedByValue();
    }

}
