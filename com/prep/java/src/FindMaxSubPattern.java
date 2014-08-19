public static String maxSubPattern(String input) {      
		if (input == null || input.equals(""))
			return null;
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < input.length(); i++) {
			list.add(input.substring(i));
		}
		Collections.sort(list);
		String maxStr = "";
		for (int i = 0; i < list.size() - 1; i++){
			int j = 0;
			int minL = Math.min(list.get(i).length(), list.get(i+1).length());
			if (minL <= maxStr.length()) //make sure the length of patter we are looking for will be greater than previous found.
				continue;
			while(list.get(i).charAt(j) == list.get(i+1).charAt(j)) {				
				j++;
				if (j == minL) //stop when reaching the end of shorter string.
					break;
			}
			if (j > maxStr.length()) {
				maxStr = list.get(i).substring(0, j);
			}
		}
		return maxStr;		
		
	}
}