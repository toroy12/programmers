package level2;

import java.util.Scanner;

public class solution6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(solution(n));
	}

	static int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i += 2) {
			if (n % i == 0)
				answer++;
		}

		return answer;
	}
}
