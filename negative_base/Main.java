import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String res = "";
        int rem;
        while(true) {
            rem = n % (-2);
            n = n / (-2);
            if(rem < 0) {
                n += 1;
                rem += 2;
            } 
            res = rem + res;
            if(n == 0) break;
        }
        // StringBuilder res1 = new StringBuilder();
        // res1.append(res);
        // res1.reverse();
        System.out.print(res);
    }
}
// -15 / -2 = 7 ... -1
// -15 = -2 * 7 - 1
//     = -2 * (7 + 1) - 1 + 2
