package business;

public class Student implements Comparable {
	
	private String firstName;
	private String lastName;
	private String score;
	
	//constructor
	//with parms
	public Student(String firstName, String lastName, String score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
	}
		
	// constructor w/out parms
		public Student() {
	        this.firstName = "";
	        this.lastName = "";
	        this.score = "";
	}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getScore() {
			return score;
		}

		public void setScore(String string) {
			this.score = string;
		}
	
		
	
		 @Override
		    public String toString() {
				 
		        return String.format(lastName +", " + firstName +" " + score);
		 }

		@Override
		public int compareTo(Object o) {
			System.out.println(1);
			if (o instanceof Student) {
			     return (((Student) o).getLastName().compareTo(this.lastName) == 0) ?
		                    ((Student) o).getFirstName().compareTo(this.firstName) :
		                    ((Student) o).getLastName().compareTo(this.lastName);
		        } else {
		            throw new ClassCastException();
			}
			
		}
	

}
