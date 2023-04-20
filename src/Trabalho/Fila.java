package Trabalho;

import java.util.ArrayList;
import java.util.List;

public class Fila<T> {
	
    private List<T> elementos;

    public Fila() {
        elementos = new ArrayList<>();
    }

    
    public void adicionar(T elemento) {
        elementos.add(elemento);
    }

    
    public T remover() {
        if (!elementos.isEmpty()) {
            return elementos.remove(0);
        } else {
            return null;
        }
    }


    public boolean vazia() {
        return elementos.isEmpty();
    }


    public int tamanho() {
        return elementos.size();
    }
}