import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        String[] text = br.readLine().split(" ");

        long input = Long.parseLong(text[0]);
        String b2_input = Long.toString(input, 2);

        long left = Long.parseLong(text[1]);
        long right = Long.parseLong(text[2]);
        String b2_left = Long.toString(left, 2);
        String b2_right = Long.toString(right, 2);

        if(b2_right.length() > b2_input.length()) {
            
        }
        
        

    }
}