package ch.fhnw.webec.repository;

import ch.fhnw.webec.entity.Book;
import ch.fhnw.webec.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(Long id);
    List<User> findAllByOrderByUsernameAsc();
}
