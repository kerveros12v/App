/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author userpc
 */
public class Serializar {
     String notificacion="Sin operacion";
     @Override
    public String toString(){
        return notificacion;
    }
    /***
     * Se ingresa la direccion absoluta de 
     * los archivos de configuracion y el vector de datos a guardar
     * @param dir
     * @param dat 
     */
    public void Guardar(String dir,Object[]dat){
        notificacion=("Valores Guardados en :"+dir);
        try{
            try (ObjectOutputStream sal = new ObjectOutputStream(new FileOutputStream(dir))) {
                for(int i=0;i<=dat.length-1;i++){
                    sal.writeObject(dat[i]);
                }
            }
        }catch(IOException ex){
            notificacion=notificacion+"\nError de Generacion: \n"+ex.getMessage();
        }
    }
    /***
     * Se ingresa la direccion absoluta del archivo a usar
     * se returna una lista de objetos en su foma general
     * @param dir
     * @return 
     */
    public List Abrir(String dir){
        notificacion="Valores Abiertos de :>> "+dir;
        List lst=new ArrayList<>();
        try{
        ObjectInputStream entrada=new ObjectInputStream(new FileInputStream(dir));
        while(true){
            try {
                lst.add(entrada.readObject());
                if(!lst.isEmpty()){
                    notificacion=notificacion+"\n"+lst.size()+"\n";
                    notificacion=notificacion+"\nObjeto Entrada:>>> "+lst.get(lst.size()-1).toString();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }catch(IOException ex){
            notificacion="No se puede leer el Archivo";
        }
        return lst;
    }
}
