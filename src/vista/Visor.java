/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Histograma;

/**
 *
 * @author usuario
 */
public class Visor<E> {
    Histograma<E>histograma;

    public Visor(Histograma<E> histograma) {
        this.histograma = histograma;
    }
    
    public void show(){
        for (E key : histograma.keySet()) {
              System.out.println(key +"se repite:"+histograma.get(key));
        }
      
  }
  
 }
