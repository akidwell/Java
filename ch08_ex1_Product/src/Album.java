
public class Album  extends Product{

		//instance variable
		private String artist;
		
		//constructor
		public Album() {
			super();
			this.artist = artist;
			count++;
		}

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		@Override
		public String toString() {
			return (super.toString() + " " + artist);
		}
	
		
}
