package app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.model.Register;

@Repository
public interface ResgisterRepository extends JpaRepository<Register, Long> {

	Optional<Register> findById(Long id);
		
}
