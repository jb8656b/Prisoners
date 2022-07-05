import java.util.*;
public class Prisoners {
    public static void main(String[] args){
        System.out.println(prisonExperiment(100));
    }
    public static class Prisoner{
        private int prisonerNumber;

        public Prisoner(int prisonerNumberHolder){
            prisonerNumber = prisonerNumberHolder;
        }
        public int getPrisonerNumber(){
            return this.prisonerNumber;
        }
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
    static boolean prisonExperiment(int numberOfPrisoners){
        System.out.println("Test");
        List<Box> boxes = new ArrayList<Box>();
        List<Prisoner> prisoners = new ArrayList<Prisoner>();
        Box testBox = new Box(3);
        System.out.println(testBox.getHiddenNumber());
        Prisoner testPrisoner = new Prisoner(2);
        System.out.println(testPrisoner.getPrisonerNumber());
        boxes.add(testBox);
        for (int i = 0; i < numberOfPrisoners; i++){
            System.out.println("help lol");
            boxes.add(new Box(i));
        }
        for (int i = 0; i < boxes.size(); i++){
            System.out.println(boxes.get(i).getHiddenNumber());
        }
        System.out.println(boxes);
        return true;
    }
}
