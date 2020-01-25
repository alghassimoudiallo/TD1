package sn.senstock.test;

import sn.senstock.dao.IProduit;
import sn.senstock.dao.ProduitImpl;
import sn.senstock.entities.Produit;

public class unitTest {
    public void beforTest(){
        System.out.println("===============befor============");
    }
    public void afterTest(){
        System.out.println("==============After=============");
    }
    public void testaddProduit(){
        IProduit produitdao = new ProduitImpl();
        Produit produit = new Produit();
        produit.setNom("Table");
        produit.setQtStock(new Double(2));
        produitdao.add(produit);
    }
}
