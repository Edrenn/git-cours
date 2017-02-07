
public class Courir {

	int idCourse;
	int idPoney;
	int idJockey;
	int rank;
	
	public int getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}
	public int getIdPoney() {
		return idPoney;
	}
	public void setIdPoney(int idPoney) {
		this.idPoney = idPoney;
	}
	public int getIdJockey() {
		return idJockey;
	}
	public void setIdJockey(int idJockey) {
		this.idJockey = idJockey;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public Courir(int newIdCourse,int newIdPoney,int newIdJockey,int newRank)
	{
		setIdCourse(newIdCourse);
		setIdPoney(newIdPoney);
		setIdJockey(newIdJockey);
		setRank(newRank);
	}
}
