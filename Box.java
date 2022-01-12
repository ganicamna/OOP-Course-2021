
public class Box implements ToBeStored{
    private double maxWeight;
    private double currentWeight;
    private int numberOfThings;
    
	public Box(double weight) {
		this.maxWeight=weight;
		this.currentWeight=0;
		this.numberOfThings=0;
	}

	@Override
	public double weight() {
		return this.maxWeight;
	}
    public int add(ToBeStored object) {
    	if((this.currentWeight + object.weight()) <= this.maxWeight) {
    		this.currentWeight=this.currentWeight+object.weight();
    		this.numberOfThings++;
    	}
    	return 0;
    }
    public String toString(){
        return "Box: " + numberOfThings + " things, total weight " + this.currentWeight + " kg";
    }
}
