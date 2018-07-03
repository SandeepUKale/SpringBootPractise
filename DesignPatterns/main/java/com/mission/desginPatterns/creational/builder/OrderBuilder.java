package com.mission.desginPatterns.creational.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {
	public OrderedItems preparePizza() {
		OrderedItems orderedItems = new OrderedItems();
		int choice = 0;

		System.out.println("Please select an item");

		do {
			System.out.println("_____________________________________________________________________________");
			System.out.println("Pizza		");
			System.out.println("_____________________________________________________________________________");
			System.out.println("Veg								||			Non-Veg");
			System.out.println("________________________________||___________________________________________");
			System.out.println("Masala 	****					||			Chicken Mexican ****");
			System.out.println("                                ||                                ");
			System.out.println("3. Large Masala Veg Pizza		||	15. Large Chicken Mexi Non-Veg Pizza");
			System.out.println("4. Extra Large Masala Veg Pizza ||	16. Xtra Large Chicken Mexi Non-Veg Pizza");
			System.out.println("                                ||                              ");
			System.out.println("Onion 	****					||			Chicken Jolly 	****");
			System.out.println("                                ||                                     ");
			System.out.println("7. Large Onion Veg Pizza		||	19. Large Chicken Mexican Non-Veg Pizza");
			System.out.println("8. Extra Large Onion Veg Pizza	||	20. Xtra Large Chicken Mexi Non-Veg Pizza");
			System.out.println("_____________________________________________________________________________");
			System.out.println("ColdDrink		");
			System.out.println("_____________________________________________________________________________");
			System.out.println("Pepsi							||			Coke");
			System.out.println("________________________________||___________________________________________");
			System.out.println("Soft 	****					||			Chicken Mexican ****");
			System.out.println("                                ||                                ");
			System.out.println("25. Small Pepsi			     	||	34. Small Coke");
			System.out.println("26. Medium Pepsi     			||	35. Medium Coke");
			System.out.println("27. Large Pepsi					||	36. Large Coke");
			System.out.println("________________________________||___________________________________________");
			System.out.println("0. Quit");

			System.out.println("Please enter your choice");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				choice = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch (choice) {
			case 0:
				return orderedItems;
			case 2:
				orderedItems.addItem(new LargeOnionVegPizza());
				break;
			case 3:
				orderedItems.addItem(new XLOnionVegPizza());
				break;
			case 4:
				orderedItems.addItem(new LargeMasalaPizza());
				break;
			case 5:
				orderedItems.addItem(new XLMasalaPizza());
				break;
			case 6:
				orderedItems.addItem(new LargeChickenNonVegPizza());
				break;
			case 7:
				orderedItems.addItem(new XLChickenNonVegPizza());
				break;
			case 8:
				orderedItems.addItem(new LargeEggNonVegPizza());
				break;
			case 9:
				orderedItems.addItem(new XLEggNonVegPizza());
				break;
			case 10:
				orderedItems.addItem(new SmallCoke());
				break;
			case 11:
				orderedItems.addItem(new MediumCoke());
				break;
			case 12:
				orderedItems.addItem(new LargeCoke());
				break;
			case 13:
				orderedItems.addItem(new SmallPepsi());
				break;
			case 14:
				orderedItems.addItem(new MediumPepsi());
				break;
			case 15:
				orderedItems.addItem(new LargePepsi());
				break;

			}
		} while (true);

	}
}
