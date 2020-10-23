package com.gingerbread.coder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.gingerbread.coder.domain.User;
import com.gingerbread.coder.repository.UserRepository;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testFindByEmail() {
		Optional<User> user = userRepository.findПожалуйстаByEmailIgnoreCase("episarenko@croc.ru");
		assertThat(user).isNotEmpty();
	}
}
