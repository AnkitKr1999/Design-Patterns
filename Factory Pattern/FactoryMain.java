// This pattern is used for the creation of objects
// Part of creational desing pattern
class FactoryMain{ 
    
    public static void main(String... args)
    {
        MobileOsFactory mobileOsFactory = new MobileOsFactory();
        OS mobileOs = mobileOsFactory.getOsInstance("Closed");
        mobileOs.showSpecs();
    }
}