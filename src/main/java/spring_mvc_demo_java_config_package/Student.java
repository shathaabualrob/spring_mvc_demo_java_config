package spring_mvc_demo_java_config_package;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
//import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private String operatingSystems;
	
	
	
	public Student() {
		//populate options
//		try {
//			File file = new File("C:/Users/Lenovo/eclipse-workspace/spring_demo_annotations/src/springDemoPackage/fortunes.txt");
//			
//			Scanner reader = new Scanner(file);
//			while(reader.hasNextLine()) {
//				String line = reader.nextLine();
//				fortunes.add(line);
//			}
//			reader.close();
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("File Error occured.");
//			e.printStackTrace();
//		}
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("PS", "Palestine");
		
		
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
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public String getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}
