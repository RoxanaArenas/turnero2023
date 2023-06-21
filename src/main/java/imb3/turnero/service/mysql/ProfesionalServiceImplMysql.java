package imb3.turnero.service.mysql;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import imb3.turnero.entity.*;
import imb3.turnero.repository.ProfesionalRepository;
import imb3.turnero.service.IProfesionalService;


@Service
@Primary
public class ProfesionalServiceImplMysql implements IProfesionalService {
	
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