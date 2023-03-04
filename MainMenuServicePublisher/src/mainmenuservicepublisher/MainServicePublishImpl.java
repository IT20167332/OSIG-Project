package mainmenuservicepublisher;

import java.util.Scanner;

import org.osgi.framework.ServiceReference;
import itemServicepublisher.ServicePublish;

public class MainServicePublishImpl implements MainServicePublish {
	
	@Override
	public String publishService(ServicePublish servicePublish) {
		// TODO Auto-generated method stub
		//servicePublish.ItemMenu();
		
		int userinput = 0;
		while (userinput != 5) {
			Scanner input = new Scanner(System.in);
			System.out.println("============================");
            System.out.println("         Main MENU          ");
            System.out.println("============================");
			System.out.println();
			System.out.println("1. Items Management");
            System.out.println("2. Customer Management");
            System.out.println("3. ");
            System.out.println("4. Delete item");
            System.out.println("5. Exit");
			System.out.println();
			System.out.print("Enter your choice: ");
			userinput = input.nextInt();
			switch (userinput) {
            case 1:
            	servicePublish.ItemMenu();
                break;
            case 2:
                System.out.println("Add item selected");
                
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
		
		return "Execute public service of servicePublisher im main menue";
	}
}
