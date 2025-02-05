package day_5;

import java.util.Optional;

interface UserService{
	default String getWelcomeMessage() {
		return "Welcome, Guest!";
	}
	
	Optional<String> getUser(String name);
}
class UserSerivceImpl implements UserService{
	@Override
	public Optional<String> getUser(String name){
		return Optional.ofNullable(name);
	}
	
	public String getPersonalizedWelcome(String name) {
		return getUser(name)
				.map(userName->"Welcome, "+userName+"!")
				.orElse(getWelcomeMessage());
	}
}

public class InterfaceUserServiceQ3 {

	public static void main(String[] args) {
		
		UserSerivceImpl userService = new UserSerivceImpl();
		System.out.println(userService.getPersonalizedWelcome("Yuggu"));
		System.out.println(userService.getPersonalizedWelcome(null));
		System.out.println(userService.getPersonalizedWelcome(""));
		
		
		

	}

}
