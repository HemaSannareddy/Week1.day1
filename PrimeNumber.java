package Week1.day1;

public class PrimeNumber {
	
public static void main(String[] args) {
			int input = 13;
			boolean flag = true;
for (int i =2; i< input ;i++) {
	if (input % i== 0) {
		System.out.println("Not a Prime number");
		flag =false;
		break;
		}
	}
if (flag) {
	System.out.println("Prime Number");
}
	}	
}
