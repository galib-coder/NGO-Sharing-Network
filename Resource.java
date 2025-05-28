package model;

public class Resource {
    private int id;
    private String ngoName;
    private String resourceType;
    private int quantity;
    private String description;

    // Constructors, Getters, Setters
    public Resource(String ngoName, String resourceType, int quantity, String description) {
        this.ngoName = ngoName;
        this.resourceType = resourceType;
        this.quantity = quantity;
        this.description = description;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNgoName() { return ngoName; }
    public String getResourceType() { return resourceType; }
    public int getQuantity() { return quantity; }
    public String getDescription() { return description; }
}
