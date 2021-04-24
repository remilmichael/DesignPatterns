
public class Client {
	public static void main(String[] args) {
		PrototypeFactory factory = 
				new PrototypeFactory();
		
		Dog dogMaster = new Dog();
		
		Dog dogClone = (Dog) factory.getClone(dogMaster);
		
		System.out.println(dogClone.hashCode());
		System.out.println(dogMaster.hashCode());
	}
}
