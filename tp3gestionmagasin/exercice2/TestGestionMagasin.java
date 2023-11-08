public class TestGestionMagasin {
    public static void main(String[] args) {
        Magasin magasin1 = new Magasin(1, "mg1", 50);
        Magasin magasin2 = new Magasin(2, "mg2", 20);

        Produit produit1 = new Produit("P1", 12.0);
        Produit produit2 = new Produit("P2", 15.0);

        magasin1.ajouterProduit(produit1);
        magasin1.ajouterProduit(produit2);

        magasin1.afficherCaracteristiques();
        magasin2.afficherCaracteristiques();
    }
}
