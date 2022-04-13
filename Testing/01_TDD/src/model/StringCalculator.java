package model;

public class StringCalculator {

	public static int Add(String numbers) {
		int returnValue=0;
		String[] numbersArray = numbers.split(",|n|k");
		//if(numbersArray.length>2) {
		//	throw new RuntimeException("Up to 2 numbers separated by comma (,), are allowed");
		//} else {
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) {
				returnValue+=Integer.parseInt(number);
			}
		}
		//}
		return returnValue;
	}
}
