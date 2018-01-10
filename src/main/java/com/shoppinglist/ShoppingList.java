package com.shoppinglist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private ArrayList<String> shoppinglist = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public ArrayList<String> getShoppinglist() {
        return shoppinglist;
    }

    public void addProduct(){
        System.out.println("Podaj nazwe produktu");
        shoppinglist.add(scanner.nextLine());
    }

    public void removeProduct (){
        System.out.println("Podaj nazwe produktu ktora chcesz usunac z listy zakupow");
        String product = scanner.nextLine();
        shoppinglist.remove(product);
    }

    public void printList(){
        if(shoppinglist.size()==0){
            System.out.println("Lista jest pusta");
        }
        else{
            System.out.println("Produkty znajdujace sie na liscie");
            for (int i = 0; i< shoppinglist.size(); i++){
                System.out.println(i+1 + "  " + shoppinglist.get(i));
            }

        }
    }

}
