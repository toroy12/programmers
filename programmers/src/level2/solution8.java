package level2;

import java.util.Scanner;

public class solution8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(solution(n));

	}
	
	static int solution(int n) {
		
        int answer = 0;
		
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 1;
		
		if(n >= 2) {
			for (int i=2; i<= n; i++){
	            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
	        }
		}
		
		answer = dp[n] % 1234567;
		
		return answer;
	}
}
