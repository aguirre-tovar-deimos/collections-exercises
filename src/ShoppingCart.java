import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        String itemName;
        double itemPrice;
        double itemQuantity;
        String[] categories = {"Fruits", "Veggies", "Meat", "Dairy"};

        ArrayList<ShoppingCartItems> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        String keepShopping = "yes";
        //set the total of the shopping cart to 0
        double totalAmount = 0;

        System.out.println("Welcome to Fridgefetch!");
        System.out.println("Would you like to create a grocery list? (YES/NO");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            do {

                //prompt user for category
                System.out.println("Please select a category by keying the number listed");
                for (int i = 0; i <= categories.length - 1; i++)
                {
                    System.out.println(i + ": " + categories[i]);
                }

                int categorySelection = scanner.nextInt();
                String category = "";

                switch (categorySelection){
                    case 0:
                        category = categories[0];
                        break;
                    case 1:
                        category = categories[1];
                        break;
                    case 2:
                        category = categories[2];
                        break;
                    case 3:
                        category = categories[3];
                        break;
                    default:
                        System.out.println("You entered an invalid option. Please try again.");
                        break;
                }


                System.out.println("Enter the name of the item you want to add to your list: ");
                //set the input to the item name
                itemName = scanner.next();

                System.out.println("Enter the price for " + itemName + " : ");
                //set the input to the item price
                itemPrice = scanner.nextDouble();

                System.out.println("Enter the quantity of " + itemName + " that you want: ");
                //set the input to the quantity of items
                itemQuantity = scanner.nextDouble();

                //find out the totalAmount in the cart
                totalAmount += (itemPrice * itemQuantity);

                //===create a new item that will get added to the cart====//
                ShoppingCartItems newItem = new ShoppingCartItems(itemName, itemPrice, itemQuantity, category);

                //cart is called from the ArrayList
                cart.add(newItem);



                //ask user if they want to keep shopping
                System.out.println("Do you want to add another item? (YES/NO)");
                keepShopping = scanner.next();

            }
            while (keepShopping.equalsIgnoreCase("YES") || keepShopping.equalsIgnoreCase("Y"));

            //Sort the array by category, then item name, then qty
            Collections.sort(cart, new Comparator<ShoppingCartItems>() {
                        @Override
                        public int compare(ShoppingCartItems p1, ShoppingCartItems p2) {
                            int value1 = p1.getCategory().compareTo(p2.getCategory()); // Ascending

                            if (value1 == 0) {
                                int value2 = p1.getItem().compareTo(p2.getItem());
                                if (value2 == 0) {
                                    return (int)p1.getQuantity() - (int)p2.getQuantity();
                                } else {
                                    return value2;
                                }
                            }
                            return value1;


                        }
                    });




            //show the items in the shoppingCart
            System.out.println("You finished shopping!");
            System.out.println("This is what you have in your shopping cart:");
            System.out.println("Category|  Item  |  Price |  Qty |  Total");
            System.out.println("--------------------------------");
            //.size is the size of the list
            for (int i = 0; i < cart.size(); i++) {
                //what you have in your cart (.get gets the element present in the list at that given index)
                System.out.println(cart.get(i));
            }
            System.out.println("-------------------");
            System.out.println("Total: " + "$" + totalAmount);


        } else {
            System.out.println("Good bye");
        }

    }

}
