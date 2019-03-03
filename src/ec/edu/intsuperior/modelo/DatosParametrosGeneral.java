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
    public Boolean nuevo(String query);
    public Boolean editar(String query);
    public Boolean eliminar(String query);
    public Object buscar(String query);
    public String Imprimir();
}
