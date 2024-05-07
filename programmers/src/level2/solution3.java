package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class solution3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] A = new int[T];
		int[] B = new int[T];
		
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			A[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(A, B));
	}
	
	static int solution(int[] A, int[] B) {
		
		int answer = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i = 0; i < A.length; i++) {
			answer += A[i]*B[A.length-i-1];
		}
		
		return answer;
	}
}
