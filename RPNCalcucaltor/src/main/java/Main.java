
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Emil
 */
public class Main {

    static ArrayList<Integer> array = new ArrayList();
    static int index = -1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            String str;
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter a number or one of the following symbols1 +,-,*-/: ");
            String n = reader.next(); // Scans the next token of the input as an int.
            int foo = 0;
            try {
                 foo = Integer.parseInt(n);
            } catch (Exception e) {
            }
            
            if (foo != 0) {
                array.add(foo);
                index++;
            } else if (n.contains("+")) {
                int temp = array.get(index) + array.get(index - 1);
                index--;
                array.add(temp);
            } else if (n.contains("-")) {
                int temp = array.get(index) - array.get(index - 1);
                index--;
                array.add(temp);
            } else if (n.contains("*")) {
                int temp = array.get(index) * array.get(index - 1);
                index--;
                array.add(temp);
            } else if (n.contains("/")) {
                int temp = array.get(index) / array.get(index - 1);
                index--;
                array.remove(index);
                array.remove(index-1);
                array.add(temp);
            }
            System.out.println(outarray(array));
        }
    }
    private static String outarray(ArrayList<Integer> arr){
        String res = "";
        for (Integer integer : arr) {
            res += integer + "\n";
        }
        return res;
    }

}
