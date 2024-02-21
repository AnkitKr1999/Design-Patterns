package AbstractFactoryPattern;

public class IIITAdmitCard implements AdmitCard{

    public static int fee = 7000;
    @Override
    public String getAdmitCard() {
        return "IIIT Card Acquired!";
    }
    
}
