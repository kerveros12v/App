/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author userpc
 */
public interface TransaccionContable {
    public void retenciones(String numComprovante,String ci,String tipo);
    public void devoluciones(String numComprovante,String ci,String tipo);
}
