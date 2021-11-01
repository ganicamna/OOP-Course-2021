
public class LyyraCard {
     private double balance;
     private String name;
     
	 public LyyraCard(double balanceAtStart, String name) {
		this.balance = balanceAtStart;
		this.name = name;
	 }
	 
	 public String toString() {
		 return this.name + "'s card: The card has " + this.balance + " euros!";
	 }
	 public void payEconomical() {
		 if(this.balance>=2.50) {
			 this.balance = this.balance - 2.50;
			 System.out.println(this.name + "'s card: Economical is paid. The card has " + this.balance + " euros now!");
		 }
		 else {
			 System.out.println(this.name + "'s card: The card doesn't have enough money for Economical!");
		 }
	 }
     public void payGourmet() {
    	 if(this.balance>=4.0) {
			 this.balance = this.balance - 4.0;
			 System.out.println(this.name + "'s card: Gourmet is paid. The card has " + this.balance + " euros now!");
		 }
    	 else{
    		 System.out.println(this.name + "'s card: The card doesn't have enough money for Gourmet!");
    	 }
    	 }
     public void loadMoney(double load) {
    	 if(load>=0) {
    		 this.balance = this.balance + load;
        	 System.out.println(this.name + "'s card (load): The card has " + this.balance + " euros now!");
    	 }else {
        	 System.out.println(this.name + "'s card (load): The card has " + this.balance + " euros!");
    	 }
    	 
     }
	 }
