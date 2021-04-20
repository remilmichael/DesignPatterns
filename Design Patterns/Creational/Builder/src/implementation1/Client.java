package implementation1;
import java.time.LocalDate;

public class Client {
	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		UserDTO dto = directBuild(builder, user);
		System.out.println(dto);
	}
	
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder
			.withFirstName(user.getFirstName())
			.withLastName(user.getLastName())
			.withAddress(user.getAddress())
			.withBirthday(user.getBirthday())
			.build();
	}
	
	private static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1995, 4, 6));
		user.setFirstName("Jame");
		user.setLastName("Martin");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("Second St");
		address.setCity("London");
		address.setState("Ontario");
		address.setZipcode("N52 LT2");
		return user;
	}
}
