package repository;

import model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// A anotacão repository contém métodos crud

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
