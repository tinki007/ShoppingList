package com.shoppinglist;

import java.util.ArrayList;
import java.util.Scanner;

//brak this!!! wszędzie gdzie można, to pisz to słówko!!!
public class ShoppingList {
    private ArrayList<String> shoppinglist = new ArrayList();
    private Scanner scanner = new Scanner(System.in);

    public ArrayList<String> getShoppinglist() {
        return shoppinglist;
    }

    public void addProduct(){
        System.out.println("Podaj nazwe produktu");
        this.shoppinglist.add(this.scanner.nextLine());
    }

    public void removeProduct (){
        System.out.println("Podaj nazwe produktu ktora chcesz usunac z listy zakupow");
        String product = this.scanner.nextLine();
        this.shoppinglist.remove(product);
    }

    //formatowanie!
    public void printList(){
        if(this.shoppinglist.size()==0){
            System.out.println("Lista jest pusta");
        } else{
            System.out.println("Produkty znajdujace sie na liscie");
            for (int i = 0; i< this.shoppinglist.size(); i++){
                System.out.println(i+1 + "  " + this.shoppinglist.get(i));
            }
        }
    }

}
