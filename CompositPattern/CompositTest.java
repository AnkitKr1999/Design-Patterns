package CompositPattern;
// Composite pattern is a part of structural Design pattern
// This pattern deals with a tree-like structure of objects
// In this tree, the individual object, or even the entire hierarchy, is treated the same way. 
// this pattern arranges objects in a hierarchical fashion
// so that a client can work seamlessly with either the part of the whole.
public class CompositTest {
    public static void main(String... args)
    {
        Component hdd = new Leaf("HDD", 3000);
        Component mouse = new Leaf("Mouse", 400);
        Component monitor = new Leaf("Monitor", 5000);
        Component ram = new Leaf("Ram", 6000);
        Component cpu = new Leaf("CPU", 8000);

        Composite peripheral = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);

        cabinet.addComponent(hdd);
        cabinet.addComponent(motherBoard);

        computer.addComponent(peripheral);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}
