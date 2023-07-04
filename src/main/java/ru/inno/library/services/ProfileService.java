package ru.inno.library.services;

import ru.inno.library.models.User;
import ru.inno.library.security.details.CustomUserDetails;

public interface ProfileService {
    User getCurrent(CustomUserDetails userDetails);
}