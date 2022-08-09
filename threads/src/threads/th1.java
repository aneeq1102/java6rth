package threads;

import java.util.Scanner;
import java.util.*;
public class th1 extends Thread{
	String getStr(int i) {
		switch(i) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		
			
		}
		return "";
	}
	public void run() {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int copy = n;
		int rem;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while(copy != 0) {
			rem = copy % 10;
			copy = copy/10;
			nums.add(rem);
			
		}
		
		for(int x:nums) {
			System.out.println(getStr(x)+"-");
		}
	}
}
