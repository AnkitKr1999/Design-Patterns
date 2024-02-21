package AbstractFactoryPattern;

public class PrivateUniversity extends UniversityFactory{

    @Override
    public AdmitCard getAdmitCard(String course) {
        switch(course){
            case "Math":
            return new MITAdmitCard();
            case "CS":
            return new IIITAdmitCard();
            default:
            break;
        }
        return null;
    }

    @Override
    public int fee(String course) {
        switch(course){
            case "Math":
            return MITAdmitCard.fee;
            case "CS":
            return IIITAdmitCard.fee;
            default:
            break;
        }
        return -1;
    }
    
}
