/*
 *  Copyright (c) - Pode usar e abusar
 *
 * O conteúdo desta classe deriva do meu estudo de Algoritmos através do livro
 * <a href="http://algs4.cs.princeton.edu/home/">Algorithms, 4th Edition</a>
 *
 */
package aed;

import java.util.NoSuchElementException;

/**
 *
 *
 * <p>
 * <table>
 * <th colspan="2"> Métodos disponíveis: </th>
 * <tr><td>size - </td><td>Retorna o número de pares de valores-chave nesta tabela de símbolos.</td></tr>
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

        private Key key;            //Ordernado pela Key
        private Value val;          //dados associados
        private Node left, right;         //sub-árvores esquerda e direita
        private int size;           //número de nós das sub-árvores

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }

        public Key getKey() {
            return key;
        }

        public void setKey(Key key) {
            this.key = key;
        }

        public Value getVal() {
            return val;
        }

        public void setVal(Value val) {
            this.val = val;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
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
            return x.getSize();
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
     * @return o {@code val} associado à {@code key} fornecida ou {@code null} caso a {@code key} não exista.
     */
    private Value get(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.getKey());
        if (cmp < 0) {
            return get(x.getLeft(), key);
        } else if (cmp > 0) {
            return get(x.getRight(), key);
        } else {
            return x.getVal();
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

    /**
     * Insere um par chave-valor especificado na tabela de símbolos, substituindo o valor antigo pelo novo
     * valor se a tabela de símbolos já contiver a chave especificada. Exclui a chave especificada (e seu
     * valor associado) dessa tabela de símbolos se o valor especificado for {@code null}.
     *
     * @param key a chave
     * @param val o valor
     * @throws IllegalArgumentException se {@code key} for {@code null}
     */
    public void put(Key key, Value val) {
        if (key == null) {
            throw new IllegalArgumentException("o primeiro argumento do put() é null");
        }
        if (val == null) {
            //delete(key);
            return;
        }
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val) {
        if (x == null) {
            return new Node(key, val, 1);
        }
        int cmp = key.compareTo(x.getKey());
        if (cmp < 0) {
            x.setLeft(put(x.getLeft(), key, val));
        } else if (cmp > 0) {
            x.setRight(put(x.getRight(), key, val));
        } else {
            x.setVal(val);
        }
        x.setSize(1 + size(x.getLeft()) + size(x.getRight()));
        return x;
    }

    /**
     * Remove a chave mais pequena e o seu valor associado da tabela de símbolos.
     *
     * @throws NoSuchElementException se a tabela de símbolos estiver vazia
     */
    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("tabela de símbolos vazia");
        }
        root = deleteMin(root);
    }

    private Node deleteMin(Node x) {
        if (x.getLeft() == null) {
            return x.getRight();
        }
        x.setLeft(deleteMin(x.getLeft()));
        x.setSize(size(x.getLeft()) + size(x.getRight()) + 1);
        return x;
    }

    /**
     * Remove a maior chave e o seu valor associado da tabela de símbolos.
     *
     * @throws NoSuchElementException se a tabela de símbolos estiver vazia
     */
    public void deleteMax() {
        if (isEmpty()) {
            throw new NoSuchElementException("tabela de símbolos vazia");
        }
        root = deleteMax(root);
    }

    private Node deleteMax(Node x) {
        if (x.getRight() == null) {
            return x.getLeft();
        }
        x.setRight(deleteMax(x.getRight()));
        x.setSize(size(x.getLeft()) + size(x.getRight()) + 1);
        return x;
    }

    /**
     * Remove a uma chave especificada e o seu valor associado da tabela de símbolos (caso a chave se encontre
     * na tabela de símbolos).
     *
     * @param key chave
     * @throws IllegalArgumentException se a {@code key} for {@code null}
     */
    public void delete(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("o argumento do delete() é null");
        }
        root = delete(root, key);
    }

    private Node delete(Node x, Key key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.getKey());
        if (cmp < 0) {
            x.setLeft(delete(x.getLeft(), key));
        } else if (cmp > 0) {
            x.setRight(delete(x.getRight(), key));
        } else {
            if (x.getRight() == null) {
                return x.getLeft();
            }
            if (x.getLeft() == null) {
                return x.getRight();
            }
            Node t = x;
            //x = min(t.right);
            x.setRight(deleteMin(t.getRight()));
            x.setLeft(t.getLeft());
        }
        x.setSize(size(x.getLeft()) + size(x.getRight()) + 1);
        return x;
    }

}//END
