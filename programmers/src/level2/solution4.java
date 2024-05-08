package level2;

import java.io.*;

public class solution4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		System.out.println(solution(s));
	}
	
	static String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
 
        for(int i=0; i<arr.length; i++) {
            String now = arr[i];
 
            if(arr[i].length() == 0) {
                answer += " ";
            } else {
            
                answer += now.substring(0, 1).toUpperCase();
                answer += now.substring(1, now.length()).toLowerCase();
                answer += " ";
            }
            
        }
        
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }
        
        return answer.substring(0, answer.length()-1);
    }
 
}
