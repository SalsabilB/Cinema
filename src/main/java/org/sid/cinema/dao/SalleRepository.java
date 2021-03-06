package org.sid.cinema.dao;

import org.sid.cinema.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource
@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface SalleRepository extends JpaRepository<Salle, Long> {

    List<Salle> findByCinemaId(Long id);

}
