package com.example.springboothibernateoneonemapping;

import com.example.springboothibernateoneonemapping.entity.Gender;
import com.example.springboothibernateoneonemapping.entity.User;
import com.example.springboothibernateoneonemapping.entity.UserProfile;
import com.example.springboothibernateoneonemapping.repository.UserProfileRepository;
import com.example.springboothibernateoneonemapping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringbootHibernateOneOneMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneOneMappingApplication.class, args);

	}

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public void run(String... args) throws Exception {

		User user =new User();
		user.setName("raj");
		user.setEmail("raj@gmail.com");
		user.setId(34l);

		UserProfile userProfile =new UserProfile();
		userProfile.setAddress("rajdt");
		userProfile.setBirthOfDate(LocalDate.of(1999,9,11));
		userProfile.setGender(Gender.MALE);
		userProfile.setPhoneNumber("123456");

		user.setUserProfile((userProfile));
		userProfile.setUser(user);

		userRepository.save(user);

	}
}
