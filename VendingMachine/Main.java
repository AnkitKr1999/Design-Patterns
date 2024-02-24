package VendingMachine;

public class Main {
    public static void main(String[] args){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addItems(10);
        vendingMachine.collectCash(10);
        vendingMachine.dispenseChange("2");
    }
}
