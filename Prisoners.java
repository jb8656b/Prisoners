import java.util.*;
public class Prisoners {
    public static void main(String[] args){
        System.out.println("Test");
        List<Box> boxes = new ArrayList<Box>();
        System.out.println(boxes);
    }
    public static class Prisoner{
        int prisonerNumber;
    }
    public static class Box{
        private int hiddenNumber;
    }
}
