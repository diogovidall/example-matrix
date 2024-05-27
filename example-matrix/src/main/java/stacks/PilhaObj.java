package stacks;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class PilhaObj<T> {

    private ArrayList<T> pilha;
    private int topo;

    public PilhaObj(int i) {
        this.pilha = new ArrayList<>();
        this.topo = -1;
    }

    public void push(T elemento) {
        pilha.add(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return pilha.remove(pilha.size() - 1);
    }

    public boolean isEmpty() {
        return pilha.isEmpty();
    }

    @Override
    public String toString() {
        return pilha.toString();
    }
}
