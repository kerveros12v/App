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
package ec.edu.intsuperior.modelo;
import java.io.*;
/**
 *
 * @author dellpc
 */
public  class ConeccionBaseDatos implements Serializable {
     public String driver = "com.mysql.jdbc.Driver";

    // Nombre de la base de datos
    public String database = "sfwb_1";

    // Host
    public String hostname = "localhost";

    // Puerto
    public String port = "3306";

     // Nombre de usuario
    public String username = "root";
     // Clave de usuario
    public String password = "root";
     // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
   public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
   
}
