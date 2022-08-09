package Telephone;
import java.time.*;
public class MissedCall {
	MissedCall(String number){
		this.number = number;
		time = LocalDateTime.now();
	}
	String name = "anonymous";
	String number;
	LocalDateTime time;
	
	void display() {
		System.out.println(name);
		System.out.println(number);
		System.out.println(time);
	}
}
