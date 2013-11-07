/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author usuario
 */
public class dialogo {

    public void execute() throws IOException{
     BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("entre el dominio que desea ver las repeticiones");
             String nombre= lector.readLine();
               System.out.println("el nombre es"+nombre);   
        }
  }    
}
