package itemServicepublisher;

import java.util.Scanner;

public class Item {
	private String itemId;
    private String category;
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public Item(String itemId, String category, String itemName, double itemPrice, int itemQuantity) {
        this.itemId = itemId;
        this.category = category;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getItemId() {
        return itemId;
    }

    public String getCategory() {
        return category;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }
    
    public static Item addItemFromConsole() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter item ID: ");
        String itemId = input.nextLine();

        System.out.print("Enter category: ");
        String category = input.nextLine();

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter item price: ");
        double itemPrice = input.nextDouble();

        System.out.print("Enter item quantity: ");
        int itemQuantity = input.nextInt();

        Item newItem = new Item(itemId, category, itemName, itemPrice, itemQuantity);

        return newItem;
    }
}
