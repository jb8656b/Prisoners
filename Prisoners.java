import java.util.*;
public class Prisoners {
    public static void main(String[] args){
        // System.out.println(prisonExperiment(100));
        int successes = 0;
        int failures = 0;
        boolean result;

        // Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        // System.out.println("How many times would you like to run the simulation?");

        // String numberOfTimes = myScanner.nextLine();  // Read user input
        // System.out.println("Username is: " + userName);  // Output user input

        for(int i = 0; i < 10000000; i++){
            result = prisonExperiment(100);
            if (result == true){
                successes++;
            }
            if (result == false){
                failures++;
            }
        }
        System.out.println("Successes: " + successes);
        System.out.println("Failures: " + failures);
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
        // System.out.println("Test");
        List<Box> boxes = new ArrayList<Box>();
        List<Prisoner> prisoners = new ArrayList<Prisoner>();
        // Box testBox = new Box(3);
        // System.out.println(testBox.getHiddenNumber());
        // Prisoner testPrisoner = new Prisoner(2);
        // System.out.println(testPrisoner.getPrisonerNumber());
        // boxes.add(testBox);
        for (int i = 0; i < numberOfPrisoners; i++){
            // System.out.println("help lol");
            boxes.add(new Box(i));
            prisoners.add(new Prisoner(i));
        }
        Collections.shuffle(boxes);
        for (int i = 0; i < boxes.size(); i++){
            // System.out.println("Box " + i + ": " + boxes.get(i).getHiddenNumber());
        }
        // for (int i = 0; i < prisoners.size(); i++){
        //     System.out.println("Prisoner " + i + ": " + prisoners.get(i).getPrisonerNumber());
        // }


        // Still working on this part with the loop
        int countOfBoxesChecked = 0;
        int boxCountChecklimit = numberOfPrisoners/2;

        int currentBox;
        // System.out.println("prisoners size " + prisoners.size());
        for (int i = 0; i < prisoners.size(); i++){
            // System.out.println("Prisoner " + i + ": " + prisoners.get(i).getPrisonerNumber());
            currentBox = (prisoners.get(i)).getPrisonerNumber();
            // System.out.println("Current Box Number: " + currentBox);
            while (countOfBoxesChecked <= boxCountChecklimit){
                if (countOfBoxesChecked >= boxCountChecklimit){
                    // If a prisoner reaches the limit of boxes they can check
                    // System.out.println("Box count check limit reached");
                    return false;
                }
                if (((boxes.get(currentBox)).getHiddenNumber()) == (prisoners.get(i)).getPrisonerNumber()){
                    // If Prisoner checks the correct box
                    // System.out.println("Prisoner has found the correct box");
                    // System.out.println("Box " + currentBox + " is correct. Contains number "
                    //      + (boxes.get(currentBox)).getHiddenNumber());
                    countOfBoxesChecked = 0;
                    break;
                }
                else{
                    // If prisoner checks the incorrect box
                    // System.out.println("Box " + currentBox + " is incorrect. Contains number "
                        //  + (boxes.get(currentBox)).getHiddenNumber());
                    currentBox = (boxes.get(currentBox)).getHiddenNumber();
                    countOfBoxesChecked++;
                }

            }
        }
        return true;
    }



    static boolean prisonExperimentWithPrints(int numberOfPrisoners){
        System.out.println("Test");
        List<Box> boxes = new ArrayList<Box>();
        List<Prisoner> prisoners = new ArrayList<Prisoner>();
        // Box testBox = new Box(3);
        // System.out.println(testBox.getHiddenNumber());
        // Prisoner testPrisoner = new Prisoner(2);
        // System.out.println(testPrisoner.getPrisonerNumber());
        // boxes.add(testBox);
        for (int i = 0; i < numberOfPrisoners; i++){
            // System.out.println("help lol");
            boxes.add(new Box(i));
            prisoners.add(new Prisoner(i));
        }
        Collections.shuffle(boxes);
        for (int i = 0; i < boxes.size(); i++){
            System.out.println("Box " + i + ": " + boxes.get(i).getHiddenNumber());
        }
        // for (int i = 0; i < prisoners.size(); i++){
        //     System.out.println("Prisoner " + i + ": " + prisoners.get(i).getPrisonerNumber());
        // }


        // Still working on this part with the loop
        int countOfBoxesChecked = 0;
        int boxCountChecklimit = numberOfPrisoners/2;

        int currentBox;
        System.out.println("prisoners size " + prisoners.size());
        for (int i = 0; i < prisoners.size(); i++){
            // System.out.println("Prisoner " + i + ": " + prisoners.get(i).getPrisonerNumber());
            currentBox = (prisoners.get(i)).getPrisonerNumber();
            System.out.println("Current Box Number: " + currentBox);
            while (countOfBoxesChecked <= boxCountChecklimit){
                if (countOfBoxesChecked >= boxCountChecklimit){
                    System.out.println("Box count check limit reached");
                    return false;
                }
                if (((boxes.get(currentBox)).getHiddenNumber()) == (prisoners.get(i)).getPrisonerNumber()){
                    System.out.println("Prisoner has found the correct box");
                    System.out.println("Box " + currentBox + " is correct. Contains number "
                         + (boxes.get(currentBox)).getHiddenNumber());
                    countOfBoxesChecked = 0;
                    break;
                }
                else{
                    System.out.println("Box " + currentBox + " is incorrect. Contains number "
                         + (boxes.get(currentBox)).getHiddenNumber());
                    currentBox = (boxes.get(currentBox)).getHiddenNumber();
                    countOfBoxesChecked++;
                }

            }
        }
        // System.out.println(boxes);
        // System.out.println(prisoners);
        return true;
    }
}
