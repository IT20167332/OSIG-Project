package itemServicepublisher;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish {
	
	private static ArrayList<Item> items = new ArrayList<>();
	
	public ServicePublishImpl() {
		for (int i = 0; i < items.size(); i++) {
            String itemId = "item_" + (i + 1);
            String category = "category_" + (i + 1);
            String itemName = "item_name_" + (i + 1);
            double itemPrice = (i + 1) * 10.0;
            int itemQuantity = i + 1;

            Item item = new Item(itemId, category, itemName, itemPrice, itemQuantity);
            items.add(item);
        }
	}

	@Override
	public String publishService() {
		// TODO Auto-generated method stub
		return "Execute public service of servicePublisher";
	}
	
	@Override
	public String getInPut() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
        return name;
	}
	
	@Override
	public void addItem() {
		Scanner input = new Scanner(System.in);
		boolean addingItems = true;
        while (addingItems) {
            Item newItem = Item.addItemFromConsole();
            items.add(newItem);

            System.out.print("Do you want to add another item? (y/n): ");
            String answer = input.nextLine();
            addingItems = answer.equalsIgnoreCase("y");
        }
	}
	
	public void DisplayItems() {
		if(items.size()>0) {
			System.out.format("%-10s%-15s%-25s%-10s%-10s%n", "Item ID", "Category", "Item Name", "Price", "Quantity");
	        for (Item item : items) {
	            System.out.format("%-10s%-15s%-25s%-10.2f%-10d%n",
	                    item.getItemId(), item.getCategory(), item.getItemName(),
	                    item.getItemPrice(), item.getItemQuantity());
	        }
		}else {
			System.out.println("No item found!");
			System.out.println();
		}
		
	}
	
	@Override
	public void ItemMenu() {
		
		int userinput = 0;
		while (userinput != 5) {
			Scanner input = new Scanner(System.in);
			System.out.println("============================");
            System.out.println("         ITEM MENU          ");
            System.out.println("============================");
			System.out.println();
			System.out.println("1. View items");
            System.out.println("2. Add item");
            System.out.println("3. Update item");
            System.out.println("4. Delete item");
            System.out.println("5. Exit");
			System.out.println("99 : Exit");
			System.out.println();
			System.out.print("Enter your choice: ");
			userinput = input.nextInt();
			switch (userinput) {
            case 1:
                System.out.println("Items");
                System.out.println();
                this.DisplayItems();
                break;
            case 2:
                System.out.println("Add item selected");
                System.out.println();
                this.addItem();
                break;
            case 3:
                System.out.println("Update item selected");
                break;
            case 4:
                System.out.println("Delete item selected");
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
			}
			
		}
	}
	
	
	
	
	
	

}
