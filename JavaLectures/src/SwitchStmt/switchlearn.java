package SwitchStmt;

public class switchlearn {

	public static void main(String[] args) {
		int score = 65;
		switch(score)
		{
		case 90 :
			System.out.println("Very Good!");
			break;
		case 60 :
			System.out.println("Good!");
			break;
		case 40 :
			System.out.println("Okay!");
			break;
		default :
			System.out.println("The grades are not updated yet!");
			break;
		}
	}
}
