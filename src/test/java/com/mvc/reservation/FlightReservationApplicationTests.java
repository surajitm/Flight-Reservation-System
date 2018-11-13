package com.mvc.reservation;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mvc.reservation.model.User;
import com.mvc.reservation.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightReservationApplicationTests {

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void saveUserTest() {
		User user=new User();
		user.setFirstName("surajit");
		user.setLastName("Mishra");
		user.setEmail("surajitmishra980@gmail.com");
		user.setPassword("1234");
		userRepository.save(user);
	}

	@Test
	public void getUsers() {
		List<User> list=userRepository.findAll();
		list.forEach(user->System.out.println(user));
	}
	
}
