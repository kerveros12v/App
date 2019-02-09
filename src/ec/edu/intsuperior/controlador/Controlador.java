/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.JPClienteProveedor;
import ec.edu.intsuperior.vista.JPFacturacion;
import ec.edu.intsuperior.vista.JPProductos;
import ec.edu.intsuperior.vista.JPUsuario;
import ec.edu.intsuperior.vista.Login;
import ec.edu.intsuperior.vista.WCentral;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author userpc
 */
public class Controlador {
    public void getClienteProveedor(WCentral central,String titulo){
        JPClienteProveedor wc=new JPClienteProveedor(this);
        abrirInternalJFrame(titulo,central,wc,false,true,false,401, 300);
    }
    public void getUsuario(WCentral central){
        JPUsuario wc=new JPUsuario(this);
        abrirInternalJFrame("Usuarios", central, wc,false,true,false,415, 300);
    }
    public void getProducto(WCentral central){
        JPProductos wc=new JPProductos(this);
        abrirInternalJFrame("Productos", central, wc,false,true,false,500, 400);
    }
    public void getSistema(){
       WCentral wc=new WCentral(this);
        abrirJFrame(wc,true,true);

    }
    public void getLogin(){
       Login wc=new Login(this);
        abrirJFrame(wc,false,false);

    }
     public void getFacturacion(WCentral central,String titulo){
        JPFacturacion wc=new JPFacturacion(this);
        abrirInternalJFrame(titulo, central, wc,false,true,true,850, 630);
    }
    private void abrirInternalJFrame(String title,WCentral central,JPanel inter,Boolean cambiarTamanio,Boolean maximizar,Boolean salida,int ancho,int alto){
        JInternalFrame wc=new JInternalFrame(title,cambiarTamanio,maximizar,salida,true); 
       
       
       
        wc.setSize(ancho, alto);
        wc.add(inter);
        central.addJFrame(wc);
        wc.setVisible(true);
    }
    private void abrirJFrame(JFrame wc,Boolean maximizar,Boolean salida){
        if(maximizar)wc.setExtendedState(JFrame.MAXIMIZED_BOTH);
        if(salida)wc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wc.setLocationRelativeTo(null);
        wc.setVisible(true);
    }

   
}
