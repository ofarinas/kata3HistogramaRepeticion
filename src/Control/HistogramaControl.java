/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Persistencia.cargador;
import Vista.dialogo;
import vista.Visor;
import java.io.FileNotFoundException;
import java.io.IOException;
import modelo.ConstruirHitograma;

/**
 *
 * @author usuario
 */
public class HistogramaControl {
   
    public void excecute() throws FileNotFoundException, IOException{
   ConstruirHitograma<String> construrHisto = new ConstruirHitograma<>();
   cargador c=new cargador();
   construrHisto.calcularHistograma(c.cargadorCorreo("C:\\Users\\usuario\\Documents"
            + "\\NetBeansProjects\\kata3Histograma\\src\\Persistencia\\misCorreos.txt"));
    Visor viewer=new Visor(construrHisto.getHistograma());  
   viewer.show();
//    dialogo d=new dialogo();
//     d.execute();
    }
}
