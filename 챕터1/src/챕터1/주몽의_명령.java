package 챕터1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//배열에서 두 수를 합했을 때 주어진 수가 되는 경우는 몇 가지인가.
public class 주몽의_명령 {
	public static void main(String[] args) throws Throwable, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int M = Integer.parseInt(bf.readLine());
		int[]A = new int[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i = 0; i< N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		int count = 0;
		int i =0;
		int j = N-1;
		while (i<j) {
			if(A[i] + A[j] < M) {
				i++;
			}else if(A[i] + A[j] > M) {
				j--;
			}else {
				count++;
				i++;
				j--;
			}
		}
		System.out.println(count);
		bf.close();
	}
}
