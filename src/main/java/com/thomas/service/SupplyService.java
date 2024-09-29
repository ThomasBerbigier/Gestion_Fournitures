package com.thomas.service;

import com.thomas.DAO.SupplyDao;
import com.thomas.model.Supply;

/**
 * Service pour gérer la logique métier autour des fournitures.
 * Ce service utilise le DAO pour interagir avec la base de données.
 */
public class SupplyService {

    // DAO pour accéder aux données des fournitures dans MongoDB
    private SupplyDao supplyDao = new SupplyDao();

    /**
     * Ajoute une nouvelle fourniture en vérifiant si elle est en stock.
     *
     * @param name Le nom de la fourniture.
     * @param category La catégorie de la fourniture.
     * @param quantity La quantité initiale de la fourniture.
     */
    public void addNewSupply(String name, String category, int quantity) {
        boolean inStock = quantity > 0;
        Supply supply = new Supply(name, category, quantity, inStock);
        supplyDao.addSupply(supply);
        System.out.println("Nouvelle fourniture ajoutée !");
    }

    /**
     * Met à jour la quantité d'une fourniture existante.
     *
     * @param name Le nom de la fourniture à mettre à jour.
     * @param newQuantity La nouvelle quantité de la fourniture.
     */
    public void updateSupplyQuantity(String name, int newQuantity) {
        supplyDao.updateSupplyQuantity(name, newQuantity);
        System.out.println("Quantité mise à jour !");
    }

    /**
     * Supprime une fourniture par son nom.
     *
     * @param name Le nom de la fourniture à supprimer.
     */
    public void deleteSupply(String name) {
        supplyDao.deleteSupply(name);
        System.out.println("Fourniture supprimée !");
    }

    /**
     * Affiche les détails d'une fourniture par son nom.
     *
     * @param name Le nom de la fourniture à afficher.
     */
    public void displaySupply(String name) {
        Supply supply = supplyDao.getSupplyByName(name);
        if (supply != null) {
            System.out.println("Fourniture : " + supply.getName() + ", Quantité : " + supply.getQuantity());
        } else {
            System.out.println("Fourniture introuvable.");
        }
    }
}

