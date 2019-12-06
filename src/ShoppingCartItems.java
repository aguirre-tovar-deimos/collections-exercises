import java.text.NumberFormat;

public class ShoppingCartItems {
    //set the total cost of shopping cart
    private String item;
    private double price;
    private double quantity;
    private String category;

    //constructor
    public ShoppingCartItems(String itemName, double priceItem, double quantityItem, String category){
        this.item = itemName;
        this.price = priceItem;
        this.quantity = quantityItem;
        this.category = category;
    }
    public String getItem (){
        return item;
    }
    public double getPrice(){
        return price;
    }
    public double getQuantity (){
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    //return a string with the info of item
    public String toString (){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

            //.format returns a formatted string (\t is tab)
        return (category+ "\t" + item + "\t" + fmt.format(price) + "\t" + quantity + "\t" + fmt.format(price * quantity));
    }
}
