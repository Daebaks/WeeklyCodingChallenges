package week_oct_3;

public class IsFactorial {
	
	 private static int getFactorial(int n) {
		int factorial=1;
		if(n==0) {
			factorial = 1;
		} else {
			while(n>1) {
				factorial *= n;
				n--;
			}
		}
		return factorial;
	}
	 
	 public static boolean isFactorial(int n) {
		 boolean check=false;
		 int tmp=1;
		 while(tmp<=n) {
			 if(getFactorial(tmp) == n ) {
				 check=true;
			 }
			 tmp++;
		 }
		return check;
    }
	
	public static void main(String[] args) {
		System.out.println(isFactorial(2));
		System.out.println(isFactorial(27));
		System.out.println(isFactorial(24));
	}
}
