package app.servie;

import java.util.List;
import java.util.Optional;

import app.model.Register;

public interface RegisterService {
	Register save(Register register);
	Register update(Register register);
	void delete(Long id);
	Optional<Register> get(Long id);
	List<Register> list ();	
}
