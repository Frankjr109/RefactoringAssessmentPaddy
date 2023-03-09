/*
 * Person class has been created in order to reduce
 * the amount of parameters in the Employee class.
 * An employee is essentially a person therefore it would make sense
 * to create an object of a person.
 */
public class Person {

	private String pps;
	private String firstname;
	private String surname;
	private char gender;
	
	public Person() {
		
	}
	
	public Person(String pps, String firstname, String surname, char gender) {
		this.pps = pps;
		this.firstname = firstname;
		this.surname = surname;
		this.gender = gender;
	}

	public String getPps() {
		return pps;
	}

	public void setPps(String pps) {
		this.pps = pps;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
