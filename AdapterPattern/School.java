package AdapterPattern;
// Adapter Design pattern is a part of stuctural design pattern.
// This is useful in cases where we want to take an existing class whose source code cannot be
// modified and make it work with another class.
public class School {
    public static void main(String... args){
        Pen pen = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(pen);
        aw.writeAssignment("Assignments are boring");
    }
}
