

public class Jockey 
{
	int id;
	String firstName;
	String lastName;
	int weight;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Jockey(int newId, String newFirstName, String newLastName, int newWeight) {
		setId(id);
		setFirstName(newFirstName);
		setLastName(newLastName);
		setWeight(newWeight);
	}
	
}
