public class MobileOsFactory {
    public OS getOsInstance(String type){
        if(type.equals("Open"))
        return new Android();
        else if(type.equals("Closed"))
        return new IOS();
        else return new Windows();
    }
}
