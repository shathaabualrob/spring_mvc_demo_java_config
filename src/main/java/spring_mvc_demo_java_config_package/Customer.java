package spring_mvc_demo_java_config_package;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import spring_mvc_demo_java_config_package_validation.CourseCode;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="is requeried")
	@Size(min=1, message="is requried")
	private String lastName;
	
	@NotNull(message="is requeried")
	@Min(value=0, message="Must be more than 0")
	@Max(value=10, message="Must be less than 10")
	private Integer freePasses;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message="only 5 charater/digits")
	private String postalCode;
	
	@CourseCode(value={"LUV","TOPS"}, message="must start with LUV or TOPS")
	private String courseCode;
	
	
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
	
	
}
