package ua.edu.ucu.demo.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface UserRepository extends JpaRepository<AppUsser, Integer> {
    @Query("SELECT u FROM AppUsser u WHERE u.email = ?1")
    Optional<AppUsser> findAppUsserByEmail(String email);
}
