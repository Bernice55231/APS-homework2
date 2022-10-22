import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int s = Integer.parseInt(text.split(" ")[0]);
        int m = Integer.parseInt(text.split(" ")[1]);
        String[] miss = br.readLine().split(" ");

        int num = (int) Math.pow(2, s);
        boolean[] misslist = new boolean[num];
        for(int i = 0; i < num; i++) {
            misslist[i] = true;
        }
        for(int i = 0; i < m; i++) {
            misslist[Integer.parseInt(miss[i])-1] = false;
        }

        int res = 0;
        for(int i = s-1; i >= 0; i--) {
            res += compute(misslist, (int) Math.pow(2, i));
        }
        System.out.print(res);

    }

    public static int compute(boolean[] misslist, int group) {
        int res = 0;
        for(int i = 0; i < group; i++) {
            if(!misslist[2*i] && !misslist[2*i+1]) {
                misslist[i] = false;
            } else {
                if(!(misslist[2*i] && misslist[2*i+1])) 
                    res += 1;
                misslist[i] = true;
                
            }
        }
        return res;
    }

}
