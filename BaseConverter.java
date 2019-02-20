public class BaseConverter {
    public String convertBase (int oldBase, int newBase, String value) {
        return convertToDecimal(oldBase, newBase, value);
    }
    
    private String convertToDecimal (int oldBase, int newBase, String value) {
		int total = 0;
		
		for (int i = 0; i < value.length(); i++) {
					
			
			int baza = convertFromLetter(value.substring(i, i+1), oldBase);
						int bazaz = (int) Math.pow(oldBase, (value.length()-(i+1))) * baza;
								total = total + bazaz;
								
								
		}
					return convertFromDecimal(total, newBase);
	}
	
	private String convertFromDecimal(int total, int newBase) {
				String newValue = "";
						while (total > 0) {
							
							
							
												int temp = total % newBase;
												total = total / newBase;
												newValue = convertToLetter(temp) + newValue;
											}
								return newValue;
	}
	
	private String convertToLetter (int num) {
		String fiver = "";
		if (num > 9) {
			switch (num) {
					case 10 : fiver = "A";
							break;
									case 11 :fiver = "B";
											break;
												case 12 : fiver = "C";
														break;
																case 13 : fiver = "D";
																		break;
																		case 14 : fiver = "E";
																				break;
																					case 15 : fiver = "F";
																							break;
			}
			return fiver;
			
			
			
		} else {
			
			
			
			Integer newNumber = num;
			
			
			
			
			
			return newNumber.toString();
		}
	}

	private int convertFromLetter (String alpha , int oldBase) {
		int newNum = 0;
		switch (alpha) {
			case "A" : newNum = 10;
				break;
						case "B" : newNum = 11;
							break;
								case "C" : newNum = 12;
									break;
											case "D" : newNum = 13;
													break;
													case "E" : newNum= 14;
															break;
															case "F" : newNum = 15;
																break;
																		default : newNum = Integer.parseInt(alpha);
				break;
		}
		if (newNum > (oldBase-1)) {
			
			
			
							throw new IllegalArgumentException("Please make sure you entered your number correctly!");
		}
		return newNum;
	}
}
