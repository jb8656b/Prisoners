import java.util.*;
public class Prisoners {
    public static void main(String[] args){
        System.out.println("Test");
        List<Box> boxes = new ArrayList<Box>();
        System.out.println(boxes);
        Box testBox = new Box(3);
        System.out.println(testBox.getHiddenNumber());
        // boxes.add(new Box)
    }
    public static class Prisoner{
        int prisonerNumber;
    }
    public static class Box{
        private int hiddenNumber;
        public Box(int hiddenNumberHolder){
            hiddenNumber = hiddenNumberHolder;
        }
        public int getHiddenNumber(){
            return this.hiddenNumber;
        }
    }
}
