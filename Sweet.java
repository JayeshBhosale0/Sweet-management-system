package sweetshopmanagementsystem;

public class Sweet {
	enum Colour{
		RED, WHITE,YELLOW,BROWN;
	}
	enum Category{
		SUGAR, GHEE,JAGERRY,SUGARLESS,MILK;
	}
	String name;
	Colour colour;
	Category category;
	String id ;
	int price;
	@Override
	public String toString() {
		return "Sweet [name=" + name + ", Category=" + colour + ", category=" + category + ", id=" + id + ", price="
				+ price + "]";
	}	
}
