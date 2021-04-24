
public class Dog implements Animal, Cloneable{

	@Override
	public Animal makeClone() {
		Dog dog = null;
		try {
			dog = (Dog) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return dog;
	}

}
