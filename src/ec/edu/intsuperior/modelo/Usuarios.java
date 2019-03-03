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
public class Usuarios implements DatosParametrosGeneral {

    private int idUsuarios;
    private String usu_nombres, usu_apellidos, usu_usuario, usua_clave;
    private Permisos permisos = new Permisos();

    public Usuarios() {
    }

    public Usuarios(int idUsuarios, String usu_nombres, String usu_apellidos, String usu_usuario, String usua_clave) {
        this.idUsuarios = idUsuarios;
        this.usu_nombres = usu_nombres;
        this.usu_apellidos = usu_apellidos;
        this.usu_usuario = usu_usuario;
        this.usua_clave = usua_clave;

    }

    /**
     * @return the idUsuarios
     */
    public int getIdUsuarios() {
        return idUsuarios;
    }

    /**
     * @param idUsuarios the idUsuarios to set
     */
    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    /**
     * @return the usu_nombres
     */
    public String getUsu_nombres() {
        return usu_nombres;
    }

    /**
     * @param usu_nombres the usu_nombres to set
     */
    public void setUsu_nombres(String usu_nombres) {
        this.usu_nombres = usu_nombres;
    }

    /**
     * @return the usu_apellidos
     */
    public String getUsu_apellidos() {
        return usu_apellidos;
    }

    /**
     * @param usu_apellidos the usu_apellidos to set
     */
    public void setUsu_apellidos(String usu_apellidos) {
        this.usu_apellidos = usu_apellidos;
    }

    /**
     * @return the usu_usuario
     */
    public String getUsu_usuario() {
        return usu_usuario;
    }

    /**
     * @param usu_usuario the usu_usuario to set
     */
    public void setUsu_usuario(String usu_usuario) {
        this.usu_usuario = usu_usuario;
    }

    /**
     * @return the usua_clave
     */
    public String getUsua_clave() {
        return usua_clave;
    }

    /**
     * @param usua_clave the usua_clave to set
     */
    public void setUsua_clave(String usua_clave) {
        this.usua_clave = usua_clave;
    }

    @Override
    public Boolean nuevo(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean editar(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscar(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the permisos
     */
    public Permisos getPermisos() {
        return permisos;
    }

    /**
     * @param permisos the permisos to set
     */
    public void setPermisos(Permisos permisos) {
        this.permisos = permisos;
    }

}
