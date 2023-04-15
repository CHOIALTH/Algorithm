import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 정수의 개수 N
        int[] numbers = new int[N]; // 정수들을 저장할 배열

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken()); // 정수를 배열에 저장
        }

        int v = Integer.parseInt(br.readLine()); // 찾으려고 하는 정수 v
        int count = 0; // 정수 v의 개수를 저장할 변수

        for (int i = 0; i < N; i++) {
            if (numbers[i] == v) {
                count++; // 정수 v와 같은 값이 있을 때마다 count를 증가
            }
        }

        System.out.println(count); // 정수 v의 개수 출력
    }
}
