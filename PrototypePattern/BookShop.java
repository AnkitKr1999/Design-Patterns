package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;
    private List<Book> books = new ArrayList<>();
    @Override
    public String toString() {
        return "BookShop [shopName=" + shopName + ", books=" + books + "]";
    }
    
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    // this is making connection from DB and is time consuming
    public void loadBooks()
    {
        for(int i=1;i<=10;i++)
        this.books.add(new Book(i, "Book"+i));
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for(Book b:this.books)
        shop.getBooks().add(b);
        return shop;
    }
    
}
