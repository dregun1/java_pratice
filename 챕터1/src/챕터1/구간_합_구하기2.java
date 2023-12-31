package 챕터1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 구간_합_구하기2 {
//2차원 배열에서 (x,x)~(y,y)까지의 합 구하기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int A[][] = new int[N+1][N+1];
		for (int i = 1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <=N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int D[][] = new int[N+1][N+1];
		for (int i =1; i<=N; i++) {
			for (int j=1; j<=N; j++) {
				D[i][j] = D[i-1][j] + D[i][j-1] - D[i-1][j-1] + A[i][j];
				//만약 D[1][3] = D[0][3] + D[1][2] - D[0][0] + A[1][3]; 1차원배열에도 적용되는구나.
				// D[1][2] = D[0][2] + D[1][1] - D[0][1] + A[1][2];
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i =0; i< M; i++) {
			st= new StringTokenizer(br.readLine(), ","); //StringTokenizer에서 ,로 구별하고 싶을 때.
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
			
			
			list.add(result);
		}
		for (int a : list) {
			System.out.println(a);
		}
		}


}
