package level2;

import java.io.IOException;
import java.util.Scanner;

public class solution1 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		
		String answer = "";
		
		String[] numbers = s.split(" ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		
		answer = min + " " + max;
		
		return answer;
	}
}
