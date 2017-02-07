import java.sql.Date;


public class Course {

	int id;
	String date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public Course(int newId, String newDate)
	{
		setId(newId);
		setDate(newDate);
	}
}
