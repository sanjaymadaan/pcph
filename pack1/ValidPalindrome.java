class ValidPalindrome {
    public boolean isPalindrome(String s) {
       	s = s.toLowerCase();
	String reqstr = new String("");
	
	for(int index=0; index<s.length(); index++) {
		char ch = s.charAt(index);
		if(Character.isAlphabetic(ch) || Character.isDigit(ch)) {
			reqstr = reqstr.concat(""+ch);
		}
	}
	//System.out.println(reqstr);

	StringBuilder sb = new StringBuilder(reqstr);
	sb = sb.reverse();
	String revstr = sb.toString();
	
	return reqstr.equals(revstr);
    }
}
