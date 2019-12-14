package java基本思想.多态;


public class TestManegger {

	public static void main(String[] args) {
		Manegger man=new Manegger();
		Dog dog=new Dog();
		man.feeled(dog);
		
		Penguin penguin=new Penguin();
		man.feeled(penguin);
		System.out.println("========================================");
		
		man.getAnimal("狗").eat();
		
		System.out.println("=======================================");
		
		man.setAnimal(new Dog());
		System.out.println("========================================");
		man.play(new Dog());
		man.play(new Penguin());
		

	}

}
