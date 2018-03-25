package projetoweb.testesimples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoweb.testesimples.model.Convidado;

public interface RepositoryConvidados extends JpaRepository<Convidado, Long>{

}
