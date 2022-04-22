package stdios.Restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String category;
    private String description;
    private boolean isNew;

    public MenuItem(String name, String category, String description,double price,boolean isNew){
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.isNew = isNew;
    }

    public String toString(){
        return "Name: "+name+"\n"+
                "Category: "+category+"\n"+
                "Description: "+description+"\n"+
                "Price: "+price+"\n"+
                "Is it new: "+isNew;
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof MenuItem)){
            return false;
        }
        MenuItem menu_compared = (MenuItem) compared;
        return name.equals(menu_compared.name) &&
                price == menu_compared.price &&
                category.equals(menu_compared.category) &&
                description.equals(menu_compared.description);
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
