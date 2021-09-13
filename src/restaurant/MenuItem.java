package restaurant;

public class MenuItem {
    // Class variables
    private String itemName;
    private Double itemPrice;
    private String description;
    private String category;
    private Boolean isNew;

    /* Constructors */

    public MenuItem(String itemName, String description, Double itemPrice) {
        this.itemName = itemName;
        this.description = description;
        this.itemPrice = itemPrice;

        this.category = "Not Categorized";
        this.isNew = false;
    }

    public MenuItem(String itemName, String description, Double itemPrice, String category, Boolean isNew) {
        this.itemName = itemName;
        this.description = description;
        this.itemPrice = itemPrice;

        this.category = category;
        this.isNew = isNew;

    }

    // Methods
    // Getters and Setters

    public String getItemName() { return this.itemName;}
    public void setItemName(String itemName) { this.itemName = itemName;}

    public String getDescription() { return this.description;}
    public void setDescription(String description) { this.description = description;}

    public Double getItemPrice() { return this.itemPrice;}
    public void setItemPrice(Double itemPrice) { this.itemName = itemName;}

    public String getCategory() { return  this.category;}
    public void setCategory(String category) { this.category = category;}

    public Boolean getIsNew() { return this.isNew;}
    public void setIsNew(Boolean isNew) { this.isNew = isNew;}









}

