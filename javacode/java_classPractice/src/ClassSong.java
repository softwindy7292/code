class Song{
	String title, artist, country;
	int year;
	
	Song(){
		this.title = "???";
		this.artist = "???";
		this.year = 0000;
		this.country = "???";
	}
	
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show(){
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}

public class ClassSong {

	public static void main(String[] args) {
		Song song = new Song();
		song.show();
				
	}

}