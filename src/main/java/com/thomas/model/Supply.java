package com.thomas.model;

/**
 * Modèle de données représentant une fourniture.
 * Chaque instance de cette classe correspond à un document dans la collection "supplies" de MongoDB.
 */
public class Supply {

    private String id;
    private String name;
    private String category;
    private int quantity;
    private boolean inStock;

    // Constructeur avec les champs requis pour une nouvelle fourniture
    public Supply(String name, String category, int quantity, boolean inStock) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.inStock = inStock;
    }

    // Getters et Setters pour accéder et modifier les propriétés de la fourniture
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public boolean isInStock() { return inStock; }
    public void setInStock(boolean inStock) { this.inStock = inStock; }
}

