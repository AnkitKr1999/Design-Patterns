package AbstractFactoryPattern;

public abstract class UniversityFactory {
    private final static int cutOff = 109;
    public static UniversityFactory getUniversity(int score){
        if(score<cutOff)
        return new PublicUniversity();
        else 
        return new PrivateUniversity();
    }
    public abstract AdmitCard getAdmitCard(String course);
    public abstract int fee(String course);
}
