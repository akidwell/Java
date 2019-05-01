
public class Sheep extends Animal implements Cloneable{
	
	private String name;

	public Sheep() {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}


	@Override
	public String getCountString() {
		return getCount() + " "+ name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
