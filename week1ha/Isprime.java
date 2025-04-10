package week1ha;

public class Isprime {

	public static void main(String[] args) {
		int n =13;
		boolean primeno = true;
		for (int i =2; i<=n; i++) {
			if (n%i!=0) {
				boolean notprime =false;
				System.out.println("Number is Not Prime no");
				
			} else {
				System.out.println("Number is Prime no");

			}
			
		}
	}

}
