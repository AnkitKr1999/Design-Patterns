package PrototypePattern;

// The Prototype Design Pattern is a creational pattern that enables the creation of new objects by copying an existing object.
// Prototype allows us to hide the complexity of making new instances from the client. 
// The concept is to copy an existing object rather than create a new instance from scratch, something that may include costly operations
public class ProtoType {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        BookShop shop1 = new BookShop();
        shop1.setShopName("Pearson");
        shop1.loadBooks();

        BookShop shop2 = shop1.clone();
        shop2.setShopName("Arihant");
        shop1.getBooks().remove(0);
        System.out.println(shop1);
        System.out.println(shop2);
    }
}
