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
import ec.edu.intsuperior.modelo.Proveedores;
import ec.edu.intsuperior.vista.JPClienteProveedor;
import ec.edu.intsuperior.vista.WCentral;

/**
 *
 * @author dellpc
 */
public class ControladorProveedor extends Controlador{
     private final Proveedores proveedores =new Proveedores(); 
     private final JPClienteProveedor wc=new JPClienteProveedor(this);
    /**
     * Metodo para la abertura de Vista  Proveedores 
     * @param central
     * 
     */  
    public void getClienteProveedor(WCentral central){
        super.abrirInternalJFrame("Proveedor",central,wc,false,true,false,401, 300);
    }
}
