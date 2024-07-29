package com.e_commerce.e_commerce.reposirories;

import com.e_commerce.e_commerce.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
     UserDetails findByLogin(String login);
}
