import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        july_fourth(input);
    }
    public static void july_fourth(String input) {
        int num = Integer.parseInt(input);
        Queue<Integer> list = new LinkedList<>();
        if(num % 2 != 0) {
            list.add(7);
            compute(list, input.length(), "7");
        } else {
            compute(list, input.length(), "");
        }
        
        while(!list.isEmpty()) {
            if(num % list.remove() == 0) {
                System.out.println("July Fourth Family Number");
                return;
            }
        }
        System.out.println("Not in the family");
    }

    public static void compute(Queue<Integer> list, int length, String num) {
        if(length == 0) return;
        list.add(Integer.parseInt("4"+num));
        list.add(Integer.parseInt("7"+num));
        length -= 1;
        compute(list, length, "4"+num);
        compute(list, length, "7"+num);
    }
}
