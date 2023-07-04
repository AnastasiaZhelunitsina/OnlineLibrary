package ru.inno.library.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.inno.library.models.User;
import ru.inno.library.repositories.UsersRepository;
import ru.inno.library.security.details.CustomUserDetails;
import ru.inno.library.services.ProfileService;

@RequiredArgsConstructor
@Service
public class ProfileServiceImpl implements ProfileService {

    private final UsersRepository usersRepository;

    @Override
    public User getCurrent(CustomUserDetails userDetails) {
        return usersRepository.findById(userDetails.getUser().getId()).orElseThrow();
    }
}
