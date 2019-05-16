import java.util.Scanner;

public class AverageQuizzes {

    public static void main(String[] args){
        int[] scores = new int[10];
        int entry;
        int total = 0;
        int count = 0;
        int average = 0;
        int high = 0;
        int low = 0;
        boolean quit = true;


        Scanner input = new Scanner(System.in);
        while (quit){
            System.out.println("Please enter some test scores");
            entry = input.nextInt();

            if(count == scores.length){
                quit = false;
                count--;
            }
            scores[count] = entry;
            count++;
        }
        for(int i = 0; i < scores.length; i++){
            total = total + scores[i];
            if (scores[i]>high){
                high = scores[i];
            }
            else if (scores[i]<low){
                low = scores[i];
            }
        }
        average = total / scores.length;
        System.out.println("the average score is" + average);
        System.out.println("the high score is" + high);
        System.out.println("the low score is" + low);

    }
}
