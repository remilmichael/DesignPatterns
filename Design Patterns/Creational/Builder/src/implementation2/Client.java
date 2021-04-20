package implementation2;

import java.time.LocalDate;
import implementation2.UserDTO.UserDTOBuilder;

public class Client {

	public static void main(String[] args) {
		User user = createUser();
		
		UserDTO dto = directBuild(UserDTO.getBuilder(), user);
		System.out.println(dto);
	}
	
	// director is normally implemented as a function
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder
				.withFirstName(user.getFirstName())
				.withLastName(user.getLastName())
				.withBirthDay(user.getBirthday())
				.withAddress(user.getAddress())
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
