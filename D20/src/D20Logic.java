import java.util.Random;


public class D20Logic {
	Random ran=new Random();
	int total=0;
	
	
	
	public int getLetterPos(String letter, String text){
		return text.indexOf(letter);
	}
	public int getFirstNumber(String text, int posletter){
		return Integer.parseInt(text.substring(0, posletter));
	}
	public int getSecondNumber(String text, int posletter){
		return Integer.parseInt(text.substring(posletter+1, text.length()));
	}
	
	public void wuerfeln(int anz, int s){
		for(int anzr=0; anz>anzr;anzr++){
			int nr=ran.nextInt(s)+1;
			System.out.println("Würfel D"+s+" ergibt: " + nr);
			total+=nr;
		}
		System.out.println("Total: "+total);
	}
}
