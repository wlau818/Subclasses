
public class Location {
	
	private String hemisphere;
	private String continent;	
	private String country;
	
	public Location(String sphere, String cont, String count) {
		hemisphere = sphere;
		continent = cont;
		country = count;
	}
	
	public String getHemisphereInfo() {
		return hemisphere;
	}
	
	public String getContinentInfo() {
		return continent;
	}
	
	public String getCountryInfo() {
		return country;
	}
	
}
