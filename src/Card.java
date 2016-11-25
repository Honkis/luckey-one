/*
 * 
 */
public class Card {
	
	private String colour;
	private String rank;
	private int value;
	private int totalValue;
	
	public Card(String rank ,String colour, int value, int totalValue) {
		this.rank = rank;
		this.colour = colour;
		this.value = value;
		
		// total score av hjärter
		if(this.totalValue==0){
			this.totalValue= this.value+8;
		}
		//total score av spader
		else if(this.totalValue==1){
			this.totalValue=this.value+10;
		}
		// total score av klöver
		else if(this.totalValue==2){
			this.totalValue=this.value+6;
		}
		// total score av ruter
		else{
			this.totalValue=this.value+4;
		}
	}
	public String toString(){
		return rank + " of " + colour + ". Card score " + totalValue + " !";
	}
	public int toInt(){
		return this.totalValue;
	}
	
}
