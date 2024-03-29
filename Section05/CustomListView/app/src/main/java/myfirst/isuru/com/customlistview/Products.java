package myfirst.isuru.com.customlistview;

public class Products {
    private String title;
    private String description;
    private String type;
    private double price;
    private boolean sale;

    public Products(String title, String description, String type, double price, boolean sale) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.price = price;
        this.sale = sale;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean getSale() {
        return sale;
    }
}
