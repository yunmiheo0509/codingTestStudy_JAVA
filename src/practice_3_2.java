import java.util.Arrays;
import java.util.Scanner;

public class practice_3_2 {
    //내가 푼 풀이
    public static void main(String[] args) {
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();

        int data[] = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = scan.nextInt();
        }
        Arrays.sort(data);
        for (int i = 1; i < M + 1; i++) {
            if (i % (K + 1) == 0) {
                answer += data[N - 2];
            } else {
                answer += data[N - 1];
            }


        }
        System.out.println();
        System.out.println(answer);

    }
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        // N개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 입력 받은 수들 정렬하기
        int first = arr[n - 1]; // 가장 큰 수
        int second = arr[n - 2]; // 두 번째로 큰 수

        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);

        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (m - cnt) * second; // 두 번째로 큰 수 더하기

        System.out.println(result);
    }
    */
}
