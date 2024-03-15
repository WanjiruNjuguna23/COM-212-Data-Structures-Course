public class BracketMatcher {
	
	private String OpenBracket ="([{<";
	private String CloseBracket = ")]}>";


/**
 * @return true if the character c is an open bracket 
 */ 
	public boolean isOpeningBracket(char c){
		if(OpenBracket.indexOf(c) >= 0){
			 return true; 
		}
		return false; 
	}


/** 
 * @return true if the character c is a closing bracket
 */
	public boolean isClosingBracket(char c){
		if(CloseBracket.indexOf(c) >= 0){
			return true; 
		}
		return false; 
	}


/**
 * @return true if the character open is a bracket that corresponds
 * to the closing bracket character close
 */

	public boolean corresponds(char open, char close){
		if(OpenBracket.indexOf(open) == CloseBracket.indexOf(close)){
			return true; 
		}
		return false;
	}
	
	public boolean checkBrackets(String s){
		Stack check = new Stack();

		for(int i = 0; i < s.length(); i++){
			//System.out.println(check.peek());
			if(isOpeningBracket(s.charAt(i))){
				check.push(s.charAt(i));
			}else if(isClosingBracket(s.charAt(i))){
				if(check.isEmpty()){
					return false;
				}else{
					if(corresponds(check.peek(), s.charAt(i))){
						check.pop(); 
					} else{
						return false; 
					}
				}
				
			}
			
		}

		if(check.isEmpty()){
			return true; 
		}
		return false; 
	}
}

