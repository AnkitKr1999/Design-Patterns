package AbstractFactoryPattern;

// Abstract factory is a creational design pattern that provides a way to create families of related objects
// by encapsulating group of individual factories that have a common theme without specifying thier concrete classes

public class Demo {
    public static void main(String[] args){
        int score = 110;
        String course = "CS";
        UniversityFactory abstractUniversityFactory = UniversityFactory.getUniversity(score);
        AdmitCard admitCard = abstractUniversityFactory.getAdmitCard(course);
        int fee = abstractUniversityFactory.fee(course);
        String card = admitCard.getAdmitCard();
        System.out.println(card + " "+  fee);
    }
}
