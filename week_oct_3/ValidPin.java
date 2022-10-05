package week_oct_3;

public class ValidPin {

	public static boolean validate(String s) {
		boolean valid=true;
		if(s.length()!=4 && s.length()!=6) {
			valid = false;
		} 
		else {
			for(char c: s.toCharArray()) {
				if(!Character.isDigit(c)) {
					valid = false;
				}
			}
		}
		return valid;
	}
	
	public static void main(String[] argS) {
		System.out.println(validate("121317"));
		System.out.println(validate("1234"));
		System.out.println(validate("45135"));
		System.out.println(validate("89abc1"));
		System.out.println(validate("900876"));
		System.out.println(validate(" 4983"));
	}
}
