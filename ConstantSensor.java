
public class ConstantSensor implements Sensor {
    private int number;
	public ConstantSensor(int number) {
		this.number=number;
	}

	@Override
	public boolean isOn() {
		return true;
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

	@Override
	public int measure() {
		return this.number;
	}

}
