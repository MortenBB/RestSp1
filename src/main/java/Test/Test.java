/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Entities.Pet;
import Entities.PetDTO;
import Facade.Facade;
import java.util.List;

/**
 *
 * @author Morten
 */
public class Test {
    public static void main(String[] args) {
        Facade f = new Facade();
       // System.out.println(f.getAllPets());
        List<PetDTO> l = f.getAllPets();
        //PetDTO pd = new PetDTO(l.get(0));
    }
}
