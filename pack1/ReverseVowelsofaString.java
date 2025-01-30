class ReverseVowelsofaString {
	public static boolean isVowel(char ch) {
		List<Character> list = Arrays.asList('a','e','i','o','u'
				,'A','E','I','O','U');
		return list.contains(ch);
	}

    public String reverseVowels(String s) {
      char arr[] = s.toCharArray();
	int left = 0;
	int right = arr.length - 1;
	while(left < right) {
		if(isVowel(arr[left]) && isVowel(arr[right])) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++; right--;
		} 
		if(!isVowel(arr[left])) {
			left++;
		}
		if(!isVowel(arr[right])) {
			right--;
		}	
	}
	String reqstr = new String("");
	for(char ch : arr) {
		reqstr = reqstr.concat(""+ch);
	}
	return reqstr;  
   }
}
