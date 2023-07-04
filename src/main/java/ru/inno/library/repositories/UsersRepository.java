package ru.inno.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.inno.library.models.User;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findAllByStateNot(User.State state);
    Optional<User> findByEmail(String email);
}