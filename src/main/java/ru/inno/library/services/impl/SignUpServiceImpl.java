package ru.inno.library.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.inno.library.dto.UserForm;
import ru.inno.library.models.User;
import ru.inno.library.repositories.UsersRepository;
import ru.inno.library.services.SignUpService;

@RequiredArgsConstructor
@Service
public class SignUpServiceImpl implements SignUpService {

    private final UsersRepository usersRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public void signUp(UserForm userForm) {
        User newUser = User.builder()
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .email(userForm.getEmail())
                .password(passwordEncoder.encode(userForm.getPassword()))
                .state(User.State.CONFIRMED)
                .role(User.Role.USER)
                .age(0)
                .build();

        usersRepository.save(newUser);
    }
}