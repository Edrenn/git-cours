import java.sql.Date;


public class Course {

	int id;
	Date date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Course(int newId, Date newDate)
	{
		setId(newId);
		setDate(newDate);
	}
}
