/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class cargador<E> {

    public String[] cargadorCorreo(String direccion) throws FileNotFoundException {
        BufferedReader lector = new BufferedReader(new FileReader(new File(direccion)));
        ArrayList<String> lista_coreo = new ArrayList<>();
        while (true) {
            try {
                String linea = lector.readLine();
                if (linea.contains("@")) {
                    lista_coreo.add(linea.split("@")[1]);
                }
            } catch (Exception e) {
                break;

            }
        }
        return  lista_coreo.toArray(new String[0]);
    }
}
