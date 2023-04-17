import java.io.*;

public class Main{
    public static void main(String[] Args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i++){
            String x = br.readLine();
            bw.write(x.split("")[0]+x.split("")[x.length() - 1]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}