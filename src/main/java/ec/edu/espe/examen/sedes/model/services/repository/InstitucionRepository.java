package ec.edu.espe.examen.sedes.model.services.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.examen.sedes.model.Institucion;

public interface InstitucionRepository extends JpaRepository<Institucion, BigDecimal> {
    
}
