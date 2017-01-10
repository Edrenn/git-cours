import com.sun.org.apache.xpath.internal.operations.Bool;


public class Poney 
{
	String Name;
	String jockeyName;
	String carburant;
	String marque;
	int age;
	int victoire;
	int défaite;
	int nbCompetitions;
	int nbPattes;
	int nbDents;
	int maxSpeed;
	int maxFlyingSpeed;
	double matricule;
	double nbPoilsCriniere;
	Bool isCheval;
	Bool isBool;

	public String getName(){
		return this.Name;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	
}
