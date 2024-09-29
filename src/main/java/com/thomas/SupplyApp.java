package com.thomas;

import com.thomas.service.SupplyService;

/**
 * Hello world!
 */
public class SupplyApp {

    public static void main(String[] args) {
        SupplyService service = new SupplyService();

        // Ajout de trois nouvelles fournitures
        service.addNewSupply("Ordinateur portable", "électronique", 50);
        service.addNewSupply("Stylo", "bureau", 100);
        service.addNewSupply("Clavier", "électronique", 25);

        // Affichage des fournitures ajoutées
        System.out.println("Les fournitures ont été ajoutées avec succès !");

        // Lecture des fournitures ajoutées
        service.displaySupply("Ordinateur portable");
        service.displaySupply("Stylo");
        service.displaySupply("Clavier");

        // Mise à jour des quantités
        service.updateSupplyQuantity("Ordinateur portable", 40); // Met à jour la quantité à 40
        service.updateSupplyQuantity("Stylo", 150); // Met à jour la quantité à 150
        service.updateSupplyQuantity("Clavier", 20); // Met à jour la quantité à 20

        // Affichage après mise à jour
        service.displaySupply("Ordinateur portable");
        service.displaySupply("Stylo");
        service.displaySupply("Clavier");

        // Suppression de la fourniture "Clavier"
        service.deleteSupply("Clavier");

        // Vérification après suppression
        service.displaySupply("Clavier"); // Ceci devrait afficher que la fourniture est introuvable
    }
}

