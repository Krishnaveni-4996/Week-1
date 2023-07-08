package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		 int i , n = 17;
		 boolean isPrime = true;
		 if (n<2) {
			 isPrime = false;
			
		}
		 else {
			for (i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
					
				}
				
			}
		}
		 String result = isPrime ? "Prime" : "Not Prime" ;
		 System.out.println(n + " " + "is" + " " + result);
		 
	}

}
