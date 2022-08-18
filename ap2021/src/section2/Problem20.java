package section2;

import java.util.ArrayList;

public class Problem20 {

	public static void main(String[] args) {
		BinaryInt al = new BinaryInt(2314279623L); 
		BinaryInt a2 = new BinaryInt(3236550123L); 
//		BinaryInt al = new BinaryInt(35); 
//		BinaryInt a2 = new BinaryInt(30); 
		BinaryInt aSum = al.add(a2);
		BinaryInt bl = new BinaryInt(3412579010L); 
		BinaryInt b2 = new BinaryInt(2128250735L); 
		BinaryInt bSum = bl.add(b2) ; 
		System.out.println(aSum);
		System.out.println(bSum);
		if (aSum.compareTo(bSum)> 0)
			System.out.print(aSum.toString()) ; 
		else
			System.out.print(bSum.toString());
	}

}

class BinaryInt 
{
	private ArrayList<Long> digits;
	private Long value;
	
	public BinaryInt(long decimalValue) {
		value = decimalValue;
		digits = new ArrayList<Long> ();
		while (decimalValue> 0 ) {
			digits.add( 0, Long.valueOf(decimalValue % 2));
			decimalValue /= 2;
		}
	}
	
	public BinaryInt add(BinaryInt other) {
		return new BinaryInt(value + other.getValue()); 		
	}
	
	private Long getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "BinaryInt (" + value + "=" + digits + ")";
	}
	
	public int compareTo (BinaryInt other) {
		int result = 0;
		if(value>other.getValue())
			result = 1;
		else if (value<other.getValue())
			result = -1;
		return result;
	}
}