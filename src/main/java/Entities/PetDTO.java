/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
/**
 *
 * @author Morten
 */
public class PetDTO {
    private int id;
    private String name;
    private String birth;
    private String death;    
    private String ownerFName;
    private String ownerLName;

    public PetDTO(Pet p) {
        this.id = p.getId();
        this.name = p.getName();
        this.birth = p.getBirth().toString();
        if(p.getDeath()!=null){
        this.death = p.getDeath().toString();}
        else this.death=null;
        Owner o = p.getOwnerId();
        this.ownerFName = o.getFirstName();
        this.ownerLName = o.getLastName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public String getOwnerFName() {
        return ownerFName;
    }

    public void setOwnerFName(String ownerFName) {
        this.ownerFName = ownerFName;
    }

    public String getOwnerLName() {
        return ownerLName;
    }

    public void setOwnerLName(String ownerLName) {
        this.ownerLName = ownerLName;
    }

    @Override
    public String toString() {
        return "PetDTO{" + "name=" + name + ", birth=" + birth + ", death=" + death + ", ownerFName=" + ownerFName + ", ownerLName=" + ownerLName + '}';
    }

    
    
}

