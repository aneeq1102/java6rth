package threads;

import java.util.Scanner;

public class th2 extends Thread {
	Boolean vowelCheck(char i) {
		if(i == 'i' || i=='e' || i== 'o') {
			return true;
		}
		return false;
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence to countr vowels");
		String st = sc.nextLine();
		int count = 0;
		char arr[] = st.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(vowelCheck(arr[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
