import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PracticeListArray {

    public static void main(String[] args){

        ArrayList<String> customeNames = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        boolean quit = true;

        while (quit){
            String name = JOptionPane.showInputDialog(null, "enter the customers name");
            if(name.equals("quit")){
                quit = false;
            }
            customeNames.add(name);
        }
        System.out.println("Customer names are " + customeNames);
        Collections.sort(customeNames);
        System.out.println("Customer names are " + customeNames);
    }
}
