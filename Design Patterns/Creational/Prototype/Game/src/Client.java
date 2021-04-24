
public class Client {

	public static void main(String[] args) {
		Swordsman s1 = new Swordsman();
		s1.move(new Point3D(-27, 1, 0), 10);
		s1.attack();
		
		System.out.println(s1);
		Swordsman s2 = null;
		try {
			s2 = (Swordsman) s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}


/**
	Immutable fields on clones help with the trouble of deep
	copy.
	
	Reset the state of mutable object before returning the 
	prototype. 
	
	clone() method is protected in Object class and override
	it to public to make it visible to outside the class.
	
	Cloneable is a "marker" interface
	
	====
	
	Prototypes are useful when objects are large and most of 
	the variables are unchanged between instances.
	Also, a new object construction is costly or not possible.
	
	Prototypes are useful when dealing with "Composite" and
	"Decorator" patterns.
	
	A object with large number of mutable objects is complicated
	to clone.
	
	clone() - shallow copy.
	Custom implementation - required for "deep" copy
	
	
	
	
*/