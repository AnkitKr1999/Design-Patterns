package AbstractFactoryPattern;

public class PublicUniversity extends UniversityFactory{

    @Override
    public AdmitCard getAdmitCard(String course) {
        // todo: same as private university
        return null;
    }

    @Override
    public int fee(String fee) {
       // todo: same as private university
       return -1;
    }
    
}
