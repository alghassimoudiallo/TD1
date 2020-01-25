package sn.senstock.dao;

import sn.senstock.entities.Produit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProduitImpl implements IProduit {
    private EntityManager em;
    public ProduitImpl(){
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("StockPU");
        em = emf.createEntityManager();
    }
    @Override
    public int add(Produit produit) {
        try {
            em.getTransaction().begin();
            em.persist(produit);
            em.getTransaction().commit();
            return 1;
        }catch (Exception ex){
            ex.printStackTrace();
            return 0;

        }

    }

    @Override
    public List<Produit> lis() {
        return em.createQuery("SELECT p FROM Produit p").getResultList();
    }
}
