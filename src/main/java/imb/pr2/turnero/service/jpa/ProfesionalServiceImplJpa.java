package imb.pr2.turnero.service.jpa;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import imb.pr2.turnero.entity.*;
import imb.pr2.turnero.repository.ProfesionalRepository;
import imb.pr2.turnero.service.IProfesionalService;


@Service
@Primary
public class ProfesionalServiceImplJpa implements IProfesionalService {
	
	@Autowired
	ProfesionalRepository repo;

	@Override
	public List<Profesional> buscarProfesional() {		
		return repo.findAll();

	}

	@Override
	public void guardarProfesional(Profesional profesional) {
		repo.save(profesional);
		
	}

	@Override
	public void eliminarProfesional(Integer id) {
		repo.deleteById(id);		
	}

	@Override
	public Profesional buscarProfesionalPorId(Integer id) {
		Optional<Profesional> optional = repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}		
	}

}