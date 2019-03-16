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
public class Proveedores {
    private String prov_nombres;
    private String prov_apellidos;
    private String prov_direccion;
    private String prov_telefono;
    private String prov_cedula;
    private String prov_correo;
    private String prov_notas;

    public Proveedores() {
    }

    public Proveedores( String prov_nombres, String prov_apellidos, String prov_direccion, String prov_telefono, String prov_cedula, String prov_correo,String prov_notas) {
        this.prov_nombres = prov_nombres;
        this.prov_apellidos = prov_apellidos;
        this.prov_direccion = prov_direccion;
        this.prov_telefono = prov_telefono;
        this.prov_cedula = prov_cedula;
        this.prov_correo = prov_correo;
        this.prov_notas=prov_notas;
    }

    @Override
    public String toString() {
        return "\nNombres>"+prov_nombres + "\nApellidos> "+prov_apellidos+ "\nDireccion> "+prov_direccion+ "\nTelefono> "+prov_telefono+ "\nCedula> "+prov_cedula+ "\nCorreo> "+prov_correo+"\nNotas> "+prov_notas;
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


    /**
     * @return the prov_notas
     */
    public String getProv_notas() {
        return prov_notas;
    }

    /**
     * @param prov_notas the prov_notas to set
     */
    public void setProv_notas(String prov_notas) {
        this.prov_notas = prov_notas;
    }

   
}
