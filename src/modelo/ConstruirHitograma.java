/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author usuario
 */
public class ConstruirHitograma<E> {

    Histograma<E> histograma;

    public ConstruirHitograma() {
    }

    public void calcularHistograma(E[] listaElementos) {

        for (E key : listaElementos) {
            if (histograma == null) {
                histograma = new Histograma<>();
            }


            if (histograma.containsKey(key)) {
                histograma.put(key, histograma.get(key) + 1);
            } else {
                histograma.put(key, 0);
            }

        }
    }

    public int frecuencia(E key) {
        if (histograma.containsKey(key)) {
            return histograma.get(key);
        } else {
            return 0;
        }
    }

    public Histograma<E> getHistograma() {
        return histograma;
    }
}
