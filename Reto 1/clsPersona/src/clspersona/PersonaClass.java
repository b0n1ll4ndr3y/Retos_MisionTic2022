/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clspersona;

/**
 *
 * @author teis_
 */
public class PersonaClass {
    private String nombre;
    private String tipo_doc;
    private int nro_doc;
    private int edad;
    private String fecha_nac;
    private String genero;
    private String direccion;
    private int telefono;

    public PersonaClass(String nombre, String tipo_doc, int nro_doc, int edad, String fecha_nac, String genero, String direccion, int telefono) {
        this.nombre = nombre;
        this.tipo_doc = tipo_doc;
        this.nro_doc = nro_doc;
        this.edad = edad;
        this.fecha_nac = fecha_nac;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    

    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo_doc
     */
    public String getTipo_doc() {
        return tipo_doc;
    }

    /**
     * @param tipo_doc the tipo_doc to set
     */
    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    /**
     * @return the nro_doc
     */
    public int getNro_doc() {
        return nro_doc;
    }

    /**
     * @param nro_doc the nro_doc to set
     */
    public void setNro_doc(int nro_doc) {
        this.nro_doc = nro_doc;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the fecha_nac
     */
    public String getFecha_nac() {
        return fecha_nac;
    }

    /**
     * @param fecha_nac the fecha_nac to set
     */
    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String consl_info_person(){
        return "\nConsulta, información de la persona(Metodo 1):\n      >> Nombre: " + getNombre() + "\n      >> Tipo de doc.: " + getTipo_doc() + "\n      >> Documento: " + getNro_doc() + "\n      >> Edad: " + getEdad() + "\n      >> Fecha de nacimiento: " 
                + getFecha_nac() + "\n      >> Genero: " + getGenero() + "\n      >> Dirección: " + getDireccion() + "\n      >> telefono: " + getTelefono();
    }
    
    public void consultar_informacion_persona(){
        System.out.println("\nConsulta, información de la persona(Metodo 2):\n      >> Nombre: " + getNombre() + "\n      >> Tipo de doc.: " + getTipo_doc() + "\n      >> Documento: " + getNro_doc() + "\n      >> Edad: " + getEdad() + "\n      >> Fecha de nacimiento: " 
                + getFecha_nac() + "\n      >> Genero: " + getGenero() + "\n      >> Dirección: " + getDireccion() + "\n      >> telefono: " + getTelefono());
    }
    
}
