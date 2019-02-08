package app.servie.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.Register;
import app.repository.ResgisterRepository;
import app.servie.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private ResgisterRepository repository;
	
	@Override
	public Register save(Register register) {
		return repository.save(register);
	}

	@Override
	public Register update(Register register) {
		return repository.saveAndFlush(register);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<Register> get(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Register> list() {
		return repository.findAll();
	}

}
