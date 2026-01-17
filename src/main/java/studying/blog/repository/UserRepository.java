package studying.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studying.blog.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User>findByEmail(String email);
}
