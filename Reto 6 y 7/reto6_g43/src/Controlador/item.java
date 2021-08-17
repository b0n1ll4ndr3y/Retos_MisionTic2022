/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author teis_
 */
public class item {
    private int id_Owner;
    private String owner;
    
    public item(int id_Owner, String owner) {
        this.id_Owner = id_Owner;
        this.owner = owner;
    }
    public int getId_Owner() {
        return id_Owner;
    }

    public void setId_Owner(int id_Owner) {
        this.id_Owner = id_Owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    @Override
    public String toString(){
        return getOwner();
    }
    
}
