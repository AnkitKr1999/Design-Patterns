package PrototypePattern;

public class Book {
    int bid;
    String name;
    public Book(int bid, String name) {
        this.bid = bid;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Book [bid=" + bid + ", name=" + name + "]";
    }
    
}
