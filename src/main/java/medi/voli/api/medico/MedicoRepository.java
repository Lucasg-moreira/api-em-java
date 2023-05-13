package medi.voli.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

import medi.voli.api.controller.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{
    
}
