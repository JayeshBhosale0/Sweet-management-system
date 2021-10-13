package sweetshopmanagementsystem;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
public class Application {
	public static void main(String args[]) {
		System.out.println("welcome to sweet management system");
		Jalebi jalebi = new Jalebi();
		jalebi.id = "J001";
		jalebi.price= 20;
		Laddu laddu = new Laddu();
		laddu.id = "L001";
		laddu.price = 30;
		Modak modak = new Modak();
		modak.id = "M001";
		modak.price = 40;
		Rasgulla rasgulla = new Rasgulla();
		rasgulla.id = "R001";
		rasgulla.price = 50;
		Shrikhand shrikhand = new Shrikhand();
		shrikhand.id = "S001";
		shrikhand.price = 60; 
		
		SweetRepository sweetRepository = new SweetRepository();
		sweetRepository.add(jalebi);
		sweetRepository.add(laddu);
		sweetRepository.add(modak);
		sweetRepository.add(rasgulla);
		sweetRepository.add(jalebi);
		
		UserInterface UserInterface = new UserInterface();
		Set sweetList = sweetRepository.getSweetList(); 
		
		UserInterface.print(sweetList);
		sweetRepository.delete(jalebi);
		sweetRepository.delete(shrikhand);
		System.out.println("printing after remove the sweet");
		UserInterface.print(sweetList);
				
	}
}
