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
public class Proveedores implements DatosParametrosGeneral{
    int idproveedores;
    private String prov_nombres;
    private String prov_apellidos;
    private String prov_direccion;
    private String prov_telefono;
    private String prov_cedula;
    private String prov_correo;

    public Proveedores() {
    }

    public Proveedores(int idproveedores, String prov_nombres, String prov_apellidos, String prov_direccion, String prov_telefono, String prov_cedula, String prov_correo) {
        this.idproveedores = idproveedores;
        this.prov_nombres = prov_nombres;
        this.prov_apellidos = prov_apellidos;
        this.prov_direccion = prov_direccion;
        this.prov_telefono = prov_telefono;
        this.prov_cedula = prov_cedula;
        this.prov_correo = prov_correo;
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
     * @return the prov_nombres
     */
    public String getProv_nombres() {
        return prov_nombres;
    }

    /**
     * @param prov_nombres the prov_nombres to set
     */
    public void setProv_nombres(String prov_nombres) {
        this.prov_nombres = prov_nombres;
    }

    /**
     * @return the prov_apellidos
     */
    public String getProv_apellidos() {
        return prov_apellidos;
    }

    /**
     * @param prov_apellidos the prov_apellidos to set
     */
    public void setProv_apellidos(String prov_apellidos) {
        this.prov_apellidos = prov_apellidos;
    }

    /**
     * @return the prov_direccion
     */
    public String getProv_direccion() {
        return prov_direccion;
    }

    /**
     * @param prov_direccion the prov_direccion to set
     */
    public void setProv_direccion(String prov_direccion) {
        this.prov_direccion = prov_direccion;
    }

    /**
     * @return the prov_telefono
     */
    public String getProv_telefono() {
        return prov_telefono;
    }

    /**
     * @param prov_telefono the prov_telefono to set
     */
    public void setProv_telefono(String prov_telefono) {
        this.prov_telefono = prov_telefono;
    }

    /**
     * @return the prov_cedula
     */
    public String getProv_cedula() {
        return prov_cedula;
    }

    /**
     * @param prov_cedula the prov_cedula to set
     */
    public void setProv_cedula(String prov_cedula) {
        this.prov_cedula = prov_cedula;
    }

    /**
     * @return the prov_correo
     */
    public String getProv_correo() {
        return prov_correo;
    }

    /**
     * @param prov_correo the prov_correo to set
     */
    public void setProv_correo(String prov_correo) {
        this.prov_correo = prov_correo;
    }
}
