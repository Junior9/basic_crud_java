package app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.Register;
import app.servie.RegisterService;

@RestController
@RequestMapping("api/register")
public class RegisterController {

	@Autowired
	private RegisterService service;
	
	@PostMapping("/save")
	public Register save(@RequestBody Register register) {
		return service.save(register);
	}
	
	@PutMapping("/update")
	public Register update(@RequestBody Register register) {
		return service.update(register);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Register> get(@PathVariable(name="id") Long id) {
		return service.get(id);
	}
	
	@GetMapping("/list")
	public List<Register> list(){
		return service.list();
	}
}
