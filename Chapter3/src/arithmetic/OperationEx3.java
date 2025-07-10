package arithmetic;

public class OperationEx3 {
	 public static void main(String[] args) {
		  int gameScore = 150;           //
		
		  int lastScore1 = ++gameScore;  // 151
		  int lastScore2 = gameScore--;   //151
		
		  System.out.println(lastScore1);  // 151
		  System.out.println(lastScore2);  // 151
		  System.out.println(gameScore);   //150
	 }
}

