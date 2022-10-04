package hw3;

public class TestHarness {
	public static void main(String[] args) {
		BeachReport blist = new BeachReport();
		
		blist.addBeach("Rehoboth Beach");
		blist.addBeach("North Beach");
		blist.addBeach("Myrtle Beach");
		blist.addBeach("Assateague Island");
		blist.addBeach("Ocean City");
		
		blist.getBeachCount();
		
		blist.findBeach("Ocean City");
		
		blist.removeBeach();
		
		blist.showAllBeaches();
	}
}