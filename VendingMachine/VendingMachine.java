package VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private int collectedCash;
    private State state;
    // private Map<String, Set<String>> productCodeItemMap;
    private Map<String, Integer> productCodePriceMap;

    VendingMachine(){
        productCodePriceMap = new HashMap<>();
        this.state = new Ready(this);
    }
    public void addCollectedCash(int collectedCash) {
        this.collectedCash += collectedCash;
    }

    public VendingMachine setCollectedCash(int collectedCash) {
        this.collectedCash = collectedCash;
        return this;
    }

    public State getState() {
        return state;
    }

    public VendingMachine setState(State state) {
        this.state = state;
        return this;
    }

    public void removeProduct(String productCode) {

    }

    public void collectCash(int cash){
        this.state.collectCash(cash);
    }
    
    public void dispenseChange(String productCode) {
        this.state.dispenseChange(productCode);
    }

    public void cancelTransaction() {
        this.state.cancelTransaction();
    }

    public int calculateChange(String productCode) {
        return collectedCash - productCodePriceMap.get(productCode);
    }

    public void dispenseItem(String productCode) {
        this.state.dispenseItem(productCode);
    }

    public int getCollectedCash() {
        return collectedCash;
    }

    public void addItems(int val) {
        for(int i=1;i<=val;i++)
        productCodePriceMap.put(String.valueOf(i), i);
    }
}