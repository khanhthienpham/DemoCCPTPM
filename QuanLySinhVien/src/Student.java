
public class Student {
	private String Name;
	private String ID;
	private String Password;
	
	public Student(String Name,String ID, String Password) {
		this.Name = Name;
		this.ID = ID;
		this.Password = Password;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public void setPassword(String Password) {
		this.Password = Password;
	}
}