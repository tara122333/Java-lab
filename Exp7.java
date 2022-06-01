import java.util.*;
public class Exp7{
	public static void main(String arg[]){
		Random r = new Random();
		int r1 = 10 + r.nextInt(15);
		int r2 = 10 + r.nextInt(15);
		int r3 = 10 + r.nextInt(15);
		int sec_min = 0;
		if(r1 >= r2  && r1>=r3){
			if(r2 >= r3){
				sec_min = r2;
			}
			else if(r2==r3){
				sec_min = r1;
			}
			else{
				sec_min = r3;
			}
		}
		else if(r2 >= r3){
			if(r1 >= r3){
				sec_min = r1;
			}
			else if(r1==r3){
				sec_min = r2;
			}
			else{
				sec_min = r3;
			}
				
		}
		else{
			if(r2 > r1){
				sec_min = r2;
			}
			else if(r1==r2){
				sec_min = r3;
			}
			else{
				sec_min = r1;
			}
				
		}
		System.out.println("First Value is : "+r1);
		System.out.println("Second Value is : "+r2);
		System.out.println("Third Value is : "+r3);
		System.out.println("Secound minimum is : " + sec_min);
		
	}
}