package level2;

import java.util.*;

public class solution7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int answer = 0;
        
        int curOne = toBinary(n);
		
		while(true) {
			int nextOne = toBinary(++n);
			if(curOne == nextOne) break;
		}
		answer = n;
        
        System.out.println(answer);
	}

	static int toBinary(int n) {

		int one = 1;

		while (n > 1) {
			if (n % 2 == 1) {
				one++;
			}
			n /= 2;
		}

		return one;
	}
}
