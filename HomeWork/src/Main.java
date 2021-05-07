
public class Main {

	public static void main(String[] args) {
		Category category1 = new Category(1,"programlama");
		Category category2 = new Category(2,"robotik kodlama");
		
		Category[] category = {category1,category2};
		
		for (Category c: category) {
			System.out.println(c.name);
			
		}
		Instructor instructor1= new Instructor();
		instructor1.id=1;
		instructor1.name="Engin";
		
		Instructor instructor2= new Instructor();
		instructor1.id=2;
		instructor1.name="Murat";
		
		
		
		
		
		

	}

}
