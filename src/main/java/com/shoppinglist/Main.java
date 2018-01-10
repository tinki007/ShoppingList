package com.shoppinglist;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		ShoppingList shoppingList = new ShoppingList();
		File file = new File();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;

		while (!quit) {
			Menu menu = new Menu();
			Pdf pdf = new Pdf();
			menu.printMenu();
			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					shoppingList.printList();
					menu.space();
					break;
				case 2:
					shoppingList.addProduct();
					menu.space();
					break;
				case 3:
					shoppingList.removeProduct();
					menu.space();
					break;
				case 4:
					pdf.createPdf(shoppingList.getShoppinglist());
					break;
				case 5:
					file.createFile(shoppingList.getShoppinglist());
					break;
				case 6:
					quit = true;
					break;
				default:
					System.out.println("Wybrales zly numer, ponow probe");
					menu.space();
					break;
			}
		}
	}
}
