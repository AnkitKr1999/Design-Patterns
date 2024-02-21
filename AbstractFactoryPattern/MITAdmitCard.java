package AbstractFactoryPattern;

public class MITAdmitCard implements AdmitCard{

    public static int fee = 4000;
    @Override
    public String getAdmitCard() {
        return "MIT Admit Card Acquired!";
    }
    
}
