package imb.pr2.turnero.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import imb.pr2.turnero.entity.Turno;
import imb.pr2.turnero.repository.TurnoRepository;
import imb.pr2.turnero.service.ITurnoService;
import imb.pr2.turnero.entity.Paciente;

@Service
@Primary
public class TurnoServiceImplJpa implements ITurnoService{

	@Autowired
	TurnoRepository repo;

	@Override
	public List<Turno> buscarTodos() {		
		return repo.findAll();
	}
	
	@Override
	public Turno buscarPorId(Integer id) {
        return repo.findById(id).orElse(null);
    }	

	@Override
	public Turno guardar(Turno turno) {
		return repo.save(turno);
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);		
	}

	@Override
	public boolean existe(Integer id) {
	    return (id == null) ? false: repo.existsById(id);
	}

	@Override
	public List<Turno> buscarPorPaciente(Paciente paciente) {
        return repo.findByPaciente(paciente);
	}

	@Override
	public List<Turno> buscarTieneSobreturno() {
		return repo.findBySobreturnoTrue();
	}

	@Override
	public List<Turno> buscarSinSobreturno() {
		return repo.findBySobreturnoFalse();
	}

}
