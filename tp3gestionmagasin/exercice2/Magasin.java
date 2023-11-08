import java.util.ArrayList;
import java.util.List;
class Magasin {
    private int identifiant;
    private String adresse;
    private int capaciteMax;
    private List<Produit> produits;

    public Magasin(int identifiant, String adresse, int capaciteMax) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capaciteMax = capaciteMax;
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        if (produits.size() < capaciteMax) {
            produits.add(produit);
        } else {
            System.out.println("Le mag est saturé, impossible d'ajouter plus de produits.");
        }
    }

    public void afficherCaracteristiques() {
        System.out.println("Magasin " + identifiant + "-Adresse: " + adresse);
        System.out.println("Produits:");
        for (Produit produit : produits) {
            System.out.println(produit.getNom() + "-Prix: " + produit.getPrix());
        }
    }
}

