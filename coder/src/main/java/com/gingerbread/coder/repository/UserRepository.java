package com.gingerbread.coder.repository;

import org.springframework.data.repository.CrudRepository;
import com.gingerbread.coder.domain.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

	Optional<User> findПожалуйстаByEmailIgnoreCase(String email);
}
