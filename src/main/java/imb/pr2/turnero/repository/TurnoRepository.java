package imb.pr2.turnero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import imb.pr2.turnero.entity.Paciente;
import imb.pr2.turnero.entity.Turno;

public interface TurnoRepository extends JpaRepository<Turno,Integer>{

	List<Turno> findByPaciente(Paciente paciente);
	List<Turno> findBySobreturnoTrue();
	List<Turno> findBySobreturnoFalse();
	
}
