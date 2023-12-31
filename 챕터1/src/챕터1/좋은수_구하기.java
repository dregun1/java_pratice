package 챕터1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//주어진 배열에서 두 수를 합했을 때 배열 안의 다른 수가 될 경우의 수.
public class 좋은수_구하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); //수의 개수
		int Result = 0;
		long A[] = new long[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());//배열생성
		}
		Arrays.sort(A); //생성한 배열을 정렬한 후
		for (int k = 0; k < N; k++) {
			long find = A[k];
			int i = 0;
			int j = N - 1;
			//투 포인터 알고리즘?
			
		while (i < j) {
			
			if(A[i] + A[j] == find) {
				//find는 서로 다른 두 수의 합이어야 함을 체크
				if(i != k && j != k) {
					Result++;
					break; //while(i<j)를 벗어나네 i랑 k는 어차피 위치를 표현한 거라 A[i] != A[k] 이런식이 맞을듯?
				}else if (i == k) {
					i++;
				}else if(j == k) {
					j--;
				}
			}else if (A[i] + A[j] < find) {
				i++;
			}else {
				j--;
			}
		}
		}
		System.out.println(Result);
		bf.close();
		
	}
	
}
