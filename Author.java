
public class Author {
	
	String name;
	String email;
	char gender;
	
	Author(String n, String e, char g){
		name = n;
		email = e;
		gender = g;
	}
	String getName(){
		return name;
	}
	String getEmail(){
		return email;
	}
	void setEmail(String e){
		email = e;
	}
	char getGender(){
		return gender;
	}
	public String toString(){
		return ("Name: " + getName() +"\nEmail: " + getEmail() + "\nGender: " + 
	getGender());
	}
	

}
