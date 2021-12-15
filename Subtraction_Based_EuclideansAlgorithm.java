
public class Subtraction_Based_EuclideansAlgorithm {
	public static int Sub_Euclidean_GCD(int a, int b) {
		// base case
		// if a is equals to zero , then b is the gcd
		if(a == 0) {
			return b;
		}
		// if b is equals to zero, then a is the gcd
		if(b == 0) {
			return a;
		}
		// if a is equals to b , then that value is the gcd
		// you can return any of them, either a or b
		if(a ==b) {
			return a;
		}
		
		// if a is greater than b, GCD(108, 24) = GCD(108-24, 24)
		// we recursively call this formular until  a is equals to b 
		// 108 - 24 = 84
		// 84 - 24 = 60
		// 60 - 24 = 36
		// 36 - 24 = 12 // here a is 12 and b is 24 , which makes b greater than a.
	
		if(a > b) {
			return Sub_Euclidean_GCD(a-b, b);
		}
		// if b is greater than a , GCD (108, 24) = GCD(12 , 24-12)
		// we call this formular until a is equals to b
		// 24 - 12 = 12 
		// 12 - 12 = 0 //  here a is 12 and b is 12 , so 12 is the gcd
		return Sub_Euclidean_GCD(a, b-a);
	}
       // driver code
	public static void main(String[] args) {
		int a = 108;
		int b = 24;
		System.out.println(" the GCD of " + a +  " and  " + b + "  is : " +  Sub_Euclidean_GCD(a , b ));
	}

}
