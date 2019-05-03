
public abstract class Animal implements Countable {
	
	public int count;
	
	@Override
	public void incrementCount() {
		count += 1;
		
	}

	@Override
	public void resetCount() {
		count = 0;
		
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public String getCountString() {
		return null;
	}
}
