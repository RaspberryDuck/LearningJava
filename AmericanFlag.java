class AmericanFlag {

	public static void main(String[] args){
	
	int loopCounter = 1;
	int totalFlagRows = 16;
	
	int totalStarRows = 9;
	
	while (loopCounter < totalFlagRows){
	
		if (loopCounter <= totalStarRows){
			System.out.println("* * * * * * ==================================");
			System.out.println(" * * * * *  ==================================");
			System.out.println("* * * * * * ==================================");
			loopCounter = loopCounter + 3;
		} else {
			System.out.println("==============================================");
			loopCounter++;
		}
	}
	}
}
