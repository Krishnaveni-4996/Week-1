package week1.day2;

public class Calculator {
	public int getAddThreeNumbers(int a, int b, int c) {
		return a+b+c;

	}
	
	public float getSubTwonNumbers(int i , float j) {
		return i-j;
		
	}
	
	public int getDivideTwoNumbers(int x, int y) {
		return x/y;

	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int addThreeNumbers = c.getAddThreeNumbers(3, 5, 7);
		System.out.println(addThreeNumbers);
		float subTwonNumbers = c.getSubTwonNumbers(4, 3.5f);
		System.out.println(subTwonNumbers);
		int divideTwoNumbers = c.getDivideTwoNumbers(10, 5);
		System.out.println(divideTwoNumbers);
	}
	

}
