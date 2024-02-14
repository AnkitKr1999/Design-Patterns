class FactoryMain{
    
    public static void main(String... args)
    {
        MobileOsFactory mobileOsFactory = new MobileOsFactory();
        OS mobileOs = mobileOsFactory.getOsInstance("Closed");
        mobileOs.showSpecs();
    }
}