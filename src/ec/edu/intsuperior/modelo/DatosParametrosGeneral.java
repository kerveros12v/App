/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author user
 */
public interface  DatosParametrosGeneral {
    public String nuevo(String query);
    public String editar(String query);
    public String eliminar(String query);
    public void buscar(String query);
    public String Imprimir();
}
