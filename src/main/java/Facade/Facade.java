/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entities.Pet;
import Entities.PetDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Morten
 */
public class Facade {

    private EntityManagerFactory emf;

    public Facade() {
        emf = Persistence.createEntityManagerFactory("petpu", null);
    }

    public List<PetDTO> getAllPets() {
        EntityManager em = emf.createEntityManager();
        List<PetDTO> petsDTO = new ArrayList();
        List<Pet> pets = new ArrayList();
        try {
            em.getTransaction().begin();
            pets = em.createNamedQuery("Pet.findAll").getResultList();
            em.getTransaction().commit();
            for (int i = 0; i < pets.size(); i++) {
                Pet p = pets.get(i);
                System.out.println(pets.get(i));
                PetDTO pd = new PetDTO(p);
                petsDTO.add(pd);
            }
            return petsDTO;
        } finally {
            em.close();
        }
    }

    public int petCount() {
        return getAllPets().size();
    }
}
