
public class People extends Location {
	
	private String city;
	private String population;
	private String language;
	
	public People(String sphere, String cont, String count, String cit, String pop, String lang) {
		super(sphere, cont, count);
		city = cit;
		population = pop;
		language = lang;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getPopulation() {
		return population;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setCity(String town) {
		city = town;
	}
	
	public void setPopulation(String num) {
		population = num;
	}
	
	public void setLanguage(String lan) {
		language = lan;
	}

}
