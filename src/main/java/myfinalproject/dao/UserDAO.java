package myfinalproject.dao;

import myfinalproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
    boolean existsByEmail(String email);
}
