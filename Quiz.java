import javax.swing.*;

public class Quiz {

    public static void main(String[] args){
        int correct = 0;
        int incorrect = 0;
        int notVaild = 0;
        double random = Math.random() * 3;
        String[] entry = {"is 2 plus 2, 4?", "is 7 times 2, 15?", "does a TD equal 6 points?\n" +
        "Tom Brady plays baseball?", "8 plus 4 equals 12?", "the moon is a planet?", "the sun is a star?\n" +
        "Kobe Bryant played Basketball?", "a dunk is worth 3 points?", "Cats are aliens?"};
    String[] answers = {"Correct", "Incorrect", "Not Valid"};
    boolean quit = true;

        while (quit) {
            String name = JOptionPane.showInputDialog(null, "please enter A: yes, B: no C: I don't know");
            for(int i = 0; i < entry.length; i++){
                System.out.println(entry[i]);

                if (answers.equals("A")){
                    random = correct;
                }
                if (answers.equals("B")){
                    random = incorrect;
                }
                if (answers.equals("B")){
                    random = notVaild;
                }
            }
            if (name.equals("quit")){
                quit = false;
            }
        }
        System.out.println("Customer name are " + entry);
    }
}
