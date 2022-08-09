package Telephone;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		Contact c1 = new Contact("jeff","123456789");
		Contact c2 = new Contact("mark","234567890");
		
		contacts.add(c1);
		contacts.add(c2);
		
		System.out.println("enter missed calls");
		
		ArrayList<MissedCall> missedCalls = new ArrayList<MissedCall>();
		int ch;
		String num;
		Scanner sc = new Scanner(System.in);
		while(1<2) {
			System.out.println("add new number? 1-yes 2-no");
			ch = sc.nextInt();
			
			if(ch == 2) {
				break;
			}
			System.out.println("enter number");
			sc.nextLine();
			num = sc.nextLine();
			MissedCall t1 = new MissedCall(num);
			
			for(Contact c:contacts) {
				if(c.number.equals(t1.number)) {
					t1.name = c.name;
				}
			}
			missedCalls.add(t1);
				
			
		}
		
		System.out.println("displaying details");
		int choi;
		for(int i=0;i<missedCalls.size();) {
			System.out.println("enter choice 1:display details , 2:view next call , 3: delete call");
			choi = sc.nextInt();
			
			switch(choi) {
			case 1:
				missedCalls.get(i).display();
				break;
				
			case 3:
				missedCalls.remove(i);
				break;
			case 2:
				i+=1;
				break;
				
			}
		}
		System.out.println("printing all details");
		for(MissedCall c:missedCalls) {
			c.display();
		}
		
		
	}
}
