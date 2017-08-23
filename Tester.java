
public class Tester {
	
	public static void main (String[] args) {
		Location place1 = new Location("Northern", "Europe", "France");
		Location place2 = new Location("Southern", "Africa", "South Africa");
		People people1 = new People("Northern", "North America", "Canada", "Quebec", "8.2 million", "French");
		People people2 = new People("Southern", "South America", "Brazil", "Rio de Janiero", "6.3 million", "Portugese");
		Environment climate1 = new Environment("Northern", "North America", "America", "Plains", "Buffalo");
		Environment climate2 = new Environment("Southern", "Antartica", "Antartica", "Tundra", "Penguins");
		
		System.out.println("The country " + place1.getCountryInfo() + " is in the " + place1.getHemisphereInfo() + " Hemisphere on the continent " + place1.getContinentInfo() + ".");
		System.out.println("The country " + place2.getCountryInfo() + " is in the " + place2.getHemisphereInfo() + " Hemisphere on the continent " + place2.getContinentInfo() + ".");
		System.out.println("");
		
		System.out.println("The country " + people1.getCountryInfo() + " is in the " + people1.getHemisphereInfo() + " Hemisphere on the continent " + people1.getContinentInfo() + ".");
		System.out.println("Population: " + people1.getPopulation());
		System.out.println("Language: " + people1.getLanguage());
		System.out.println("");
		
		System.out.println("The country " + people2.getCountryInfo() + " is in the " + people2.getHemisphereInfo() + " Hemisphere on the continent " + people2.getContinentInfo() + ".");
		System.out.println("Population: " + people2.getPopulation());
		System.out.println("Language: " + people2.getLanguage());
		System.out.println("");
		
		System.out.println("The country " + climate1.getCountryInfo() + " is in the " + climate1.getHemisphereInfo() + " Hemisphere on the continent " + climate1.getContinentInfo() + ".");
		System.out.println("Environment: " + climate1.getEnv());
		System.out.println("Animal: " + climate1.getAnimal());
		System.out.println("");
		
		System.out.println("The country " + climate2.getCountryInfo() + " is in the " + climate2.getHemisphereInfo() + " Hemisphere on the continent " + climate2.getContinentInfo() + ".");
		System.out.println("Environment: " + climate2.getEnv());
		System.out.println("Animal: " + climate2.getAnimal());
		System.out.println("");
		
		people1.setLanguage("French");
		System.out.println("The people in the city of " + people1.getCity() + " can also speak " + people1.getLanguage() + ".");
		System.out.println();
		
		climate1.setAnimal("cattle");
		System.out.println("The plains of " + climate1.getCountryInfo() + " also has " + climate1.getAnimal() + ".");
		System.out.println();
	}

}
