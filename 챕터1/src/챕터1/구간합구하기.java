package 챕터1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader =
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer =
				new StringTokenizer(bufferedReader.readLine());  //readLine은 enter친 거를 말함. 처음에 5 3 입력
		int suNo = Integer.parseInt(stringTokenizer.nextToken()); //5 들어감
		int quizNo = Integer.parseInt(stringTokenizer.nextToken()); //3들어감
		long[] S = new long[suNo+1]; //그러면 S는 6배열이 되는데?
	
		stringTokenizer = new StringTokenizer(bufferedReader.readLine()); //배열 5 4 3 2 1 입력
		for (int i = 1; i <= suNo; i++) {
			
			S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken()); // S[1] = 5, S[2]= 5 + 4 ... S[6]이 필요할까?
				
		}
		
		for(int q = 0; q < quizNo; q++) { //quizNo에 3이 들어갔으니까 0,1,2 3번 실행되는 거 맞네.
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j] - S[i - 1]);
		}
			
		
	}
}
