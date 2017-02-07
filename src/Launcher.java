import fr.imie.gitn1.bdd.*;

public class Launcher {

	public static void main(String[] args) 
	{
		System.out.println("HelloWorld");
		
		Poney leBoPoney = new Poney(1,"leBoPoney",120);
		Jockey leBoJockey = new Jockey(1,"leBo","jockey",80);
		
		Poney leMochePoney = new Poney(2,"leMochePoney",60);
		Jockey leMocheJockey = new Jockey(2,"leMoche","jockey",20);
		
		Poney laLicorneMagique= new Poney(1,"laLicorneMagique",600);
		Jockey laMereMichel = new Jockey(1,"laMere","michel",195);
		
		Course lacourse = new Course(1,"24/081999");
		
		Courir course1 = new Courir(1,1,1,3);
		Courir course2 = new Courir(1,2,2,2);
		Courir course3 = new Courir(1,3,3,1);
		
		Connect connection = new Connect();
		
		connection.connect();

	}

}
