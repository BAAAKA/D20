import java.util.Random;
import java.util.Scanner;


public class D20GUI {
	D20Logic l=new D20Logic();
	Scanner scan=new Scanner(System.in);
	String text;
	int anz;
	int s;
	
	public D20GUI(){
		
		System.out.println("Würfel Rollen! anz D Seiten: ");
		text=scan.next();
		text = text.replaceAll("d", "D");
		System.out.println("***************************");
		System.out.println("");

		anz = l.getFirstNumber(text, l.getLetterPos("D", text));
		s = l.getSecondNumber(text, l.getLetterPos("D", text));
		l.wuerfeln(anz, s);

	}
}
