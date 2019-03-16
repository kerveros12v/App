/*
 * Copyright (C) 2019 dellpc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Categorias;
import ec.edu.intsuperior.modelo.DatosParametrosGeneral;
import ec.edu.intsuperior.vista.JPCategoria;
import ec.edu.intsuperior.vista.WCentral;

/**
 *
 * @author dellpc
 */
public class ControladorCategorias extends Controlador implements DatosParametrosGeneral {
private final Categorias categorias;

    public ControladorCategorias() {
        this.categorias = new Categorias();
    }
     public void showCategoria(WCentral central){
        JPCategoria wc=new JPCategoria(this);
        abrirInternalJFrame("Categorias", central, wc,false,true,false,350, 250);
    }
    
    @Override
    public String nuevo(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String editar(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscar(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
