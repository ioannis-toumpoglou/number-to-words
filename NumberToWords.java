
public class NumberToWords {

	public static void main(String[] args) {
		numberToWords(123);	
	}
	
	// Transform the digits of a number in words
	public static void numberToWords(int number) {
		int digit = 0;
		
		if (number < 0) {
			System.out.println("Invalid Value");
		} else {
		
			int numberDigits = getDigitCount(number);
			int newNumber = reverse(number);
			int newNumberDigits = getDigitCount(newNumber);
			int numberOfZeros = numberDigits - newNumberDigits;
			
			while (newNumber != 0) {
				digit = newNumber%10;
				newNumber /= 10;
			
				switch(digit){
				case 0:
					System.out.print("Zero ");
					continue;
				case 1:
					System.out.print("One ");
					continue;
				case 2:
					System.out.print("Two ");
					continue;
				case 3:
					System.out.print("Three ");
					continue;
				case 4:
					System.out.print("Four ");
					continue;
				case 5:
					System.out.print("Five ");
					continue;
				case 6:
					System.out.print("Six ");
					continue;
				case 7:
					System.out.print("Seven ");
					continue;
				case 8:
					System.out.print("Eight ");
					continue;
				case 9:
					System.out.print("Nine ");
					continue;
				default:
					System.out.print("Invalid Value ");
					break;
				}	
			}
			while (numberOfZeros > 0) {
				System.out.print("Zero ");
				numberOfZeros--;
			}
		}
	}
	
	// Reverse the digits of a number
	// The way the numberToWords() function works produces the number digits
	// in reverse order, so we need to get the in the right order by reversing them
	public static int reverse(int number) {
		int reverse = 0;
		
		while (number != 0) {
			reverse *= 10;
			reverse = reverse + number%10;
			number /= 10;
	    }	
		return reverse;
	}
	
	// Get the number of digits of a number
	// It will be used in the calculation of the number of zeros contained in a number
	// If a number is eg. 100, it will result in 1 (the reverse number produced is 001)
	public static int getDigitCount(int number) {
		int count = 0;
		
		if (number < 0) {
			return -1;
		}
		
		if (number == 0) {
			return 1;
		}
		
		while (number != 0) {
			number /= 10;
			count++;
		}
		return count;
	}

}