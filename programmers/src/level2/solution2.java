package level2;

import java.io.*;
import java.util.*;

public class solution2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(solution(br.readLine()));
	}

	public static boolean solution(String s) {

		boolean answer = true;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(') {
				stack.push(c);
			} else if (stack.empty()) {
				answer = false;
			} else {
				stack.pop();
			}
		}

		if (!stack.empty()) {
			answer = false;
		} 
		
		return answer;
	}
}
