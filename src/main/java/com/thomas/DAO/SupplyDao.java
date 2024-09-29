package com.thomas.DAO;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.thomas.model.Supply;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

/**
 * Data Access Object (DAO) pour la gestion des opérations CRUD sur les fournitures.
 * Ce composant encapsule la logique d'accès à la base de données MongoDB.
 */
public class SupplyDao {

    // Collection MongoDB où sont stockées les fournitures
    private final MongoCollection<Document> collection;

    // Initialisation de la connexion à MongoDB et récupération de la collection "supplies"
    public SupplyDao() {
        var mongoClient = MongoClients.create("mongodb://utilisateur:motdepasse@localhost:8090");
        MongoDatabase database = mongoClient.getDatabase("fournituresDB");
        collection = database.getCollection("supplies");
    }

    /**
     * Ajoute une nouvelle fourniture dans la collection MongoDB.
     *
     * @param supply L'objet fourniture à insérer.
     */
    public void addSupply(Supply supply) {
        Document document = new Document("name", supply.getName())
                .append("category", supply.getCategory())
                .append("quantity", supply.getQuantity())
                .append("inStock", supply.isInStock());
        collection.insertOne(document);
    }

    /**
     * Récupère une fourniture à partir de son nom.
     *
     * @param name Le nom de la fourniture à rechercher.
     * @return L'objet Supply correspondant ou null si non trouvé.
     */
    public Supply getSupplyByName(String name) {
        Document doc = collection.find(eq("name", name)).first();
        if (doc != null) {
            return new Supply(
                    doc.getString("name"),
                    doc.getString("category"),
                    doc.getInteger("quantity"),
                    doc.getBoolean("inStock")
            );
        }
        return null;
    }

    /**
     * Met à jour la quantité d'une fourniture dans la base de données.
     *
     * @param name Le nom de la fourniture à mettre à jour.
     * @param newQuantity La nouvelle quantité de la fourniture.
     */
    public void updateSupplyQuantity(String name, int newQuantity) {
        collection.updateOne(eq("name", name), new Document("$set", new Document("quantity", newQuantity)));
    }

    /**
     * Supprime une fourniture à partir de son nom.
     *
     * @param name Le nom de la fourniture à supprimer.
     */
    public void deleteSupply(String name) {
        collection.deleteOne(eq("name", name));
    }
}

