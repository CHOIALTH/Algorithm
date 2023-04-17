import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] Args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int X = Integer.parseInt(br.readLine()); // 영수증에 적힌 총 금액
        int N = Integer.parseInt(br.readLine()); // 구매한 물건 개수    
        int sum = 0;
        
        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 각 물건의 가격
            int b = Integer.parseInt(st.nextToken()); // 각 물건의 개수
            sum += (a * b);       
        }
        if(sum == X){
            bw.write("Yes\n");
        }
        else{
            bw.write("No\n");
        }
        bw.flush();
        bw.close();
    }
}