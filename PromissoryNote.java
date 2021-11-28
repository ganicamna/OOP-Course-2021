import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String,Double> promissoryNote;
    
	public PromissoryNote() {
		this.promissoryNote = new HashMap<String,Double>();
		
	}
	public void setLoan(String toWhom, double loan) {
		Double person = this.promissoryNote.get(toWhom);
		if(person==null) {
			this.promissoryNote.put(toWhom,loan);
		}else {
			this.promissoryNote.remove(toWhom);
			this.promissoryNote.put(toWhom,loan);
		}
	}
	public double howMuchIsTheDebt(String whose) {
		return this.promissoryNote.get(whose);
	}

}
