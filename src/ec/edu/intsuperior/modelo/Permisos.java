/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author userpc
 */
public class Permisos {
private String tipo="";
private String cadenaPermisos="";
private ArrayList<String> listapermisos=new ArrayList<>();
public ArrayList<String> estadoGeneral(){
    ArrayList<String>salida=new ArrayList<>();
    String []seccion=getCadenaPermisos().split("/");
    salida.addAll(Arrays.asList(seccion));
    return salida;
}
public static String []subDividir(String cadena,String caracter){
    return  cadena.split(caracter);
}

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the cadenaPermisos
     */
    public String getCadenaPermisos() {
        return cadenaPermisos;
    }

    /**
     * @param cadenaPermisos the cadenaPermisos to set
     */
    public void setCadenaPermisos(String cadenaPermisos) {
        this.cadenaPermisos = cadenaPermisos;
    }

    @Override
    public String toString() {
        return "Tipo de Usuario: "+getTipo()+"\nPermisos: "+getCadenaPermisos(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the listapermisos
     */
    public ArrayList<String> getListapermisos() {
        return listapermisos;
    }

    /**
     * @param listapermisos the listapermisos to set
     */
    public void setListapermisos(ArrayList<String> listapermisos) {
        this.listapermisos = listapermisos;
    }
    public void agregarPerminso(String dato){
        if(!getListapermisos().contains(dato)){
            getListapermisos().add(dato);
            System.out.println("Dato ingresado: "+dato);
        }else System.out.println("Dato repetido: "+dato);
    }
    public void eliminarElemento(String dato){
       getListapermisos().remove(dato);
    }
}
