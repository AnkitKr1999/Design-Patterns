package BuilderPattern;
// Builder pattern is part of creational design pattern
// Used when we want to have the flexibility on the parameters we want to pass in an object creation
public class Shop {
    public static void main(String... args)
    {
        Phone phone = new PhoneBuilder().setOs("IOS").setRam(8)
        .setBattery(4500).getPhone();
        System.out.println(phone);
    }
}
