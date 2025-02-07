package com.example.restfulwebservicesj17.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	// JPA / Hibernate to talk to database
	
	private static Integer userCount = 0;
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(++userCount, "Adam", LocalDate.now().minusYears(20)));
		users.add(new User(++userCount, "Steve", LocalDate.now().minusYears(25)));
		users.add(new User(++userCount, "Jim", LocalDate.now().minusYears(20)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public User saveUser(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public void deleteById(Integer id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		 users.removeIf(predicate);
	}
	
}
