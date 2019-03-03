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

import ec.edu.intsuperior.modelo.Productos;
import ec.edu.intsuperior.vista.JPProductos;
import ec.edu.intsuperior.vista.WCentral;

/**
 *
 * @author dellpc
 */
public class ControladorProducto extends Controlador{
    private Productos productos=new Productos();
    /**
     * Metodo para la abertura de Vista Productos
     * @param central 
     */
    public void getProducto(WCentral central){
        JPProductos wc=new JPProductos(this);
        abrirInternalJFrame("Productos", central, wc,false,true,false,350, 250);
    }
    
    /**
     * @return the productos
     */
    public Productos getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(Productos productos) {
        this.productos = productos;
    }
}
