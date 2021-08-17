/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_pkg;

/**
 *
 * @author teis_
 */
public class data_BD {
    private int idOwner;
    private String owner;
    
    private int idHospital;
    private String hospital;

    
    
    public data_BD() {
        this.idOwner = 0;
        this.owner = "";
        
        this.idHospital = 0;
        this.hospital = "";
    }

    /**
     * @return the idOwner
     */
    public int getIdOwner() {
        return idOwner;
    }

    /**
     * @param idOwner the idOwner to set
     */
    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the idHospital
     */
    public int getIdHospital() {
        return idHospital;
    }

    /**
     * @param idHospital the idHospital to set
     */
    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

     
}

