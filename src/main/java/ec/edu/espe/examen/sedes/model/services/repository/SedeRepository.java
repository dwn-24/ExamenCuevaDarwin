package ec.edu.espe.examen.sedes.model.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.examen.sedes.model.Sede;

public interface SedeRepository extends JpaRepository<Sede, String>{
    
}
