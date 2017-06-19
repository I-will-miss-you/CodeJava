/*
 *  Copyright (c) - Pode usar e abusar
 *
 * O conteúdo desta classe deriva do meu estudo de Algoritmos através do livro
 * <a href="http://algs4.cs.princeton.edu/home/">Algorithms, 4th Edition</a>
 *
 */
package aed;

/**
 *
 *
 * <p>
 * <table>
 * <th colspan="2"> Métodos disponíveis: </th>
 * <tr><td>size - </td><td>Retorna o número de pares de valores-chave nesta tabela de
 * símbolos.</td></tr>
 * <tr><td>isEmpty - </td><td>Retorna se a tabela de símbolos está vazia.</td></tr>
 * <tr><td>get - </td><td>Retorna o valor associado à key fornecida.</td></tr>
 * <tr><td>contains - </td><td>Verifica se existe uma da {@code key} na BST</td></tr>
 * <tr><td> - </td><td></td></tr>
 * <tr><td> - </td><td></td></tr>
 *
 *
 * </table>
 * </p>
 *
 *
 * @author code36u4r60
 * @param <Key> chave
 * @param <Value> valor
 */
public class BST<Key extends Comparable<Key>, Value> {

    private Node root;

    private class Node {

        private final Key key;            //Ordernado pela Key
        private final Value val;          //dados associados
        private Node left, right;         //sub-árvores esquerda e direita
        private final int size;           //número de nós das sub-árvores

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }
    }

    /**
     * Inicializa uma tabela de símbolos vazia
     */
    public BST() {
    }

    /**
     * Retorna o número de pares de valores-chave nesta tabela de símbolos.
     *
     * @return O número de pares de valores-chave nesta tabela de símbolos
     */
    public int size() {
        return size(root);
    }

    /**
     * Retornar número de pares de valores-chave da BST a partir de um nó (Node) root x
     *
     * @param x nó (Node) root
     * @return número de pares de valores-chave da BST
     */
    private int size(Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.size;
        }
    }

    /**
     * Retorna se a tabela de símbolos está vazia.
     *
     * @return {@code true} se a tabela de símbolos estiver vazia; {@code false} caso contrário.
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Retorna o valor associado à key fornecida.
     *
     * @param key chave
     * @return o valor associado à key fornecida.
     * @throws IllegalArgumentException se a {@code key} for {@code null}
     */
    public Value get(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("o argumento de get() é nulo");
        }
        return get(root, key);
    }

    /**
     * Pesquisa se existe alguma key na BST igual a key fornecida
     *
     * @param x nó
     * @param key chave
     * @return o {@code val} associado à {@code key} fornecida ou {@code null} caso a {@code key}
     * não exista.
     */
    private Value get(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0) {
            return get(x.right, key);
        } else {
            return x.val;
        }
    }

    /**
     * Verifica se existe uma da {@code key} na BST
     *
     * @param key chave
     * @return {@code true} se existir e {@code false} caso contrário.
     * @throws IllegalArgumentException se a {@code key} for {@code null}
     */
    public boolean contains(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("o argumento de contains() é nulo");
        }
        return get(key) != null;
    }

}
